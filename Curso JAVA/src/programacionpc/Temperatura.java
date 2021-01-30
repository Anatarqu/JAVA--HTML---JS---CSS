package programacionpc;
import java.util.*; 

public class Temperatura { 
 
    public static void main(String[] args) {
                System.out.println("-- PROGRAMA QUE CONVIERTE GRADOS CELSIUS (°C) a °F, °K y °R --");
                Scanner input_t = new Scanner(System.in);    

    System.out.println("Ingrese la temperatura en °C:"); 
        System.out.println("-----------------------------------");
        double temp = input_t.nextDouble();
        System.out.println("-----------------------------------");
        double fahrenheit = (temp * 9/5) + 32; 
        double kelvin = temp + 273.15;
        double rankine = (temp * 9/5) + 491.67;

        System.out.println("--> En grados Fahrenheit: " + fahrenheit + " °F");
        System.out.println("-----------------------------------");
                
        System.out.println("--> En grados Kelvin: " + kelvin + " °K");
        System.out.println("-----------------------------------");
                
        System.out.println("--> En grados Rankine: " + rankine + " °R");
        System.out.println("-----------------------------------");
        
        }
 }


