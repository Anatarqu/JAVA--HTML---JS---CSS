import java.util.Scanner;
public class Ejercicio3 {
    public static void main  (String[] args) {

        System.out.println ("Digite el valor del primer cateto:");
        Scanner valor1;
        valor1= new Scanner (System.in);
        float cateto1 = valor1.nextFloat();
      
        
        System.out.println ("Digite el valor del segundo cateto:");
        Scanner valor2;
        valor2= new Scanner (System.in);
        float cateto2 = valor2.nextFloat();
        

        System.out.println ("La hipotenusa es:"+ (Math.hypot(cateto1, cateto2)));
        valor1.close();
        valor2.close();
    }
}
