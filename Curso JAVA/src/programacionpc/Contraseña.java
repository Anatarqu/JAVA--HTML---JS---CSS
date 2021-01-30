package programacionpc;
import java.util.Scanner;
import java.util.Arrays;

public class Contraseña {
public static void main(String[] args) {
				Scanner entrada=new Scanner(System.in);	
				char[] cadena=pedir_Cadena(entrada);
				
				if(comprobar_Seguridad(cadena)==true) {
				System.out.print("La contraseña es segura");
				}
				else {
				System.out.print("La contraseña no es segura");	
				}
			}
			
			static char[] pedir_Cadena(Scanner entrada) {
				System.out.print("Una contraseña es segura si tiene 10 o mas caracteres, tiene al menos un digito, al menos una letra, y al menos un simbolo\nIngrese la contraseña: ");
				String contraseña=entrada.nextLine();
				return contraseña.toCharArray();
			}
			
			static boolean comprobar_Seguridad(char[] cadena) {
				boolean letra=false, simbolo=false, digito=false; 
				if(cadena.length >= 10) {
					for(int i=0;i<cadena.length;i++) {
					if(comprobar_Letra(cadena[i])==true) {
						letra=true;
					}if (comprobar_Digito(cadena[i])==true) {
						digito=true;
					}else {
						simbolo=true;
					}
					}
					
				if(letra==true && digito==true && simbolo==true) {
				return true;
				}else {	
				}
				}
				else {
				return false;
				}
				return simbolo;	
			}

			static boolean comprobar_Letra(char letra) {
				int i= letra;
				int j= letra;
				do {
					if(letra==i || letra==j) {
						return true;	
					}
					i++;
					j++;
				}while(i< i && j<= letra);
				
				return false;
			}
			
			static boolean comprobar_Digito(char letra) {
				for (int i=0; i<=9; i++) {
					if(letra==i) {
				}
				return true;
				}
			    return false;
			    }
			    }  