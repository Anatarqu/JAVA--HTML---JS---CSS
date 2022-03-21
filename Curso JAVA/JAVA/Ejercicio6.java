import java.util.Scanner;
public class Ejercicio6 {
 public static void main (String [] arg) {

    System.out.println ("Jugador A: ");
    Scanner puntos1;
    puntos1 = new Scanner (System.in);
    int puntosA = puntos1.nextInt();
   
    System.out.println ("Jugador B: ");
    Scanner puntos2;
    puntos2 = new Scanner (System.in);
    int puntosB = puntos2.nextInt();

    if(puntosA > 7 || puntosB > 7) {
        System.out.println ("puntuación invalida");
    } else if ((puntosA <5 && puntosB >6) || (puntosB <5 && puntosA >6)) {
        System.out.println ("puntuación invalida");
    } else if (puntosA == 6 && puntosB <5) {
        System.out.println ("Gana jugador A");
    } else if (puntosB == 6 && puntosA <5) {
        System.out.println ("Gana jugador B");
    } else if (puntosA == 7 && puntosB <=5 && puntosB >= 6){
        System.out.println ("Gana jugardor A");
    } else if (puntosB == 7 && puntosA <=5 && puntosA >= 6) {
        System.out.println ("Gana jugardor B");
    } else if ((puntosA == puntosB && puntosA <7) || (puntosA != puntosB && puntosA < 7)) {
        System.out.println ("El set no ha terminado");
    } else {
        System.out.println ("puntuación invalida");
    }
    puntos1.close();
    puntos2.close();
    }
 }
