/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_9_memoria_heap;

/**
 *
 * @author emiliomurillo
 */
public class EVA1_9_MEMORIA_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 5;
        Prueba obj1 = new Prueba(); // Referencia -> Dirección de memoria
        System.out.println(obj1);
        System.out.println(obj1.valor);
        Prueba obj2 = new Prueba();
        System.out.println(obj2);
        System.out.println(obj2.valor);
        obj2 = null; // Elimino la referencia
        // Cuando no eliminan objetos y no se usan en el programa -> Fuga de memoria (memory leak)
        //Garbage collector -> Elimina de memoria cuando no se usa
        /* Cuando utilizan mucha memoria
        System.runFinalization();
        System.gc(); */
    }
    
}
class Prueba{
    int valor = 100;
}

// Apuntadores -> Direcciones de memoria RAM (No existen en JAVA)