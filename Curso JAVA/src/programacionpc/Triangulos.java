package programacionpc; 
import java.util.Scanner; 

public class Triangulos { 
    public static void main (String[] args) { 
    Scanner lados = new Scanner (System.in); 
    double a, b, c; 

    System.out.print ("Ingrese primer lado por favor: "); 
    a = lados.nextDouble(); 
    System.out.print ("Ingrese segundo lado por favor: "); 
    b = lados.nextDouble(); 
    System.out.print ("Ingrese tercer lado por favor: "); 
    c = lados.nextDouble(); 

    if (a==b && a==c && b==c) {
        System.out.println("El triangulo es EQUILÁTERO "); 
    }
    else if (a==b || a==c || b==c) {
        System.out.println("El triangulo es ISÓSCELES "); 
    }
    else {
        System.out.println("El triangulo es ESCALENO "); 
     }   
    }
   } 