![Java](https://img.shields.io/badge/java-%23FF0000.svg?style=for-the-badge&logo=java&logoColor=white)

# Challenge Alura ONE - Conversor de Divisas
Este es un proyecto de consola desarrollado en Java que permite realizar conversiones de divisas en tiempo real utilizando la API de ExchangeRate. El proyecto aplica conceptos modernos de Java como Records, Inmutabilidad, y manejo de peticiones HTTP.

# Tecnologías
Tecnologías Utilizadas
Java 17+: Uso de Records y HttpClient nativo.
Gson (Google): Librería para la deserialización de JSON a objetos Java.
ExchangeRate-API: Fuente de datos para las tasas de cambio.

## **Características**
- **Conexión con API Externa:** Consulta en tiempo real al endpoint de ExchangeRate-API para obtener tasas de cambio oficiales.
- **Uso de Java Records:** Implementación de modelos de datos inmutables y limpios.
- **Arquitectura desacoplada:** Separación clara entre la lógica de red (Client), los modelos de datos (DTO/Record) y la lógica de negocio (Model).
- **Interfaz amigable por consola:** Menú interactivo con validación de entradas para evitar errores de usuario.
- **Conversión de Divisas:** Soporte para múltiples pares de monedas, incluyendo MXN, USD, EUR, GBP.
