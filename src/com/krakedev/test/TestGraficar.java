package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graficador graf = new Graficador();
		Figura figura = new Figura("Figuras","Blanco");
		Triangulo triangulo = new Triangulo("Triangulo", "Azul");
		Cuadrado cuadrado = new Cuadrado("Cuadrado","Rojo");
		Rectangulo rectangulo = new Rectangulo("Rectangulo", "Rosa");
		
		graf.graficar(figura);
		graf.graficar(triangulo);
		graf.graficar(cuadrado);
		graf.graficar(rectangulo);
		
	}

}
