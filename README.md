Práctica: PJXAact1_t4 - Despliegue de Aplicación Spring Boot en VPS

Datos de Identificación:
- Alumna: Xana Amalinalli Pérez Jiménez
- No. de Control: 23161091
- Carrera: Ingeniería en Sistemas Computacionales
- Institución: Instituto Tecnológico de Oaxaca

Información del Despliegue en Servidor (DigitalOcean):
- Nombre del Droplet: ubuntu-hanna
- Dirección IP Pública: 167.71.180.74
- Puerto: 8080
- Repositorio de GitHub: https://github.com/HannHanna/PJXAact1_t4
- URL de la API: http://167.71.180.74:8080/api/identificacion

Cuestionario de la Práctica:

1. ¿Qué es un @Controller o @RestController en Spring Boot, y qué diferencia hay entre ambos?
Ambas son anotaciones utilizadas en clases para gestionar las solicitudes HTTP dentro de la aplicación. La diferencia fundamental radica en que @Controller se emplea tradicionalmente para devolver vistas o interfaces visuales (como páginas HTML), mientras que @RestController combina la funcionalidad de @Controller y @ResponseBody para retornar datos directamente en formato JSON o texto plano, lo cual resulta idóneo para el desarrollo de APIs.

2. ¿Qué anotación se usa para mapear una petición GET a un método, y cómo se le indica la ruta (endpoint)?
Se utiliza la anotación @GetMapping colocada inmediatamente sobre el método correspondiente. La ruta o endpoint se especifica asignándola como un valor de tipo cadena de texto dentro de los paréntesis de dicha anotación.

3. ¿Qué puerto usaste en tu VPS y por qué tuviste que definirlo manualmente en vez de dejar el que viene por defecto?
Se utilizó el puerto 8080. Fue necesario configurarlo de manera manual para evitar conflictos y asegurar el funcionamiento correcto de la aplicación en el servidor virtual, previniendo que chocara con otros servicios activos que ya estuvieran utilizando el puerto predeterminado.
