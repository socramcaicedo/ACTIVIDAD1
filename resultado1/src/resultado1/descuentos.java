package resultado1;

import java.util.Iterator;
import java.util.Scanner;

public class descuentos {

	public static void main(String[] args) {
		var lt = new Scanner(System.in);
		var cant = 0;
		int[] cont = new int[2];

		System.out.println(" cuantos productos va a ingresar");
		cant = lt.nextInt();

		Double[] precioProd = new Double[cant];
		Double[] descProd = new Double[cant];

		for (int i = 0; i < precioProd.length; i++) {
			System.out.println("escriba el precio del producto N." + (i + 1));
			precioProd[i] = lt.nextDouble();

		}
		for (int i = 0; i < cant; i++) {
			System.out.print("producto " + (i + 1) + "<<>>");
		}
		System.out.println();
		for (int i = 0; i < precioProd.length; i++) {
			cont[0] += 1;
			System.out.print("\nproducto" + (cont[0]) + "\n<< $" + precioProd[i] + " >>");

		}
		System.out.println();
		for (int i = 0; i < precioProd.length; i++) {
			cont[1] += 1;

			var descuento = precioProd[i] >= 55001 ? "10 %" : "5%";
			if (precioProd[i] > 55000) {
				descProd[i] = precioProd[i] - (precioProd[i] * 0.10);
			} else {
				descProd[i] = precioProd[i] - (precioProd[i] * 0.05);

			}
			System.out.println("el producto n." + cont[1] + " tiene un precio $" + precioProd[i]
					+ " y un descuento del " + descuento + " quedando en $" + descProd[i]);

		}

	}

}
