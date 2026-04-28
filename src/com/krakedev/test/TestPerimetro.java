package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado cuadrado = new Cuadrado("Cuadrado","Rojo",10);
		Rectangulo rectangulo = new Rectangulo("Rectangulo", "Rosa",10,20);
		
		
		
		System.out.println("--Perimetro Cuadrado");
		System.out.println(cuadrado.calcularPerimetro());
		System.out.println("--Perimetro Rectangulo");
		System.out.println(rectangulo.calcularPerimetro());
	}

}
