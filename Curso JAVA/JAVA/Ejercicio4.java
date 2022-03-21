import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String [] args) {
        System.out.println ("Escriba un numero: ");
        Scanner valor;
        valor = new Scanner (System.in);
        int numero = valor.nextInt();
        if (numero %2==0) {
            System.out.println ("El numero digitado es par");
        } else {
            System.out.println ("El numero digitado es impar");
        }
        valor.close();
    }
}