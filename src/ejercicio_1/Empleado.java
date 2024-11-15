package ejercicio_1;

import java.time.LocalDate;

public class Empleado {
	
	private int cuil;
	private String apellidoYNombre;
	private LocalDate fechaIngreso; //Usar LocalDate
	private double sueldo;
	private String departamento;
	
	public Empleado() {
		
	}
	
	public Empleado(int cuil, String apellidoYNombre, LocalDate fechaIngreso, double sueldo, String departamento) {
		this.cuil = cuil;
		this.apellidoYNombre = apellidoYNombre;
		this.fechaIngreso = fechaIngreso;
		this.sueldo = sueldo;
		this.departamento = departamento;
	}

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public String getAyN() {
		return apellidoYNombre;
	}

	public void setAyN(String apellidoYNombre) {
		this.apellidoYNombre = apellidoYNombre;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [cuil=" + cuil + ", AyN=" + apellidoYNombre + ", fechaIngreso=" + fechaIngreso + ", sueldo=" + sueldo
				+ ", departamento=" + departamento + "]";
	}
}
