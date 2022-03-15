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
public class FichaBibliografica {
    private String autor;
    private String título;
    private String año;
    private String ciudad;
    private String editorial;

    public FichaBibliografica() {
        this.autor = "Wojtyla, K";
        this.título = "Amor y responsabilidad";
        this.año = "2016";
        this.ciudad = "Madrid";
        this.editorial = "Palabra";
    }

    public FichaBibliografica(String autor, String título, String año, String ciudad, String editorial) {
        this.autor = autor;
        this.título = título;
        this.año = año;
        this.ciudad = ciudad;
        this.editorial = editorial;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public void imprimirFicha(){
       FichaBibliografica datosLibro = new FichaBibliografica();
       System.out.println(datosLibro.getAutor()+". "+"("+datosLibro.getAño()+"). " + datosLibro.getTítulo()+". " + datosLibro.getCiudad()+": " + datosLibro.getEditorial()+"." + "\n");
       System.out.println(autor+". "+"("+año+"). " + título+". " + ciudad+": " + editorial+"." + "\n");
    }   
}