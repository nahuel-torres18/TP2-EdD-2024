package ejercicio_2;

import java.util.ArrayList;

public class AdministradorDeLista {
	private ArrayList<String> arrayList;
	
	public AdministradorDeLista() {
		arrayList = new ArrayList<>();
	}
	
	public void añadirElemento(String elemento) {
		arrayList.add(elemento);
	}
	
	public void eliminarElemento(String elemento) {
		if (arrayList.remove(elemento)) {
			System.out.println("El elemento "+ elemento + " fue eliminado exitosamente");
		} else {
			System.out.println("El elemento" + elemento + " no se encuentra en la lista");
		}
	}
	
	public boolean buscarElemento(String elemento) {
		return arrayList.contains(elemento); //Devuelve true o false, dependiendo si el elemento se encuentra en la lista.
	}
	
	public void mostrarElementos() {
		System.out.println("Elementos del arrayList");
		for (String cadena : arrayList) {
			System.out.println(cadena);
		}
	}
}
