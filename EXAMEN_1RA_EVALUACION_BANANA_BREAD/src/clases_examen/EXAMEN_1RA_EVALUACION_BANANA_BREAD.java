/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

import java.util.Scanner;

/**
 *
 * @author José Sebastian López Ibarra & Sebastian Emilio Murillo Andrade
 */
public class EXAMEN_1RA_EVALUACION_BANANA_BREAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatosIntegrantes.imprimirProblemasResueltos();
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Registra tu usuario:");
        String usuario = sc.nextLine();
        System.out.println("Registra tu contraseña:");
        String contraseña = sc.nextLine();
        System.out.println("Ingresa tu usuario:");
        String usuario_1 = sc.nextLine();
        System.out.println("Ingresa tu contraseña:");
        String contraseña_1 = sc.nextLine();

        Contraseña usuario1 = new Contraseña(usuario, contraseña);
        usuario1.setUsuario(usuario);
        usuario1.setContraseña(contraseña);
        usuario1.verificarAcceso(usuario_1, contraseña_1);
        
        System.out.println("Autor: ");
        String autor = sc.nextLine();
        System.out.println("Título: ");
        String título = sc.nextLine();
        System.out.println("Año: ");
        String año = sc.nextLine();
        System.out.println("Ciudad: ");
        String ciudad = sc.nextLine();
        System.out.println("Editorial: ");
        String editorial = sc.nextLine();
        
        FichaBibliografica datosLibro = new FichaBibliografica(autor, título, año, ciudad, editorial);
        datosLibro.setAutor(autor);
        datosLibro.setTítulo(título);
        datosLibro.setAño(año);
        datosLibro.setCiudad(ciudad);
        datosLibro.setEditorial(editorial);
        datosLibro.imprimirFicha();
        
        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();
        System.out.println("Padece de alguna enfermedad crónica (1 -> SI / 0 -> NO):");
        int enfermedad = sc.nextInt();
        System.out.println("Ingrese su peso (en kg.):");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su estatura (en mts.):");
        double estatura = sc.nextDouble();

        TestCovid persona1 = new TestCovid();
        persona1.setEdad(edad);
        persona1.setTieneEnfermedadCronica(enfermedad);
        persona1.setEstatura(estatura);
        persona1.setPeso(peso);
        persona1.calcularPersonaRiesgo();
        
        System.out.println("Nombre: ");
        String nombre = sc.next();
        System.out.println("Apellido: ");
        String apellido = sc.next();
        System.out.println("Dirección: ");
        String direccion = sc.next();
        
        Empleado empleado1 = new Empleado();
        empleado1.setNombre(nombre);
        empleado1.setApellido(apellido);
        empleado1.setDirrecion(direccion);
    }
}

class DatosIntegrantes{

    public DatosIntegrantes() {
        carrera = "Ingeniería en Sistemas Computacionales";
        nombreEquipo = "Banana Bread";
    }
    private String numeroControl;
    private  String carrera;
    private String nombre;
    private String apellidos;
    private String nombreEquipo;

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    
    public static void imprimirDatosEquipo(){
        DatosIntegrantes integrante1 = new DatosIntegrantes();
        DatosIntegrantes integrante2 = new DatosIntegrantes();
        integrante1.setNumeroControl("21550362");
        integrante1.setNombre("José Sebastian");
        integrante1.setApellidos("López Ibarra");
        
        integrante2.setNumeroControl("21550384");
        integrante2.setNombre("Sebastian Emilio");
        integrante2.setApellidos("Murillo Andrade");
        
        System.out.println(integrante1.getNumeroControl());
        System.out.println(integrante1.getCarrera());
        System.out.println(integrante1.getNombre());
        System.out.println(integrante1.getApellidos());
        System.out.println(integrante1.getNombreEquipo() + "\n");
        
        System.out.println(integrante2.getNumeroControl());
        System.out.println(integrante2.getCarrera());
        System.out.println(integrante2.getNombre());
        System.out.println(integrante2.getApellidos());
        System.out.println(integrante2.getNombreEquipo() + "\n");
        
    }
    
    public static void imprimirProblemasResueltos(){
        imprimirDatosEquipo();
        Pelicula.imprimirDatosPelicula();
        // FichaBibliografica.imprimirFicha();
        Empleado.imprimirDatos();
    }
}