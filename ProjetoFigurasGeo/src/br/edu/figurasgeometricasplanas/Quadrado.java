package br.edu.figurasgeometricasplanas;

public class Quadrado {
	
	private double lado;
	
	// CONSTRUTOR
	
	public Quadrado(double lado){  
		this.lado = lado;
		System.out.println("Lado do quadrado: " + lado);
	
	}
	
	
	// MÉTODOS
	public  void getcalcArea1() {
		double area = Math.pow(lado, 2);
		System.out.println("Área do quadrado: "+ area);
		
	}
	
	
	
	
	

}
