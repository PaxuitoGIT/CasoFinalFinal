# Caso Final de los finales integrador

Link del repositorio: https://github.com/PaxuitoGIT/CasoFinalFinal

## Ejercicio 1

### 1. En relación al estado de un objeto, para preservar el principio de encapsulación:

b) Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.

### 2. Los métodos de una clase no pueden devolver objetos:

b) Falso

### 3. ¿Cuál de las siguientes características de la programación orientada a objetos está relacionada con la reutilización de código?

b) Herencia

### 4. El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de:

b) O(1)

### 5. Un algoritmo de ordenación que implemente el método de inserción se basa en la idea de ir seleccionando el número correspondiente en la lista desordenada que se va a insertar en la posición última de la lista ordenada:

b) Falso

## Ejercicio 2

### 2) Explica las diferencias entre una tabla Hash y un árbol. ¿ Cuándo conviene utilizar cada una de estas estructuras? Justifique su respuesta y analice todas las posibles operaciones a realizar por las estructuras. No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.

La tabla Hash es aquella que asocia los elementos con una ubicación, es decir, coordendas. Por ejemplo, en el juego de hundir la flota, el jugador asocia sus barcos con unas coordenadas para saber de forma rápida dónde están situados.
Por otro lado, la tabla árbol es aquella que ordena los elementos por nodos y ramas, como si fuera un árbol familiar. 
Generalmente la tabla Hash se usa cuando te da igual el orden y quieres acceder de forma rápida a los datos y sirven muy bien para manejar grandes datos. Tiene un tiempo de acceso general de O(1). En cambio, la tabla árbol se usa cuando quieres mmantener un orden y equilibrio.)

### 3) Explica las diferencias entre una pila y una cola. ¿Cuándo conviene utilizar cada una de estas estructuras? ¿Cuál es el orden de comple jidad computacional de estas estructuras? No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.

Una pila es una lista que sigue el principio de LIFO (Last in, First out) y traducidamente es que el último elemento añadido es el primero en ser eliminado y siempre es desde los extremos. 
En cambio, una cola es lo mismo pero sigue el principio de FIFO (First in, First out), que se traduce en que el primer elemento en ser añadido a la cola es el primero en ser eliminado y los elementos se añaden al final de la cola y se eliminan desde el principio de la cola.
Generalmente, las pilas se usan por ejemplo en algoritmos recursivos, mientras que las colas en cumplir órdenes de tareas.

### 4) Explica el método de ordenación denominado inserción y describe las iteraciones sobre el siguiente conjunto de datos: 50 20 84 13 22 16 89 85

El método de inserción es un algoritmo de ordenación que compara el elemento tomado de la lista original con la lista construida y los empieza a ordenar hasta que se acabe la lista. 
Es decir, teniendo en cuenta esa lista, cogeremos el primer elemento que es 50 y lo pasaremos a nuestra lista ordenada que está vacía. Ahora cogeremos el segundo elemento de la lista y lo compararemos con la lista construida y como el 20 va antes que el 50, el 20 se pone en la priemra posición.
Ahora tomaremos el tercer elemento que es el 84 y comparamos que es mayor que los dos primeros elementos, entonces se pone en la tercera posición. Seguiremos de tal forma hasta acabar así:
1. 50
2. 20 50
3. 20 50 84
4. 13, 20, 50, 84
5. 13, 20, 22, 50, 84
6. 13, 16, 20, 22, 50, 84
7. 13, 16, 20, 22, 50, 84, 89
8. 13, 16, 20, 22, 50, 84, 85, 89

### 5) Dadas dos funciones y su número de operaciones: A = 1024n B = 16n^3. Calcular a partir de qué tamaño de entrada n A es más eficiente que B

Se puede resolver de forma matemática esta siguiente ecuación si los igualamos tal que:  1024n < 16n*3; Se nos va una n y simplificamos los números tal que: n^2 < 64; si hacemos la raíz cuadrada de 64 es igual a 8.
Entonces, 1024n es más eficiente cuando n sea mayor que 8 , es decir, a partir del 9.

## Ejercicio 3

### Preguntas:

### a) ¿Qué imprime el código? En caso de que no compile indique el motivo y arregle el programa como considere conveniente. Explique su solución de manera concisa.

El código quiere calcular e imprimir el resultado de la función recursive(1, -2). Sin embargo, se produce una recursión infinita porque al llamarse a sí misma con un valor decreciente de b, b nunca cumplirá el caso cuando b sea 0 o a sea 0. 
Es decir, si b es negativo, la recursividad no acabará nunca.
Para solucionar esto, podemos manejar el caso añadiendo otra condición tal que "else if ( b < 0) { return 1 } Esto hará que si b es negativo, pase a ser un 1

### b) Explica brevemente qué cálculo está haciendo y qué tipo de recursividad está empleando.
El código repite de forma recursiva la multiplicación de a * b hasta que b sea 0 para que al final sea un a * 1 (cumplir la condición). Cuando a llegue a 0, se cumple la condición de que retorne 0 y habíamos añadido que si b es negativo, que retorne 1.
Es decir, en cuando se cumplen todas esas condiciones, la recursividad para, y si no se cumplen las condiciones la recursividad seguirá hasta cumplirlas. Es una recursividad lineal descendente

## Ejercicio 4

Si nos basamos un poco en el ejercicio anterior, el código sería de la siguiente forma:
```
public class Main {

    public static void main(String[] args) {
    
        int numero = 102;
        
        int sumaDigitos = sumarDigitos(numero);
        
        System.out.println("La suma de los dígitos de " + numero + " es: " + sumaDigitos);
        
    }
    
     public static int sumarDigitos(int numero) {
     
        if (numero == 0) {
        
            return 0;
            
        } else {
        
            // Obtenemos el último dígito del número y lo sumamos al resultado ya que queremos hallar el resto de 102 % 10 que es 2
            
            int ultimoDigito = numero % 10;
            
            // Dividimos el número por 10 para eliminar el último dígito para que en la recursividad se haga 102 / 10 y luego 10 / 10 sea 1 
            
            int numeroSinUltimoDigito = numero / 10;
            
            // Llamamos recursivamente a la función con el número sin el último dígito y se haría 2 + 1 = 3
            
            return ultimoDigito + sumarDigitos(numeroSinUltimoDigito);
            
        }
        
    }
    
}
```
Es una recursividad descendente ya que estamos llamando a la función hasta que sea igual a 0 y tiene una complejidad logarítmica de O(log n)

## Ejercicio 5

### d) Responda a las siguiente preguntas:

### ¿Deberá modificar los atributos timeline y tweets de la clase UserAccount (definida en el ejercicio 1) para que contenga elementos de la clase hija Retweet? Justifique su razonamiento y, si cree que hay que modificarlos, explique también cómo lo haría.

Sí, es recomendable modificar ya que los retweets son esenciales para compartir publicaciones existentes. Si queremos ver todas las cosas que un usuario ha compartido en la red social, necesitamos que su lista de tweets también pueda incluir los retweets que haya hecho. Para hacerlo, habría que cambiar el getter y el setter de ArrayList<Tweet> por retweet tal que: 
```
public ArrayList<Retweet> getTweets() {

        return tweets;
    }

    public void setTweets(ArrayList<Retweet> tweets) {
    
        this.tweets = tweets;
        
    }
```
