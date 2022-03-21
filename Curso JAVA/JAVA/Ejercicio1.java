import java.util.Scanner;

public class Ejercicio1 {
   public static void main (String [] args){
    System.out.println ("Digite el radio de la circunferencia: ");

    Scanner valor;
    valor = new Scanner (System.in);
    int radio = valor.nextInt();

    System.out.println("El área de la circunferencia es: "+(3.1416 * radio * radio));
    valor.close();
   }
}