/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_sobrecarga;
/**
 *
 * @author emiliomurillo
 */
public class EVA1_18_SOBRECARGA {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HOLA MUNDO!!");
        Prueba obj = new Prueba();    
        System.out.println(obj);
        System.out.println(100);
        System.out.println("Área de un rectangulo de 15 x 20" + calcularArea(15.0, 20.0));
        System.out.println("Área de un triángulo" + calcularArea(15.0, 20.0, 1));
        System.out.println("Área de un triángulo" + calcularArea(1, 15.0, 20.0));
        System.out.println("Área de un círculo de radio 100" + calcularArea(100.0));
        System.out.println("Área de un círculo de radio 100" + calcularArea(100));
    }
    //Calcula el área de un rectángulo
    public static double calcularArea(double base, double altura){
        return base * altura;
    }
    //Calcula el área de un triángulo
    public static double calcularArea(double base, double altura, int esTriangulo){
        return (base * altura) / 2;
    }
    //Calcula el área de un triángulo
    public static double calcularArea(int esTriangulo, double base, double altura){
        return (base * altura) / 2;
    }
    //Calcula el área de un círculo
    public static double calcularArea(double radio){
        return Math.PI * Math.pow(radio, 2);
    }
    //Calcula el área de un círculo con ENTEROS
    public static double calcularArea(int radio){
        return Math.PI * Math.pow(radio, 2);
    }         
}
class Prueba{  
}