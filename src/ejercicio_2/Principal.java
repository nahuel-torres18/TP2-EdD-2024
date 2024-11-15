package ejercicio_2;

import ejercicio_1.Helper;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AdministradorDeLista lista1 = new AdministradorDeLista();
		AdministradorDeLista lista2 = new AdministradorDeLista();
		
		lista1.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		lista1.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		lista1.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		lista1.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		
		lista2.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		lista2.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		lista2.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		lista2.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		
		lista1.mostrarElementos();
		lista2.mostrarElementos();
		
		lista1.eliminarElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		lista2.eliminarElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		
		lista1.buscarElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		lista2.buscarElemento(Helper.leerCadena(input, "Ingrese un texto: "));
	}
}
