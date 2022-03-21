import java.util.Scanner;

public class Ejercicio2 {
   public static void main (String [] args){
    System.out.println ("Introduce el numero en cm: ");

    Scanner valor;
    valor = new Scanner (System.in);
    float cm = valor.nextFloat();

    System.out.println("El numero pasado a metros es: "+(cm/100));
    valor.close();
   }
}