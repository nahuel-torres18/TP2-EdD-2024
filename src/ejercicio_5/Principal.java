package ejercicio_5;

import java.util.ArrayList;

public class Principal {
	public static void mostrarInterseccion(char[] array1, char[] array2, ArrayList<Character> listaCarateres) {
		for (char letra1 : array1) {
			for (char letra2 : array2) {
				if (letra1 == letra2) {
					if (!listaCarateres.contains(letra1)) {
						listaCarateres.add(letra1);
					}
				}
			}
		}
		if (listaCarateres.isEmpty()) {
			System.out.println("No habia elementos comunes en los arrays de caracteres");
		} else {
			System.out.println("Elementos comunes en el array");
			for (char letra : listaCarateres) {
				System.out.print(letra + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Character> listaCarateres = new ArrayList<Character>();
		
		char[] array1 = {'a', 'b', 'c', 'd'};
		char[] array2 = {'e', 'f', 'a', 'g', 'd', 'c', 'h', 'i'};
		mostrarInterseccion(array1, array2, listaCarateres);
		
	}
}
