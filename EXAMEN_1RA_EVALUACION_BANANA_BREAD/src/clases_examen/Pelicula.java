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
class Pelicula {
    private String titulo, estudio;
    private int rating;

    public String getTitulo() {
    return titulo;
    }
    
    public void setTitulo(String titulo) {
    this.titulo = titulo;
    }

    public String getEstudio() {
    return estudio;
    }
    
    public void setEstudio(String estudio) {
    this.estudio = estudio;
    }
    
    public int getRating() {
    return rating;
    }
    
    public void setRating(int rating) {
    this.rating = rating;
    }

    public static void imprimirDatosPelicula() {
    Pelicula Pelicula1 = new Pelicula();

    Pelicula1.setTitulo("Duro de Matar");
    Pelicula1.setEstudio("20th Century Fox");
    Pelicula1.setRating(18);

    System.out.println("Título de la película: " + Pelicula1.getTitulo());
    System.out.println("Estudio: " + Pelicula1.getEstudio());
    System.out.println("Rating: " + "+" + Pelicula1.getRating());
    Pelicula1.evaluarEdad();
    }

    public void evaluarEdad() {
    Scanner entrada = new Scanner (System.in);
    System.out.println("¿Cuál es tu edad?");
    int edad = entrada.nextInt();

        if(edad < rating){
            System.out.println("No puedes ver la película" + "\n");
        } 
        else{
            System.out.println("Puedes ver la película" + "\n");
        }
    }
}