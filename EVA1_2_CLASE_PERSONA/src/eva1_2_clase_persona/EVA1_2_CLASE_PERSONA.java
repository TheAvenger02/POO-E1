/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clase_persona;

/**
 *
 * @author emiliomurillo
 */
public class EVA1_2_CLASE_PERSONA { //Declaración
    //Implementación {}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Declaración
        // TODO code application logic here
            //Implementación {}
            System.out.println("Hola mundo!!");
            //Cómo crear un objeto en JAVA.
            // Instanciación: crear un objeto.
            //Dar espacio en memoria --> new
            //Declarar 
            // CLASE identificador = new CLASE();
            Persona estudiante = new Persona(); // Declaro un identificador (objeto) tipo Persona
            //EVA1_2_CLASE_PERSONA objCLASE_PER = new EVA1_2_CLASE_PERSONA();
            estudiante.sID = "00112233";
            estudiante.sNombre = "Juan Perez Jolote";
            estudiante.iEdad = 10;
            estudiante.imprimirDatos();
            //Concatenación -> Pegar cadenas de texto
            System.out.println("Año de nacimiento: " + estudiante.calcularAñoNacimiento());
            System.out.println("");
            
            Persona estudiante2 = new Persona();
            estudiante2.sNombre = "Ruben";
            estudiante2.sID = "11111";
            estudiante2.iEdad = 40;
            estudiante2.imprimirDatos();
            System.out.println("Año de nacimiento: " + estudiante2.calcularAñoNacimiento());
            System.out.println("");

            
            Persona estudiante3 = new Persona();
            estudiante3.sNombre = "Pedro";
            estudiante3.sID = "654654";
            estudiante3.iEdad = 50;
            estudiante3.imprimirDatos();
            System.out.println("Año de nacimiento: " + estudiante3.calcularAñoNacimiento());
            System.out.println("");
    }
    
}
// Una clase es un tipo de dato abstracto
class Persona{ //Declaración
        //Implementación
    //Atributos de la clase
    String sID;
    String sNombre;
    int iEdad;
    //Comportamiento
    //Método imprimir datos > método/función > f(x) = x + 1
    //Valor de retorno + nombre de la función (argumentos)
    void imprimirDatos(){ // No regresa valor, el nombre es imprmirDatos(no recibe valores)
        System.out.println("El ID es: " + sID);
        System.out.println("El nombre es: " + sNombre);
        System.out.println("La edad es: " + iEdad);
    }
    // Calcular año de nacimiento
    int calcularAñoNacimiento(){
        int iAñoNac = 2022 - iEdad;
        return iAñoNac;
    }
    
}