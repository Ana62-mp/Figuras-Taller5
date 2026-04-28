package com.krakedev.figuras;

public class Rectangulo extends Figura {
	private int base;
	private int altura;

	public Rectangulo(String nombre, String color, int base, int altura) {
		super(nombre, color);
		this.altura = altura;
		this.base = base;
	}

	public int calcularPerimetro() {
		return (2 * base) + (2 * altura);
	}
}
