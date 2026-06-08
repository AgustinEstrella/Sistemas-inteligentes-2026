import time
from google.genai.errors import APIError


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
            return True

        except APIError as e:
            if e.code == 429:
                espera = 2 ** intento
                print("[Aviso] Límite de cuota excedido (Rate Limit). Reintentando en {espera} segundos... (Intento {intento + 1}/{intentos})")
                time.sleep(espera)
            elif e.code in [500, 503, 504]:
                espera = 2 ** intento
                print(f"[Aviso] Problemas en los servidores de Google (Timeout/Unavailable). Reintentando en {espera}s... (Intento {intento + 1}/{intentos})")
                time.sleep(espera)
            else:
        # Errores del cliente (ej. 400 Bad Request) que no se solucionan reintentando
                print(f"\n Error de API {e.code}: {e.message}")
                return
        except (ConnectionError, TimeoutError):
            espera = 2 ** intento
            print(f" Problema de conexión a internet o Timeout de red. Reintentando en {espera} segundos. (Intento {intento + 1}/{intentos})")
            time.sleep(espera)
        except Exception as e:
            print("Error inesperado: " , e)
            return False
