/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_herencia;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_1_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        Estudiante estu1 = new Estudiante();
        estu1.setNombre("Emilio");
        estu1.setEdad(20);
        estu1.setNumeroControl("21550384");
        estu1.imprimirDatos();
        System.out.println("No. de Control: " + estu1.getNumeroControl());
    }
    
}

class Estudiante extends Persona{ //Subclase (Hijo)
    private String numeroControl;

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }
    
}

class Persona{ //Superclase (Padre)
    private String nombre;
    private int edad;
    
    public Persona(){
        this.nombre = "";
        this.edad = 0;
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
}

/*
extends --> clases
implements --> interfaces

Arriba - Subclase - Padre - Mamíferos
Abajo - Subclase - Hijo - Primates, catáceos...
*/