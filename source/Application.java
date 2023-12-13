/*
 *  MIT License
 *
 *  Copyright (c) 2019 Michael Pogrebinsky - Distributed Systems & Cloud Computing with Java
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */
import java.util.Arrays;
import java.util.List;
import networking.WebClient;

public class Application {
    private static final String WORKER_ADDRESS_1 = "http://localhost:8081/task";

    public static void main(String[] args) {
        Aggregator aggregator = new Aggregator();

        Demo object = new Demo(2022, "Prueba serializacion y deserializacion");
        
        System.out.println("Se envian los siguientes datos");
        System.out.println(object.a);
        System.out.println(object.b);
        List<String> results = aggregator.sendTasksToWorkers(Arrays.asList(WORKER_ADDRESS_1),
                Arrays.asList(object));
        
        System.out.println("\nSe recibe el mesnaje de escito o error:");

        for (String result : results) {
            System.out.println(result);
        }
    }
}

/* 
import java.util.Arrays;
import java.util.List;


public class Application {
  private static final String WORKER_ADDRESS_1 = "http://localhost:8081/task"; // Dirreciones de los endpoints de los workers

    public static void main(String[] args) {

      Aggregator aggregator = new Aggregator(); // Se crea un objeto de la clase Aggregator

        Demo objecDemo = new Demo(2022, "Serializacion y deserializacion"); // Se crea un objeto de la clase Demo
        String task1 = "10,200";
        System.out.println("Se creó el objeto: ");
        System.out.print(objecDemo.a + " , ");
        System.out.println(objecDemo.b); 
        System.out.println("Se enviara el objeto a serializar a los servidores \n");


        //List<Demo> results = aggregator.sendTasksToWorkers(Arrays.asList(WORKER_ADDRESS_1), Arrays.asList(objecDemo)); // Se envian las tareas a los workers  
    }
}
*/