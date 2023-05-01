package br.eu.principal;

import br.edu.figurasgeometricasespaciais.*;
import br.edu.figurasgeometricasplanas.*;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		
		//TRIÂNGULO ENCAPSULAMENTO
		
		System.out.println("==============TRIÂNGULO============\n");
		Triangulo obj = new Triangulo(5,6); // cria objeto do tipo Triangulo
		obj.getcalcArea();
		
		
		// QUADRADO ENCAPSULAMENTO
		
		System.out.println("\n==============QUADRADO============\n");
		Quadrado obj1 = new Quadrado(4); // CONSTRUTOR DEU VALOR AOS ATRIBUTOS
		obj1.getcalcArea1();
		
		
		
		// DEIXO DE USAR CONSTRUTOR
		
		
		
		// RETÂNGULO
		
		System.out.println("\n==============RETÂNGULO============\n"); 
		
		Retangulo obj2 = new Retangulo();
		obj2.setlistaAtributos2();
		obj2.getcalcArea2();
		
		// PARALELOGRAMO
		
        System.out.println("\n==============PARALELOGRAMO============\n"); 
		
		Paralelogramo obj3 = new Paralelogramo();
		obj3.setlistaAtributos3();
		obj3.getcalcArea3(); 
		
		
		// LOSANGO
		
		System.out.println("\n==============LOSANGO============\n"); 
		
		Losango obj4 = new Losango();
		obj4.setlistaAtributos4();
		obj4.getcalcArea4();
		
		// TRAPEZIO
		
		System.out.println("\n==============TRAPÉZIO============\n");
		
		Trapezio obj5 = new Trapezio();
		obj5.setlistaAtributos5();
		obj5.getcalcArea5();
		
		
		// CIRCULO
		
		System.out.println("\n==============CÍRCULO============\n"); 
		
		Circulo obj6 = new Circulo();
		obj6.setlistaAtributos6();
		obj6.getcalcArea6();   
		
		
		*/
		
		
		// ================================FIGURAS ESPACIAIS====================================
		
		
		System.out.println("\n==============Cilindro============\n"); 
		
		Cilindro obj7 = new Cilindro();
		obj7.setlistaAtributos();
		obj7.getcalcAreaBase();  
		obj7.getcalcAreaLateral();
		obj7.getcalcAreaTotal();
		obj7.getcalcVolume();
		
	}

}
