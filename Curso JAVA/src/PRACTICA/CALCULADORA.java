package PRACTICA;
//llamamos Scanner
import java.util.Scanner;
//calculadora básica de operaciones 
public class CALCULADORA {
public static void main (String[] args) {
	System.out.println("----------CALCULADORA---------\n");
	
	int a=0, b=0, c=0;
	//agregamos las variables de las operaciones a realizar
	String sel=null;
	Scanner num=new Scanner(System.in);
	System.out.println ("Indica la operación a realizar:  \n");
	System.out.println (" s: Suma\n r: Resta\n m: Multiplicación\n e: Division Entera\n d: Division Decimal\n");
	sel=num.next();
	switch (sel) {
		case "s":
		System.out.print("Escribe el primer valor:\n");
		a=num.nextInt();
		System.out.print("Escribe el segundo valor:\n");
		b=num.nextInt();
		c=a+b;
		System.out.println(a+"+"+b+"="+c);
		break;
		
		case "r":
			System.out.print("Escribe el primer valor:\n");
			a=num.nextInt();
			System.out.print("Escribe el segundo valor:\n");
			b=num.nextInt();
			c=a-b;
			System.out.println(a+"-"+b+"="+ c);
			break;
			
		case "m":
			System.out.print("Escribe el primer valor:\n");
			a=num.nextInt();
			System.out.print("Escribe el segundo valor:\n");
			b=num.nextInt();
			c=a*b;
			System.out.println(a+"*"+b+"="+c);
			break;
			
		case "e":
			System.out.print("Escribe el primer valor:\n");
			a=num.nextInt();
			System.out.print("Escribe el segundo valor:\n");
			b=num.nextInt();
			c=a/b;
			System.out.println(a+"/"+b+"="+ c);
			break;
			
		case "d":
			System.out.print("Escribe el primer valor:\n");
			a=num.nextInt();
			System.out.print("Escribe el segundo valor:\n");
			b=num.nextInt();
			c =(int) ((double) a/b);
			System.out.println(a+"/"+b+"="+ c);
			break;
			
			default:
				System.out.println ("No existe esa opción");
				
}
}
}
