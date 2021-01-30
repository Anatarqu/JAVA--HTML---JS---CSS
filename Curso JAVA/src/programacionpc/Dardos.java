package programacionpc;
import java.util.*; 

public class Dardos { 
    public static void main(String[] args) { 
        System.out.println("--------------------------------"); 
        System.out.println("-- DARDOS --"); 
        System.out.println("--------------------------------"); 

        int r_rojo = 1; 
        int r_naranja =2; 
        int r_amarillo =3; 
        int r_verde =4; 
        int r_azul = 5; 

        double cir_rojo = ((2*Math.PI) * r_rojo); 
        double cir_naranja= ((2*Math.PI) * r_naranja); 
        double cir_amarillo= ((2*Math.PI) * r_amarillo); 
        double cir_verde= ((2*Math.PI) * r_verde); 
        double cir_azul= ((2*Math.PI) * r_azul); 
        
        Scanner intro = new Scanner(System.in); 
        System.out.print("Digite X: "); 
        int coor_x = intro.nextInt(); 

         
        System.out.print("Digite y: "); 
        int coor_y = intro.nextInt(); 
        if (coor_x <=6 && coor_y <= 6) { 
            int    puntaje = 15; 
            System.out.print("Rojo " + puntaje +" puntos!!!"); 
            } 
        else if (coor_x >6 && coor_y <= 12) { 
            int    puntaje1 = 9; 
            System.out.print("Naranja " + puntaje1 + " puntos!!!"); 
            } 

        else if (coor_x >12 && coor_y <= 18) { 
            int    puntaje2 = 5; 
            System.out.print("Amarillo " + puntaje2 + " puntos!!!"); 
            } 

        else if (coor_x >18 && coor_y <= 25) { 
            int    puntaje3 = 2; 
            System.out.print("Verde " + puntaje3 + " puntos!!!"); 
            } 

        else if (coor_x >25 && coor_y <= 31) { 
            int    puntaje4 = 1; 
            System.out.print("Azul " + puntaje4 + " puntos!!!"); 
        }
            else {
                System.out.print("0 puntos!!! dardo caído"); 

               } 
             }
          } 