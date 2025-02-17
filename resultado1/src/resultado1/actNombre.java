package resultado1;

import java.util.Scanner;

public class actNombre {

	public static void main(String[] args) {
		var lt = new Scanner(System.in);
		var cant=0;
		var nomMay="";
		var nombre="";
		var  posicion=0;
		
		System.out.println("que cantidad de nombres quiere ingresar");
		cant = lt.nextInt();
		
		String[] nombres = new String[cant];
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("digite el nombre N."+(i+1));
			nombres[i] = lt.next();
		}
		System.out.println("______________________________________________________________________________________\nNOMBRES");
		 for (String i : nombres) {
	            System.out.print(i + "<<<*>>> ");
	        }
		 System.out.println();
		 
		 for (int i = 0; i < nombres.length; i++) {
			 
			
				 nombre=nombres[i];
				
			 if (nombre.length()>nomMay.length()) {
				 nomMay=nombre;
				 posicion=i+1;
			 }
			
		}
		 System.out.println("el nombre con mayor cantidad de caracteres es: <<"+nomMay+">> con "+nomMay.length()+" caracteres,  en la posicion:"+ posicion);
		 
		
			 
			
		}
		 
		
	}


