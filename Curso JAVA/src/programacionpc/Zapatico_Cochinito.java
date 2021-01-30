package programacionpc;
import java.util.Arrays; 
import java.util.List; 
import java.util.ArrayList; 
import java.util.Scanner; 

  

public class Zapatico_Cochinito {
    public static void main(String[] args) {

        String[] nombres = {"Camilo", "Andrés", "Gabriel", "Katherine", "Juana"}; 

         List<String> lista = new ArrayList<String>(); 


         for (String color : nombres) 

             lista.add(color);  

         System.out.println("Niños: "); 

         for (int cuenta = 0; cuenta < lista.size(); cuenta++) 

             System.out.printf("%s - ", lista.get(cuenta)); 

         System.out.println(" "); 

         System.out.print("Número K: "); 

         Scanner entrada = new Scanner(System.in); 

            int size = entrada.nextInt(); 

            if (size >= 0 && size <= 4) 

            System.out.printf("- %s - lava los platos", lista.get(size)); 

            else 

                System.out.printf("- %s - lava los platos", lista.get(size-5)); 

    } 

} 