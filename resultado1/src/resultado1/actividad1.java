package resultado1;


	import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
	import java.util.Scanner;
import java.util.stream.Collectors;

	public class actividad1  {

		public static void main(String[] args) {
		 //REALIZAR UN PRIGRAMA QUE PERMITA LLENAR DOS VECTORES CON NUMEROS ALEATOREOS.
			var lt = new Scanner(System.in)
			;
			
			System.out.println("que tamaño quiere que sea el arreglo?");
			var tamaño = lt.nextInt();
			int[] vecUno= new int[tamaño];
			int[] vecDos= new int[tamaño];
			int[] cont = new int[4];
			
			for (int i = 0; i < vecUno.length; i++) {
				vecUno[i]=(int) (Math.random() * (500 - 1) + 1);
				vecDos[i]=(int) (Math.random() * (500 - 1) + 1);
				}
			System.err.println("vector 1");
			 for (int i : vecUno) {
		            System.out.print(i + " ");
			 }
			 System.err.println("\n______________________________________________________________________________");
			 
			System.err.println("\n vector 2");
			 for (int i : vecDos) {
		            System.out.print(i + " ");
			 }
			 System.err.println("\n______________________________________________________________________________");
			
				
				for (int i = 0; i < vecDos.length; i++) {

					if (vecUno[i] % 2 == 0) {
						cont[0] += 1;

					} else {
						cont[2] += 1;
					}

					if (vecDos[i] % 2 == 0) {
						cont[1] += 1;

					} else {
						cont[3] += 1;
					}			
			} 
				
				
				
				
			 System.err.println("PUNTO A");
			System.out.println("\nla cantidad de numeros pares del vector 1 es "+cont[0]);
			System.out.println("la cantidad de numeros pares del vector 2 es "+cont[1]);
			 System.err.println("\n______________________________________________________________________________");
			 System.err.println("PUNTO B");
			 if (cont[2]>cont[3]) {
				 System.out.println("Los cantidad de numeros impares del vector 1 es mayor que las del vector 2");
			 } else {
				 System.out.println("Los cantidad de numeros impares del vector 2 es mayor que las del vector 1");
			 }
			 System.err.println("\n______________________________________________________________________________");
			 System.err.println("PUNTO C");
			 System.out.println("Vector 1 ordenado de forma descendente: " +
		                Arrays.stream(vecUno).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
			 
			 System.out.println("Vector 2 ordenado de forma descendente: " +
		                Arrays.stream(vecDos).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
			 
			
			 
			 
			 
			
			
			
		}

	}



