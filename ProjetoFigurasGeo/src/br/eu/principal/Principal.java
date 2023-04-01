package br.eu.principal;

import br.edu.figurasGeo.Triangulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo obj = new Triangulo(); // cria objeto do tipo Triangulo
		obj.base = 9;
		obj.altura = 7;
		obj.area = 9.7;
		
		System.out.println("A base desse triângulo é: "+ obj.base);
		System.out.println("A altura desse triângulo é: "+ obj.altura);
		System.out.println("A area desse triângulo é: "+ obj.area);
		

	}

}
