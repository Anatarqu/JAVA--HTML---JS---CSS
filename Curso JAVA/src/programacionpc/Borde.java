package programacionpc;
import java.util.*;  

public class Borde {

	    public static void main(String[] args) { 

	        System.out.println("--------------------------------"); 

	        System.out.println("-- DISTANCIA AL BORDE --"); 

	        System.out.println("--------------------------------"); 

	        Scanner intro = new Scanner(System.in); 

	        System.out.print("Digite base en cm: "); 

	        int base = intro.nextInt(); 

	        System.out.print("Digite altura en cm: "); 

	        int altura = intro.nextInt(); 

	        System.out.println("--------------------------------"); 

	        int area = base * altura; 

	        System.out.println("El área del rectángulo es: " + area + "cm2"); 
	         

	        System.out.println("--------------------------------"); 

	        double diagonal =Math.ceil(Math.sqrt((Math.pow(base, 2) + Math.pow(altura, 2)))); 

	        System.out.println("Distancia cb(0,0) hasta ab("+ altura + "," +base+":) = " + diagonal + "cm"); 

	        System.out.println("Distancia cb(0,0) hasta da("+ altura + ",0:) = " + altura + "cm"); 

	        System.out.println("Distancia cb(0,0) hasta bc("+ base + ",0:) = " + base + "cm"); 


	        System.out.println("--------------------------------"); 

	        System.out.println(altura>base ? "Menor distancia al borde " + base+"cm":"Menor distancia al borde " + altura+"cm");  

	    } 
	} 