import os
from dotenv import load_dotenv
from google import genai
from google.genai import types

from config import MODEL, SYSTEM_PROMPT

from functions import *
load_dotenv()

llave = True
agente = genai.Client()

config_chat = types.GenerateContentConfig(system_instruction = SYSTEM_PROMPT)
sesion_chat = agente.chats.create(model = MODEL, config = config_chat)

while llave:

    while True:
        prompt  = input("Ingresa tu consulta: ").strip()

        if validador(prompt):
            break

    if quiereSalir(prompt):
        print("Gracias por su tiempo!")
        llave = False
        break
    elif quiereSalir(prompt):
        sesion_chat = agente.chats.create(model = MODEL, config = config_chat)
        print("El historial de la conversacion ha sido borrado")
    else:
        generarRespuesta(sesion_chat, prompt)