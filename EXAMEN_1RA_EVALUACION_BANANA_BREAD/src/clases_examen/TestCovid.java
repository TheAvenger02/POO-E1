/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases_examen;

/**
 *
 * @author José Sebastian López Ibarra & Sebastian Emilio Murillo Andrade
 */
class TestCovid{
    private int edad, tieneEnfermedadCronica;
    private double peso, estatura, IMC;

    public int getEdad() {
    return edad;
    }
    public void setEdad(int edad) {
    this.edad = edad;
    }

    public int getTieneEnfermedadCronica() {
    return tieneEnfermedadCronica;
    }
    public void setTieneEnfermedadCronica(int tieneEnfermedadCronica) {
    this.tieneEnfermedadCronica = tieneEnfermedadCronica;
    }

    public double getPeso() {
    return peso;
    }
    public void setPeso(double peso) {
    this.peso = peso;
    }

    public double getEstatura() {
    return estatura;
    }
    public void setEstatura(double estatura) {
    this.estatura = estatura;
    }
    
    private double operacionIMC(){
    IMC = peso / Math.pow(estatura, 2);
    return IMC;
    }
    
    public void calcularPersonaRiesgo(){
        if(edad >= 65 || tieneEnfermedadCronica == 1 || operacionIMC() > 30){
            System.out.println("PERSONA DE RIESGO");
        } else {
            System.out.println("PERSONA SIN RIESGO");
           }
    }
}