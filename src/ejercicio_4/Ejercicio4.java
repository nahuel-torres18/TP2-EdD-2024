package ejercicio_4;

import java.util.Scanner;
import ejercicio_1.Helper;

public class Ejercicio4 {
	
	public static int[] cargarArray(Scanner input, int[] arrayNumeros) {
		for (int i = 0; i < arrayNumeros.length; i++) {
			arrayNumeros[i] = Helper.validarEntero(input, "Ingrese un numero: ");
		}
		return arrayNumeros;
	}
	
	public static void numerosRepetidos(int[] arrayNumeros) {
		boolean repetido = false;
		System.out.print("Numeros repetidos en el array: ");
		for (int i = 0; i < arrayNumeros.length; i++) {
			for (int j = i+1; j < arrayNumeros.length; j++) {
				if (arrayNumeros[i] == arrayNumeros[j]) {
					System.out.print(arrayNumeros[i]+" ");
					repetido = true;
					break;
				}
			}
		}
		System.out.println();
		if (!repetido) {
			System.out.println("No hay elementos repetidos en el array");
		}
	}

	public static void main(String[] args) {
		int[] array_numeros = new int[10];
		Scanner input = new Scanner(System.in);
		array_numeros = cargarArray(input, array_numeros);
		numerosRepetidos(array_numeros);
	}

}
