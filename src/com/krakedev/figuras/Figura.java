package com.krakedev.figuras;

public abstract class Figura {
	private String nombre;
	private String color;

	// Constructores
	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	// GET Y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// METODOS
	@Override
	public String toString() {
		return "Nombre=" + nombre + " ||| Color=" + color;
	}

	public abstract int calcularArea();
	public abstract int calcularPerimetro();
	
	public void imprimirInfo() {
		System.out.println("Nombre: "+nombre);
	}

}
