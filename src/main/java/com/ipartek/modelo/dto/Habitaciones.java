package com.ipartek.modelo.dto;

public class Habitaciones {
	private int id;
	private int numeroHabitacion;
	private int numeroCamas;
	private int metros;
	private double precio;
	private boolean exterior;
	
	public Habitaciones(int id, int numeroHabitacion, int numeroCamas, int metros, double precio, boolean exterior) {
		super();
		this.id = id;
		this.numeroHabitacion = numeroHabitacion;
		this.numeroCamas = numeroCamas;
		this.metros = metros;
		this.precio = precio;
		this.exterior = exterior;
	}
	
	public Habitaciones() {
		super();
		this.id = 0;
		this.numeroHabitacion = 0;
		this.numeroCamas = 0;
		this.metros = 0;
		this.precio = 0.0;
		this.exterior = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public int getNumeroCamas() {
		return numeroCamas;
	}

	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isExterior() {
		return exterior;
	}

	public void setExterior(boolean exterior) {
		this.exterior = exterior;
	}

	@Override
	public String toString() {
		return "Habitaciones [id=" + id + ", numeroHabitacion=" + numeroHabitacion + ", numeroCamas=" + numeroCamas
				+ ", metros=" + metros + ", precio=" + precio + ", exterior=" + exterior + "]";
	}
	
	
	
	
}
