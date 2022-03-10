/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA1_15_FORMULAS_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean flag = true;    
        do{
        System.out.println("¿De qué temperatura desea convertir?\n 1 - Celsius \n 2 - Fahrenheit \n 3 - Kelvin \n 4 - Rankine");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextByte();
        switch(r){
            case 1:
            System.out.println("Ingresa la temperatura en °C: ");      
            double temp = sc.nextDouble();
            System.out.println("Los grados Fahrenheit son: " + FormulasTemp.convertCelsiusToFahrenheit(temp) + " °F");
            System.out.println("Los grados Kelvin son: " + FormulasTemp.convertCelsiusToKelvin(temp) + " °K");
            System.out.println("Los grados Rankine son: " + FormulasTemp.convertCelsiusToRankine(temp) + " °R");
            break;
            
            case 2:
            System.out.println("Ingresa la temperatura en °F: ");      
            temp = sc.nextDouble();
            System.out.println("Los grados Celsius son: " + FormulasTemp.convertFahrenheitToCelsius(temp) + " °C");
            System.out.println("Los grados Kelvin son: " + FormulasTemp.convertFahrenheitToKelvin(temp) + " °K");
            System.out.println("Los grados Rankine son: " + FormulasTemp.convertFahrenheitToRankine(temp) + " °R");
            break;
        
            case 3:
            System.out.println("Ingresa la temperatura en °K: ");      
            temp = sc.nextDouble();
            System.out.println("Los grados Celsius son: " + FormulasTemp.convertKelvinToCelsius(temp) + " °C");
            System.out.println("Los grados Fahrenheit son: " + FormulasTemp.convertKelvinToFahrenheit(temp) + " °F");
            System.out.println("Los grados Rankine son: " + FormulasTemp.convertKelvinToRankine(temp) + " °R"); 
            break;
                
            case 4:
            System.out.println("Ingresa la temperatura en °R: ");      
            temp = sc.nextDouble();
            System.out.println("Los grados Celsius son: " + FormulasTemp.convertRankineToCelsius(temp) + " °C");
            System.out.println("Los grados Fahrenheit son: " + FormulasTemp.convertRankineToFahrenheit(temp) + " °F");
            System.out.println("Los grados Kelvin son: " + FormulasTemp.convertRankineToKelvin(temp) + " °K");    
            break;
            
            default:
                System.out.println("Ingrese un número del 1 - 4 para elegir el tipo de conversión: ");
                break;
        }
           if(r == 1 || r == 2 || r == 3 || r == 4){
            System.out.println("¿Desea convertir otra temperatura? 1 = SÍ");
            r = sc.nextInt();
            if(r != 1){
                flag = false;
            }
        }
        }while(flag==true);
    }
}
class FormulasTemp{
    public static double convertCelsiusToFahrenheit(double temp){
        double F;
        F = (1.8*temp)+32;
        return F;
    }
    public static double convertCelsiusToRankine(double temp){
        double R;
        R = ((temp * (9/5))+ 491.67);
        return R;
    }
    public static double convertCelsiusToKelvin(double temp){
        double K;
        K = (temp + 273);
        return K;
    }
    public static double convertFahrenheitToCelsius(double temp){
        double C;
        C = (temp - 32) * (5/9);
        return C;
    }
    public static double convertFahrenheitToKelvin(double temp){
        double K;
        K = ((temp - 32) * (5/9)) + 273.15;
        return K;
    }
    public static double convertFahrenheitToRankine(double temp){
        double R;
        R = (temp + 459.67);
        return R;
    }
    public static double convertKelvinToCelsius(double temp){
        double C;
        C = (temp - 273.15);
        return C;
    }
    public static double convertKelvinToFahrenheit(double temp){
        double F;
        F = ((temp - 273.15) * (9/5)) + 32;
        return F;
    }
    public static double convertKelvinToRankine(double temp){
        double R;
        R = (temp * 1.8);
        return R;
    }
    public static double convertRankineToCelsius(double temp){
        double C;
        C = (temp - 491.67) * (5/9);
        return C;
    }
    public static double convertRankineToFahrenheit(double temp){
        double F;
        F = (temp - 491.67);
        return F;
    }
    public static double convertRankineToKelvin(double temp){
        double K;
        K = (temp * (5/9));
        return K;
    }
}