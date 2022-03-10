/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_5_clase_compu;

/**
 *
 * @author emiliomurillo
 */
public class EVA_1_5_CLASE_COMPU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora miComputadora = new Computadora();
        miComputadora.setMarca("Apple");
        miComputadora.setNombre("iMac");
        miComputadora.setColor("Plata");
        miComputadora.setPulgadas(27);
        miComputadora.setNúcleos(10);
        miComputadora.setProcesador("Intel Core i7");
        miComputadora.setAlmacenamiento(512);
        miComputadora.setMemoriaRAM(8);
        miComputadora.setPrecio(58999.00);
        miComputadora.imprimirDatos();
        // Sobrecarga - Darle más funcionalidad a la que tenía originalmente
    }
    
}

class Computadora{
     // Encapsulamiento - Modificadores
     //Atributos de una clase deben de ser privados - Propiedades
     private String sMarca;
     private String sNombre;
     private String sColor;
     private float fPulgadas;
     private int iNúcleos;
     private String sProcesador;
     private int iAlmacenamiento;
     private int iMemoriaRAM;
     private double dPrecio;
     //Comportamiento (métodos)
     //Para leer y modificar los atributos, usamos métodos de lectura/escritura
     
    //Leer -> Get
     public String getMarca(){
         return sMarca;
     }
     public String getColor(){
         return sColor;
     }
     public String getNombre(){
         return sNombre;
     }
     public float getPulgadas(){
         return fPulgadas;
     }
     public int getNúcleos(){
         return iNúcleos;
     }
     public String getProcesador(){
         return sProcesador;
     }
     public int getAlmacenamiento(){
         return iAlmacenamiento;
     }
     public int getMemoriaRAM(){
         return iMemoriaRAM;
     }
    public double getPrecio(){
         return dPrecio;
     }
      //Asignar -> Set
     public void setMarca(String valor){
         sMarca = valor;
     }
     public void setColor(String valor){
         sColor = valor;
     }
     public void setNombre(String valor){
         sNombre = valor;
     }
     public void setPulgadas(float valor){
         fPulgadas = valor;
     }
     public void setNúcleos(int valor){
         iNúcleos = valor;
     }
     public void setProcesador(String valor){
         sProcesador = valor;
     }
     public void setAlmacenamiento(int valor){
         iAlmacenamiento = valor;
     }
     public void setMemoriaRAM(int valor){
         iMemoriaRAM = valor;
     }
     public void setPrecio(double valor){
         dPrecio = valor;
     }
     public void imprimirDatos(){
         System.out.println("Datos de la computadora: ");
         System.out.println("Marca: " + sMarca);
         System.out.println("Nombre: " + sNombre);
         System.out.println("Color: " + sColor);
         System.out.println("Pulgadas: " + fPulgadas);
         System.out.println("Núcleos: " + iNúcleos);
         System.out.println("Procesador: " + sProcesador);
         System.out.println("Memoria: " + iAlmacenamiento + " GB SSD");
         System.out.println("Memoria RAM: " + iMemoriaRAM + " GB");
         System.out.println("Precio: $" + dPrecio);
         System.out.println("Precio total: $" + (dPrecio + (dPrecio * 0.16)));
     }
     
 }
/*
Defina sus atributos
Metodos get y set
Imprimir datos
Precio total (precio + IVA (16%)
*/