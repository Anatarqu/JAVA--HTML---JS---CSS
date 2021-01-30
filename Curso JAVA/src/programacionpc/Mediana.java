package programacionpc;
import java.util.Scanner;
import java.util.Arrays;

public class Mediana {
	public static void main(String [] args) {
		
		System.out.println ("Escribe la cantidad de elementos del conjunto: ");
		Scanner numeros = new Scanner (System.in);
		int x = numeros.nextInt();
		int [] conjunto = new int [x];
		int i;
		
		Scanner teclado =new Scanner (System.in);
		
		for (i=0; i<conjunto.length; i++) {
			System.out.printf("Escribe el numero " + i + " del conjunto: ");
			conjunto [i] = teclado.nextInt ();
		}
		
		Arrays.sort(conjunto);
		 System.out.println(Arrays.toString(conjunto));

		 int mitad = conjunto.length / 2;
		 if (conjunto.length % 2 == 0) {
			 int mediana1 = (conjunto[mitad - 1] + conjunto[mitad]) / 2;
		     System.out.print("La mediana del conjunto es: " + mediana1);
		 } 
		 else {
		     int mediana2 = conjunto[mitad];
		     System.out.print("La mediana del conjunto es: " + mediana2);
		 }
	}
}