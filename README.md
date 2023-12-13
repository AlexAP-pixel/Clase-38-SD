# Clase-38-SD
Descripción del ejercicio:
Ahora modifique el cliente HTTP asíncrono y el servidor HTTP, para que el cliente envíe el objeto Demo de Test.java hacia el servidor dentro del endpoint /task. El cliente debe imprimir el contenido del objeto (como cadenas) antes de ser enviado y el servidor debe imprimir el contenido del objeto al ser recibido.

Como ejecuarlo:
1. javac -d ../classes *.java      
2. jar cf Application.jar Application.class Aggregator.class networking/WebClient.class Demo.class SerializationUtils.class
3. java WebServer 8081
3. java -cp Application.jar Application      
