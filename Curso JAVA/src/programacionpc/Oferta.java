package programacionpc;
import java.util.*;

public class Oferta {
	    public static void main(String[] args) {
	        int a;
	        int b;
	        int c;
	        int d = 10;
	        int resultado;
	        int total1;
	        int total2;
	        int total3;
	        int total4;

Scanner valor = new Scanner(System.in);
System.out.println("---------Tienda #1----------");
System.out.println("Ingrese el valor del produto A");
a = valor.nextInt();
System.out.println("Cada camisa tiene un valor de: " + a);
total1 = a * 3;
System.out.println("El valor sin descuento es de:" + total1);
System.out.println("Si compro 3 camisas, tiene un descuento de:" + d + "%");
total2 = (total1 * d / 100);
 resultado = total1 - total2;
System.out.println("El valor con descuento es de:" + resultado);
	 
Scanner valor2 = new Scanner(System.in);
System.out.println("\n-------Tienda #2--------");
System.out.println("Ingrese el valor del produto B");
b = valor2.nextInt();
System.out.println("Cada camisa tiene un valor de: " + b);
total3 = (b * 3) - b;
System.out.println("Lleve 3 pague 2, el total de su compra es: " + total3);
	 
Scanner valor3 = new Scanner(System.in);
System.out.println("\n------Tienda #3-------");
System.out.println("Ingrese el valor del producto C");
c = valor3.nextInt();
System.out.println("Cada camisa tiene un valor de: ¨" + c);
total4 = c;
System.out.println("Este producto no tiene descuento, valor a pagar: " + total4);
	        
System.out.println("\n \n El menor valor que paga Belen es en la tienda #2: " + total3);
	        }
	}

