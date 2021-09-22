# APIResuelveFC
Esta API está diseñada para calcular el salarios de los jugadores del equipo Resuelve FC respecto a su tabulador y el salario de otros equipos estableciendo el tabulador de entrada.

Esta creada con ayuda de swagger para una mejor interacción y se accesa entrando a http://localhost:8080/swagger-ui.html#/

## Creación del .war
Para crear el archivo war se debe ejecutar el siguiente comando en la terminal -> ***java -jar target/ResuelveFC-0.0.1-SNAPSHOT.war***

## Correr la API
Al clonar el repositorio se deben instalar las dependencias con ***mvn install*** y después se ejecuta el siguiente comando para correr la API y poder usarla:
***mvn clean spring-boot:run***


## Uso de la API
En esta API podemos observar que hay dos entpoint, uno para calcular los salarios del Equipo Resuelve FC y el otro para cualquier otro equipo
<img width="1655" alt="Screen Shot 2021-09-22 at 3 30 30 p m" src="https://user-images.githubusercontent.com/9301955/134417340-2f1bf187-f181-4e3f-90f0-abc4d16842a0.png">

Una vez seleccionada la opción deseada para calcular se da click en el botón **Try it now** y te mostrará el json de referencia que se debe mandar.
<img width="1351" alt="Screen Shot 2021-09-22 at 3 32 02 p m" src="https://user-images.githubusercontent.com/9301955/134417498-ce6b1998-1925-45f4-97ab-ea2cf74a5fc9.png">

A continuación se le da execute y podemos ver los resultados de la respuesta
<img width="1342" alt="Screen Shot 2021-09-22 at 3 32 12 p m" src="https://user-images.githubusercontent.com/9301955/134417533-474db8aa-029e-413f-942d-13c9ac40041a.png">

