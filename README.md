# Nisum-Java
Evaluación: JAVA

CONTEXTO
El ejercicio consiste en crear una Api Rest full para gestionar la creación de usuarios.

PRE-REQUISITOS
- Tener instalado el JDK 1.8
- Haber instalado Gradle
- Tener instalado un cliente http, por lo general se utiliza Postman

PRUEBAS
- Descargar fuentes del siguiente repositorio: https://github.com/MarceloAlarcon312/Nisum-Java
- Desde la base del proyecto, compile utilizando el comando "gradle build", se creará un archivo JAR ejecutable
- Una vez compilado el proyecto se debe iniciar la api con el comando "gradle bootRun", esta iniciara la Api y quedará disponible en el puerto 8080
- Terminado los tres procesos anteriores se iniciara la api, podemos realizar peticiones a través de un cliente HTTP, en mi caso utilice Postman con las siguientes direcciones:

- localhost:8080//auth/v1/register y seleccionar el método POST
- Se debe insertar dentro de la pestaña Body (además de seleccionar la opción raw y lenguaje JSON) la petición del usuario a registrar , se adjunta imagen de referencia.

![Peticion Postman](https://github.com/MarceloAlarcon312/Nisum-Java/assets/143012932/34f7d25c-b1dc-43ad-b1cd-8da326a304fa)


