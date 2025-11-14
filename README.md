Conversor de Monedas en Java

Este proyecto es una aplicación de consola desarrollada en Java que permite convertir diferentes monedas utilizando datos en tiempo real obtenidos de la API pública ExchangeRate-API.

El usuario puede seleccionar una moneda base y obtener su valor equivalente en otra moneda utilizando las tasas más recientes proporcionadas por la API.

Características

- Conversión de monedas en tiempo real
- Menú interactivo por consola
- Consumidor de API usando HttpClient
- Manejo de JSON con Gson

Tecnologías Usadas

Java 17+

HttpClient (Java 11+)

Gson para parsear JSON

ExchangeRate-API (versión gratuita)

 Cómo funciona

- El usuario elige una opción del menú (ej. COP → USD).

-La app envía una petición a: https://v6.exchangerate-api.com/v6/TU_API_KEY/latest/{MONEDA_BASE}

- La API responde con un JSON que contiene todas las tasas de conversión.

- El programa calcula la conversión usando conversion_rates.

- Se muestra el resultado por consola.
