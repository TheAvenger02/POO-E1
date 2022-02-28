/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_mod_acceso;

/**
 *
 * @author emiliomurillo
 */
public class EVA1_3_MOD_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1 = new Persona(); //Instanciar (crear un objeto)
        per1.setID("00112233");
        per1.setNombre("Emilio");
        per1.setEdad(20);
        System.out.println("Nombre: " + per1.getNombre());
        
        Persona per2 = new Persona();
        per2.setID("546545");
        per2.setNombre("sdsfasdasfas");
        per2.setEdad(100);
        System.out.println(per2.getNombre() + ", " + per2.getID());
    }
    
}
 class Persona{
     // Encapsulamiento - Modificadores
     //Atributos de una clase deben de ser privados - Propiedades
     private String sID;
     private String sNombre;
     private int iEdad;
     //Comportamiento (métodos)
     //Para leer y modificar los atributos, usamos métodos de lectura/escritura
     
    //Leer -> Get
     public String getID(){
         return sID;
     }
     public String getNombre(){
         return sNombre;
     }
     public int getEdad(){
         return iEdad;
     }
      //Asignar -> Set
     public void setID(String valor){
         sID = valor;
     }
     public void setNombre(String valor){
         sNombre = valor;
     }
     public void setEdad(int valor){
         iEdad = valor;
     }
     
 }
