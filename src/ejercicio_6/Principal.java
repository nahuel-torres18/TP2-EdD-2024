package ejercicio_6;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import ejercicio_1.Helper;

public class Principal {
	
	public static int[][] cargarMatriz(int[][] matrizNumeros, Random random) {
		for (int i = 0; i < matrizNumeros.length; i++) {
			for (int j = 0; j < matrizNumeros[i].length; j++) {
				matrizNumeros[i][j] = random.nextInt(100)+1;
			}
		}
		return matrizNumeros;
	}
	
	public static void mostrar(int[][] matrizNumeros) {
		for (int[] fila : matrizNumeros) {
			for (int columna : fila) {
				System.out.print(columna + " ");
			}
			System.out.println();
		}
	}
	
	public static String encontarPosicionNumero(int numero, int[][] matrizNumeros) {
		for (int i = 0; i < matrizNumeros.length; i++) {
			for (int j = 0; j < matrizNumeros[i].length; j++) {
				if (numero == matrizNumeros[i][j]) {
					return "Numero encontrado en la posicion (" + i + "," + j +")";
				}
			}
		}
		return "Numero no encontrado";
	}
	
	public static String buscarLado(int fila, int columna, String direccion, int[][] matriz) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		if (direccion.equalsIgnoreCase("izquierda")) {
			if (columna > 0) {
				for (int i = columna-1; i >= 0; i--) {
					lista.add(matriz[fila][i]);
				}
				return "Numeros a la izquierda " + lista; 
			} else {
				return "No hay números a la derecha/izquierda de la posición indicada";
			}
		} else if (direccion.equalsIgnoreCase("derecha")) {
			if (columna > columna-1) {
				for (int i = columna+1; i <= matriz[fila].length-1; i++) {
					lista.add(matriz[fila][i]);
				}
				return "Numeros a la derecha " + lista;
			} else {
				return "No hay numeros a la derecha/izquierda de la posicion indicada";
			}
		} else {
			return "Direccion no valida. Use 'izquierda' o 'derecha'";
		}
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		int[][] arrayNumeros = new int[Helper.validarEntero(input, "Ingrese el tamaño de la fila M: ")][Helper.validarEntero(input, "Ingrese el tamaño de la columna N: ")];
		
		arrayNumeros = cargarMatriz(arrayNumeros, random);
		mostrar(arrayNumeros);
		System.out.println(encontarPosicionNumero(Helper.validarEntero(input, "Ingrese el numero que quiere saber su posicion: "), arrayNumeros));
		int fila = Helper.validarEntero(input, "Ingrese la fila a buscar: ");
		int columna = Helper.validarEntero(input,"Ingrese la columna a buscar: ");
		System.out.println(buscarLado(fila, columna , Helper.leerCadena(input, "Ingrese la direccion (izquierda/derecha): "), arrayNumeros));
	}
}
