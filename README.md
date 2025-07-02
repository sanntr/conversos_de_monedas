# Conversor de Monedas

Este proyecto es un conversor de monedas desarrollado en Java.

## Librerías usadas

- **Gson** (`com.google.gson`): Para parsear y manipular datos JSON.
- **Dotenv** (`io.github.cdimascio.dotenv`): Para gestionar variables de entorno, especialmente la clave de la API de conversión de monedas.
- **Java Standard Library**: Uso de clases estándar como `Scanner`, `HttpClient`, `HttpRequest`, `HttpResponse`, `ArrayList`, `Map`, etc.

## Estructura del proyecto

- `src/Main.java`: Punto de entrada principal de la aplicación.
- `src/com/alulara/interfaces/SolicitudUsuario.java`: Maneja la interacción y el flujo principal con el usuario.
- `src/com/alulara/modules/ConversorMoneda.java`: Lógica de conversión y listado de monedas.
- `src/com/alulara/modules/Api.java`: Llamadas HTTP a la API de tasas de cambio y manejo de la clave de API.
- `src/com/alulara/modules/ApiData.java`: Procesamiento de los datos recibidos de la API.

## Ejecución

El programa se ejecuta desde el método `main` ubicado en `src/Main.java`. No requiere ejecución mediante comandos Bash específicos; simplemente abre el proyecto en tu entorno de desarrollo Java favorito (como IntelliJ IDEA, Eclipse o NetBeans), asegúrate de que las dependencias estén configuradas, y ejecuta la clase `Main`.

> Recuerda tener configurado el archivo `.env` con la variable `API_KEY` en la ruta `src/com/alulara/modules/`.
