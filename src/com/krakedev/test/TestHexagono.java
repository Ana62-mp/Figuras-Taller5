package com.krakedev.test;

import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Hexagono;

public class TestHexagono {

	public static void main(String[] args) {
		
		Hexagono hex = new Hexagono("Hexagono", "Azul", 6);

		System.out.println("--Perimetro Hexagono");
		System.out.println(hex.calcularPerimetro());

		System.out.println("--Area Hexagono");
		System.out.println(hex.calcularArea());

		// Polimorfismo
		Figura figura = new Hexagono("Hexagono Poli", "Verde", 6);
		
		System.out.println("--Perimetro Figura-Hexagono");
		System.out.println(figura.calcularPerimetro());

		System.out.println("--Area Figura-Hexagono");
		System.out.println(figura.calcularArea());

		// Método heredado
		hex.imprimirInfo();
		figura.imprimirInfo();
	}
}