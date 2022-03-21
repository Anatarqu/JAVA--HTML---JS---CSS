class Ejercicio9 {
  public static void main(String[] args) {
    Scanner sc = Scanner (System.in);
    System.out.println ("Introduce un número: ");
    int x = sc.nextInt ();

    int i=1;
    boolean eaPrimo=true;
    while(i<=x && esPrimo) {
      if ((i != 1 && i!=x) && (x % i == 0)) {
        esPrimo =false;
        System.out.println ("El número no es primo");
      }
      i++ ;
        if (esPrimo){
          System.out.println ("es primo");
        }
    }
}
}