package programacionpc;
import java.util.*;

public class Horas_a_segundos {
	
	public static void main(String[] args) { 

	    int H , M , S ; 

	        Scanner sc = new Scanner(System.in); 

	        System.out.print("introduzca hora:"); 
	        
	        H = sc.nextInt(); 

	        System.out.print("introduzca minutos:"); 

	        M = sc.nextInt(); 

	        System.out.print("introduzca segundos:"); 

	        S = sc.nextInt(); 

	        System.out.print("TOTAL SEGUNDOS ="); 

	        System.out.println(3600*H+60*M+S); 

			} 	     
		}