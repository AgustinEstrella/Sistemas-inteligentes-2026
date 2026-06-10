# Asistente Financiero Académico

Este es un asistente de consola interactivo optimizado para análisis financiero y económico académico. Está desarrollado en Python utilizando el SDK oficial moderno de Google GenAI (`google-genai`).

El proyecto cuenta con una arquitectura modular, persistencia de memoria (historial de conversación) y un sistema robusto de tolerancia a fallos con reintentos exponenciales ante saturación de la API (errores 429), caídas de red local o indisponibilidad del servidor.

## Características Principales

* **Memoria de Sesión Completa:** Preserva el contexto de la conversación utilizando el gestor de chats nativo del SDK de Google.
* **Manejo de Errores Avanzado:** Recuperación automática ante límites de cuota (*Rate Limits*), microcortes de conexión a Internet y timeouts de red sin cerrar la aplicación de manera abrupta.
* **Comandos de Consola:** Control de flujo mediante comandos específicos (`/limpiar` y `/salir`).
* **Instrucciones del Sistema Estrictas:** Configurado para actuar bajo un rol puramente analítico, formal y neutro.

## Estructura del Proyecto

El código está organizado de la siguiente manera:

* `agente.py`: Script principal que inicializa el cliente de la API, configura la sesión de chat y controla el bucle central de interacción con el usuario.
* `functions.py`: Módulo de funciones de utilidad que procesa las validaciones de entrada, detecta comandos de control y encapsula la lógica de reintentos con manejo de excepciones.
* `config.py`: Archivo de configuración centralizado para definir el modelo (`gemini-3.5-flash`) y las directrices del `SYSTEM_PROMPT`.
* `.env`: Archivo de entorno seguro para almacenar las credenciales y llaves de acceso de la API (no debe subirse al control de versiones).

---

## Instalación y Requisitos

Sigue estos pasos para poner en marcha el proyecto en tu entorno local.

### 1. Prerrequisitos
* Python 3.10 o superior instalado en el sistema.
* Una cuenta en Google AI Studio para obtener una API Key.

### 2. Clonar o descargar el proyecto
Crea un directorio local con los archivos correspondientes: `agente.py`, `functions.py` y `config.py`. o clona el repositorio completo

### 3. Crear y activar un entorno virtual
En tu terminal, navega hasta la carpeta del proyecto y ejecuta:

```bash
python -m venv venv
venv\Scripts\activate
```

### 4. Instalar las dependencias
Con el entorno virtual activado, instala las librerías requeridas:

```bash
pip install -r requirements.txt
```

### 5. Configurar las variables de entorno
1. Crea un archivo `.env` en la raíz del proyecto
2. Agrega tu API Key de Google: GOOGLE_API_KEY = tu_api_key_aqui


Obtén tu API Key desde [Google AI Studio](https://aistudio.google.com/app/apikey)

---

## Uso

### Ejecutar el asistente

```bash
python agente.py
```