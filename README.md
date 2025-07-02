# Conversor de Monedas

Este proyecto es un conversor de monedas desarrollado en Java. A continuación se explica qué librerías utiliza, cómo está estructurado y cómo se ejecuta.

## Librerías usadas

- **Gson** (`com.google.gson`): Para parseo y manejo de datos JSON.
- **Dotenv** (`io.github.cdimascio.dotenv`): Para la gestión de variables de entorno, como la clave de la API.
- **Java Standard Library**: Uso de clases estándar como `Scanner`, `HttpClient`, `HttpRequest`, `HttpResponse`, `ArrayList`, `Map`, etc.

## Estructura del proyecto

La estructura principal del proyecto es la siguiente:

- `src/Main.java`: Punto de entrada, ejecuta la aplicación.
- `src/com/alulara/interfaces/SolicitudUsuario.java`: Maneja la interacción con el usuario y menú principal.
- `src/com/alulara/modules/ConversorMoneda.java`: Lógica de conversión y listado de monedas.
- `src/com/alulara/modules/Api.java`: Encapsula las llamadas HTTP a la API de tasas de cambio y el manejo de la clave de API.
- `src/com/alulara/modules/ApiData.java`: Procesa los datos recibidos de la API.

## Ejecución

1. Asegúrate de tener las dependencias (Gson y Dotenv) disponibles en tu classpath.
2. Coloca tu archivo `.env` (con la variable `API_KEY`) en la carpeta `src/com/alulara/modules/`.
3. Compila el proyecto desde el directorio raíz:
   ```bash
   javac -cp "ruta/a/gson.jar:ruta/a/dotenv.jar" src/Main.java
   ```
   Reemplaza `"ruta/a/gson.jar"` y `"ruta/a/dotenv.jar"` por el path real de tus librerías.
4. Ejecuta la aplicación:
   ```bash
   java -cp "src:ruta/a/gson.jar:ruta/a/dotenv.jar" Main
   ```

> El programa se ejecuta en la terminal (Consola/CLI).
