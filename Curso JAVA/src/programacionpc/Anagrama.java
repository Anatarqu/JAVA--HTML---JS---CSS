package programacionpc;
import java.util.HashMap; 
import java.util.Scanner; 

public class Anagrama { 
          static boolean EsAnagrama (String palabra1, String palabra2) 
          { 
              if(palabra1.length() != palabra2.length()) { 
                  return false; 
              } 
              int valor=0; 
              HashMap <Character,Integer> table = new HashMap<Character,Integer>(); 
              for(int i=0; i< palabra1.length();i++) { 
                  table.put(palabra1.charAt(i),1); 
              } 


              for(int i=0; i< palabra2.length();i++) { 
                  if(table.containsKey(palabra2.charAt(i))) { 
                      continue; 
                  } else { 
                      valor=1; 
                      break; 
                  }    
              } 
              return valor == 0; 
          } 


          public static void main(String[] args) { 
              System.out.println("Ingrese la primera palabra: "); 
              Scanner sc= new Scanner(System.in); 
              String palabra1= sc.nextLine(); 
              System.out.println("Ingrese la segunda palabra: "); 
              String palabra2=sc.nextLine(); 
              
               boolean result = EsAnagrama (palabra1,palabra2); 
               if(result) { 
                   System.out.println("La palabra es un Anagrama"); 
               } else{ 
                   System.out.println("La palabra no es un Anagrama");    
               } 
          } 
   } 