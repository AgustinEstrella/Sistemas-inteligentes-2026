import time
from google.genai.errors import APIError
import yfinance as yf
import requests


def validador(prompt):
    if prompt.strip() != "":
        return True
    else:
        print ("El ingreso no puede estar vacio!")
        return False

def quiereSalir(prompt):
    if prompt.lower() == "/salir" or prompt == "/quit" or prompt == "/exit":
        return True
    else:
        return False

def quiereLimpiar(prompt):
    if prompt.lower() == "/limpiar":
        return True
    else:
        return False

def generarRespuesta(sesion_chat, prompt, intentos= 3):
    print("----------GENERANDO RESPUESTA----------")
    for intento in range(intentos):
        try:
            respuesta = sesion_chat.send_message(prompt)
            print("\n", respuesta.text)
            print("\n")
            return True

        except APIError as e:
            if e.code == 429:
                espera = 2 ** intento
                print("[Aviso] Límite de cuota excedido (Rate Limit). Reintentando en {espera} segundos... (Intento" , ((intento + 1)/(intentos)))
                time.sleep(espera)
            elif e.code in [500, 503, 504]:
                espera = 2 ** intento
                print(f"[Aviso] Problemas en los servidores de Google (Timeout/Unavailable). Reintentando en ", espera, "s... (Intento " ,((intento + 1)/(intentos)))
                time.sleep(espera)
            else:
        # Errores del cliente (ej. 400 Bad Request) que no se solucionan reintentando
                print(f"\n Error de API " ,e.code, e.message)
                return
        except (ConnectionError, TimeoutError):
            espera = 2 ** intento
            print(f" Problema de conexión a internet o Timeout de red. Reintentando en {espera} segundos. (Intento " , intento + 1)
            time.sleep(espera)
        except Exception as e:
            print("Error inesperado: " , e)
            return False


def cotizadorDivisas(moneda: str):
    """
    Obtiene la cotización actual de una moneda respecto al peso argentino (ARS) usando DolarAPI.
    Soporta los siguientes valores para moneda: 'dolar', 'euro', 'real', 'clp' (peso chileno), 'uyu' (peso uruguayo).
    """
    moneda = moneda.lower().strip()

    try:
        if moneda in ["dolar", "usd"]:
            url = "https://dolarapi.com/v1/dolares"
        elif moneda in ["euro", "eur"]:
            url = "https://dolarapi.com/v1/cotizaciones/eur"
        elif moneda in ["real", "brl"]:
            url = "https://dolarapi.com/v1/cotizaciones/brl"
        elif moneda in ["peso chileno", "clp"]:
            url = "https://dolarapi.com/v1/cotizaciones/clp"
        elif moneda in ["peso uruguayo", "uyu"]:
            url = "https://dolarapi.com/v1/cotizaciones/uyu"
        else:
            return f"No tengo soporte en DolarAPI para la moneda: {moneda}."

        response = requests.get(url)
        response.raise_for_status()
        data = response.json()

        # DolarAPI devuelve una lista si pedimos "dolares" (oficial, blue, mep, etc.)
        if isinstance(data, list):
            resultados = []
            for d in data:
                resultados.append(f"{d['nombre']}: Compra ${d['compra']} / Venta ${d['venta']}")
            return " | ".join(resultados)

        # Para las demás monedas devuelve un diccionario único
        else:
            return f"{data['nombre']}: Compra ${data['compra']} / Venta ${data['venta']} (Actualizado: {data['fechaActualizacion']})"

    except Exception as e:
        return f"Error interno al consultar DolarAPI: {str(e)}"

def precioAcciones(ticker: str) -> str:
    """
    Obtiene el precio de cierre más reciente y la moneda de cotización de una empresa en la bolsa de valores utilizando su ticker de mercado (ejemplos: 'AAPL' para Apple, 'MSFT' para Microsoft, 'YPF' para YPF).
    """
    ticker = ticker.upper().strip()

    try:
        empresa = yf.Ticker(ticker)
        # Solicita el historial del último día para extraer el cierre más reciente
        historial = empresa.history(period="1d")

        if historial.empty:
            return f"No se hallaron datos de mercado para el activo con ticker: " ,ticker

        precio_cierre = historial['Close'].iloc[-1]
        info = empresa.info
        moneda = info.get('currency', 'USD')
        nombre_legal = info.get('longName', ticker)

        return f"Activo: {nombre_legal} ({ticker}) | Último precio de cierre: {precio_cierre:.2f} {moneda}"

    except Exception as e:
        return f"Error interno al consultar Yahoo Finance para el ticker {ticker}: {str(e)}"