/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

import java.util.GregorianCalendar;

/**
 *
 * @author José Sebastian López Ibarra & Sebastian Emilio Murillo Andrade
 */
public class Empleado {
    private String nombre, apellido, dirrecion;
    private int añoIngreso;
    private double salario;

    public Empleado() {
        añoIngreso = 2022;
        salario = 20000;
    }
    
    public Empleado(String nombre, String apellido, String dirrecion, int añoIngreso, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirrecion = dirrecion;
        this.añoIngreso = añoIngreso;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void calcularVacaciones(){
        if(GregorianCalendar.YEAR - añoIngreso == 1){
            System.out.println("6 días de vacaciones");
        }
    }
    public static void imprimirDatos(){
        Empleado empleado1 = new Empleado();
        System.out.println(empleado1.getNombre());
        System.out.println(empleado1.getApellido());
        System.out.println(empleado1.getDirrecion());
        System.out.println(empleado1.getAñoIngreso());
        System.out.println(empleado1.getSalario());
    }
    
}
