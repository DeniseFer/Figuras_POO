package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Retangulo {

Scanner sc = new Scanner(System.in);

// ATRIBUTOS;
	private double base;
	private double altura;
	
	
// CONSTRUTOR
	
	public Retangulo() {
		this.base = 0.0;
		this.altura = 0.0;
		
		
	}
	
// MÉTODO PRA ALTERAR ATRIBUTOS
	
	public void setlistaAtributos2() {
		
		System.out.println("Digite o valor da base do retângulo:\n");
		this.base = sc.nextDouble();
		
		System.out.println("Digite o valor da altura do retângulo:\n");
		this.altura = sc.nextDouble();
		
		System.out.println("\nValor da Base:" + base);
		System.out.println("Valor da Altura:" + altura);
		
	}
	
// ÁREA
	
	public void getcalcArea2(){
		double area = base * altura;
		System.out.println("Área do Retângulo: "+area);
	}
	
	
	
	
}
