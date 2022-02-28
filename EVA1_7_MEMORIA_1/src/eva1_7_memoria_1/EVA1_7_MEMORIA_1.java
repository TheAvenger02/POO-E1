/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_memoria_1;

/**
 *
 * @author emiliomurillo
 */
public class EVA1_7_MEMORIA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5; // 4 bytes
        String cade = "Hola";
        Prueba obj = new Prueba(); //  Constructor
        
        System.out.println("Valor = " + valor);
        System.out.println("Cadena = " + cade);
        System.out.println("Objeto = " + obj);
    }
    
}

class Prueba{
    public void saludar(){
        System.out.println("Hola mundo!!");
    }
}

// JAVA -> Java Virtual Machine (Máquina Virtual de Java)
// @ "at" "en"
// Memoria:
// Estática - Stack (Pila) -> Variables locales
// Dinámica - Heap (Árbol) -> Variables dinámicas -> Objetos (new)
// LIFO - Last in, First out (último en entrar, primero en salir)