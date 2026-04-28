package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado cuadrado = new Cuadrado("Cuadrado","Rojo",10);
		Rectangulo rectangulo = new Rectangulo("Rectangulo", "Rosa",10,20);
		Graficador graf = new Graficador();
		//Figura figura = new Figura("Figuras","Blanca");
		Figura triangulo = new Triangulo("Figuras-triangulo","Naranja");
		TrianguloRectangulo trianguloRec = new TrianguloRectangulo("Triangulo Rectangulo", "Morado", 4, 2);
		
		
		System.out.println("--Perimetro Cuadrado");
		System.out.println(cuadrado.calcularPerimetro());
		System.out.println("--Perimetro Rectangulo");
		System.out.println(rectangulo.calcularPerimetro());		
		System.out.println("--Perimetro Figura-Triangulo");
		//System.out.println(figura.calcularPerimetro());
		System.out.println(triangulo.calcularPerimetro());
		System.out.println("--Perimetro Triangulo Rectangulo");
		System.out.println(trianguloRec.calcularPerimetro());
		
		//POLIMORFISMO
		graf.graficar(cuadrado);
		graf.graficar(rectangulo);
		graf.graficar(trianguloRec);
		
		triangulo.imprimirInfo();
		cuadrado.imprimirInfo();
		
	}

}
