package programacionpc;
import java.util.Scanner;

public class universidad {
public static void main (String [] args) {
 Scanner ana = new Scanner (System.in);	
 System.out.println ("A los cuantos dias volvera Ana a la universidad?: ");
 int a = ana.nextInt ();
 
 Scanner bernardo = new Scanner (System.in);	
 System.out.println ("A los cuantos dias volvera Bernando a la universidad?: ");
 int b = bernardo.nextInt ();
 
 Scanner carlos = new Scanner (System.in);	
 System.out.println ("A los cuantos dias volvera Carlos a la universidad?: ");
 int c = carlos.nextInt ();
 
 int mcm =1;
 int i =2;
 
 while (i<=a || i<=b || i<=c) {
	 if (a%i==0 || b%i==0 || c%i==0) {
		 mcm= mcm*i;
		 if (a%i==0) a=a/i;
		 if (b%i==0) b=b/i;
		 if (c%i==0) c=c/i;
	 }
	 else i=i+1;
 }
	 System.out.println ("Ana, Bernardo y Carlos se veran de nuevo en " + mcm + " dias");
 }
 }
