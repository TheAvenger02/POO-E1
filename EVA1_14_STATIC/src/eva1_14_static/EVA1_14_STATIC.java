/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_static;

/**
 *
 * @author emiliomurillo
 */
public class EVA1_14_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*FormulasMatematicas misFor = new FormulasMatematicas();
        double area = misFor.calcularAreaCirculo(100);
        System.out.println("Área del círculo: " + area);*/
        double areaC = FormulasMatematicas.calcularAreaCirculo(100); //Estáticos pertecen a la clase - Existen desde el inicio
        System.out.println("Área del círculo: " + areaC);
        double areaT = FormulasMatematicas.calcularAreaTriangulo(100, 50);
        System.out.println("Área del triángulo: " + areaT);
        FormulasMatematicas miObj = new FormulasMatematicas(); //No estáticos pertenecen al objeto - Existen al crear el objeto
        miObj.imprimirmensaje();
    }
}
class FormulasMatematicas{
    static int valor = 100;
    //Área círculo:
    public static double calcularAreaCirculo(double radio){
        double area;
        area = 3.1416 * radio * radio;
        return area;
    }
    //Área triángulo
    public static double calcularAreaTriangulo(double base, double altura){
        double area;
        area = (base * altura) / 2.0;
        return area;
    }
    public void imprimirmensaje(){
        System.out.println("Hola mundo!!");
    }
}
