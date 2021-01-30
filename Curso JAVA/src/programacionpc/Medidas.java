package programacionpc;
import java.util.Scanner;

public class Medidas {
	 
	    public static void main(String[] args) { 
	        int introduzcamedidaenm;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("introduzca medida en Metros ="); 
	        introduzcamedidaenm= sc.nextInt(); 
	          System.out.print("Centimetros ="); 
	          System.out.println(introduzcamedidaenm*100); 
	          System.out.print("Milimetros =");
	          System.out.println(introduzcamedidaenm*1000);
	          System.out.print("Pies =");
	          System.out.println(introduzcamedidaenm*3.28084);
	          System.out.print("Pulgadas =");
	          System.out.println(introduzcamedidaenm*39.3701);
	          System.out.print("Yardas =");
	          System.out.println(introduzcamedidaenm*1.09361);
	          System.out.print("Años luz =");
	       
	          System.out.println(introduzcamedidaenm*0.00000000000000010570);
	          System.out.print("Angstrom =");
	          System.out.println(introduzcamedidaenm*10000000000L);
	    }
	}

