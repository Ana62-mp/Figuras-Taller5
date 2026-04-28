package com.krakedev.figuras;

public class Triangulo extends Figura {
	public Triangulo(String nombre, String color) {
		super(nombre, color);
	}
	
	@Override
	public int calcularPerimetro() {
		return 20;
	}
	@Override
	public int calcularArea() {
		return 10;
	}
}
