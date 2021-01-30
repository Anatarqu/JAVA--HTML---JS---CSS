package programacionpc; 
import java.util.Scanner; 

public class Valor_Absoluto { 
static Scanner entrada = new Scanner (System.in); 
public static void main (String[] args) { 

    int numero; 
    System.out.println ("ingrese un numero por favor: "); 
    numero = entrada.nextInt(); 
    if(numero <0) {
        System.out.println("el numero es:  " + numero + "y su valor absoluto es: " 
        + Math.abs(numero)); 
    }
    else  {      
        System.out.println("el numero es: " + numero); 
    if(numero>0) {
        System.out.println(" y su valor absoluto es: " 
                + Math.abs(numero)); 
     }
   } 
  }
} 