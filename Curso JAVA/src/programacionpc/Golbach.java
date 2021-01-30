package programacionpc;
import java.util.Scanner;

public class Golbach {  

    public static void main(String[] args) {  

        System.out.println("-----------------------------------------------------"); 

        System.out.println("| Aqui empezamos con la Conjetura de Goldbach |"); 

  

        System.out.println("----------------------------------------------------\n"); 

        System.out.println("Conjetura de Goldbach. Ingrese un numero par mayor que 2"); 

  

        while (true) { 

        Scanner valor = new Scanner(System.in); 

        long dato = valor.nextInt();   

         if (dato > 5 || dato == 4) {  

         if (dato % 2 == 0) {  

          for (long valor1 = 2; valor1 < dato; ++valor1) { 

           boolean valor1P = true; 

           for (long i = 2; i < valor1; ++i) { 

           if (valor1 % i == 0) { 

           valor1P = false; 

           } 

           }  

           if (valor1P) { 

           for (long valor2 = valor1; valor2 < dato; ++valor2) { 

            if (valor1 + valor2 == dato) { 

            boolean valor2P = true; 

            for (long i = 2; i < valor2; ++i) { 

            if (valor2 % i == 0) { 

            valor2P = false; 

            } 

            }  

           if (valor2P) { 

          System.out.printf("Resultados posibles: \n"+"%,d == %,d + %,d\n", dato, valor1, valor2); 

           } 

          } 

          } 

          } 

          } 

          } else {  

           for (long valor1 = 2; valor1 < dato; ++valor1) { 

           boolean valor1P = true; 

            for (long i = 2; i < valor1; ++i) { 

             if (valor1 % i == 0) { 

            valor1P = false; 

             } 

             }  

             if (valor1P) { 

             for (long valor2 = valor1; valor2 < dato; ++valor2) { 

             boolean valor2P = true; 

              for (long i = 2; i < valor2; ++i) { 

               if (valor2 % i == 0) { 

               valor2P = false; 

                } 

                }  

                if (valor2P) { 

                for (long valor3 = valor2; valor3 < dato; ++valor3) { 

                if (valor1 + valor2 + valor3 == dato) { 

                boolean valor3P = true; 

                for (long i = 2; i < valor3; ++i) { 

                 if (valor3 % i == 0) { 

                 valor3P = false; 

                 } 

                 }  

                if (valor3P) { 

             System.out.printf("Resultados posibles: \n"+"%,d == %,d + %,d + %,d\n", dato, valor1, valor2, valor3); 

                } 

               } 

              } 

               } 

               } 

               } 

               } 

                } 

               } 

               } 

               } 

               } 