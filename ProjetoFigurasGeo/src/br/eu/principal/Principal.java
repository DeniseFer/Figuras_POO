package br.eu.principal;

import br.edu.figurasGeo.Quadrado;
import br.edu.figurasGeo.Triangulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TRIÂNGULO ENCAPSULAMENTO
		
		System.out.println("==============TRIÂNGULO============\n");
		Triangulo obj = new Triangulo(5,6); // cria objeto do tipo Triangulo
		obj.calcArea();
		
		
		// QUADRADO ENCAPSULAMENTO
		
		System.out.println("\n==============QUADRADO============\n");
		Quadrado obj1 = new Quadrado(4); // objeto pelo construtor
		obj1.calcArea1();
		

	}

}
