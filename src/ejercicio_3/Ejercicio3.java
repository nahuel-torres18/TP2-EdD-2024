package ejercicio_3;

import java.util.Random;

public class Ejercicio3 {
	
	public static void mostrarNumeroMaximoYMinimo(int numero, Random random) {
		int[] numeros = new int[numero];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100)+1;
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		int mayor = numeros[0], menor = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			} else if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		System.out.println("El numero mayor del array es el: " + mayor);
		System.out.println("El numero menor del array es el: " + menor);
	}

	public static void main(String[] args) {
		Random random = new Random();
		int numero = random.nextInt(100)+1;
		mostrarNumeroMaximoYMinimo(numero, random);
	}

}
