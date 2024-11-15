package ejercicio_1;

import java.util.Scanner;
import java.time.LocalDate;

public class Principal {
	
	public static Empleado[] arrayEmpleados(int tamaño, Scanner input) {
		Empleado[] arrayEmpleados = new Empleado[tamaño];
		for (int i = 0; i < tamaño; i++) {
			arrayEmpleados[i] = new Empleado(Helper.validarCuil(input, "Ingrese el CUIL: "), Helper.leerCadena(input, "Ingrese su apellido y nombre: "),
					LocalDate.of(Helper.validarEntero(input, "Ingrese el año: "), Helper.validarEntero(input, "Ingrese el mes: "), Helper.validarEntero(input, "Ingrese el dia: ")), Helper.validarDouble(input, "Ingrese su sueldo: "),
					Helper.leerCadena(input, "Ingrese el nombre del departamento: "));
		}
		return arrayEmpleados;
	}
	
	public static void mostrar(Empleado[] arrayEmpleados) {
		for (Empleado aux : arrayEmpleados) {
			System.out.println(aux.toString());
		}
	}
	
	public static void sumarSueldos(Empleado[] arrayEmpleados) {
		double suma = 0;
		for (int i = 0; i < arrayEmpleados.length; i++) {
			suma += arrayEmpleados[i].getSueldo();
		}
		System.out.println("La suma de todos los sueldos es: " + suma);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tanaño = Helper.validarEntero(input, "Ingrese el tamaño del array: ");
		
		Empleado[] arrayEmpleados = arrayEmpleados(tanaño, input);
		sumarSueldos(arrayEmpleados);
		mostrar(arrayEmpleados);
	}
}
