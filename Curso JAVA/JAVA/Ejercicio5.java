import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String [] args) {
        System.out.println ("Escriba un caracter: ");
        Scanner caracter;
        caracter = new Scanner (System.in);
        char letra = caracter.nextLine().charAt(0);
        caracter.close();
        if( (int)letra >= (int)'a' && (int)letra <= (int)'z') {
            System.out.println ("Miniscula");
        } else {
            System.out.println ("Mayuscula");
        }
    }
}
