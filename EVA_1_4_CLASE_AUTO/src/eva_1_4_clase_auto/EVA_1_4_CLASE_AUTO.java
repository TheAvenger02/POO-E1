/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_4_clase_auto;

/**
 *
 * @author emiliomurillo
 */
public class EVA_1_4_CLASE_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automóvil miAuto = new Automóvil();
        miAuto.setMarca("Chevrolet");
        miAuto.setModelo("SS Red Line");
        miAuto.setTipo("Deportivo");
        miAuto.setAño(2022);
        miAuto.setColor("Red");
        miAuto.setPrecio(1280900.00);
        miAuto.imprimirDatos();
        // Sobrecarga - Darle más funcionalidad a la que tenía originalmente
    }
    
}

class Automóvil{
     // Encapsulamiento - Modificadores
     //Atributos de una clase deben de ser privados - Propiedades
     private String sMarca;
     private String sModelo;
     private String sTipo;
     private int iAño;
     private String sColor;
     private double dPrecio;
     //Comportamiento (métodos)
     //Para leer y modificar los atributos, usamos métodos de lectura/escritura
     
    //Leer -> Get
     public String getMarca(){
         return sMarca;
     }
     public String getModelo(){
         return sModelo;
     }
     public String getTipo(){
         return sTipo;
     }
     public int getAño(){
         return iAño;
     }
     public String getColor(){
         return sColor;
     }
    public double getPrecio(){
         return dPrecio;
     }
      //Asignar -> Set
     public void setMarca(String valor){
         sMarca = valor;
     }
     public void setModelo(String valor){
         sModelo = valor;
     }
     public void setTipo(String valor){
         sTipo = valor;
     }
     public void setAño(int valor){
         iAño = valor;
     }
     public void setColor(String valor){
         sColor = valor;
     }
     public void setPrecio(double valor){
         dPrecio = valor;
     }
     public void imprimirDatos(){
         System.out.println("Datos del vehículo: ");
         System.out.println("Marca: " + sMarca);
         System.out.println("Modelo: " + sModelo);
         System.out.println("Tipo: " + sTipo);
         System.out.println("Año: " + iAño);
         System.out.println("Color: " + sColor);
         System.out.println("Precio: $" + dPrecio);
     }
     
 }


/*
Marca: String
Modelo: String
Tipo_vehiculo: String
Año: Int
Color: String
Precio: Flotante

*/