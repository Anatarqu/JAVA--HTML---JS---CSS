package programacionpc;
import java.util.Scanner; 
import java.util.Arrays;

public class Ordenado {
 public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); 
        System.out.print("Cantidad elementos del arreglo: "); 
        int size = entrada.nextInt(); 
        int[] arreglo = new int[size]; 
        int num2 = 0; 

    for (int i = 0; i < arreglo.length; i++) { 
        System.out.print("Posición: " + i + " " + "Digite número: "); 
        int num = entrada.nextInt(); 
        arreglo[i] = num; 
        } 

    System.out.println(Arrays.toString(arreglo)); 
    if (arreglo[0] < arreglo[1])  {
    	if ( arreglo [1] < arreglo [2]) {
    		  System.out.println("Ordenado de menor a mayor");
    	}
    }
    else { 

        System.out.println("No Ordenado"); 
    }

    } 
} 