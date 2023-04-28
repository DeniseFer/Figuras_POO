package br.edu.figurasGeo;

public class Triangulo {
	//atributos
	private double base;  // encapsulei atributos
	private double altura;
	

	//construtor
	public Triangulo(double base, double altura){
	this.base  = base;
	this.altura = altura;
	
	System.out.println("Base do triângulo:" + base);
	System.out.println("Altura do triângulo:" + altura);
	}

	//metodos
	public void calcArea(){
	double area = (base*altura)/2;	
	System.out.println("Área do triângulo:" + area);
	}
	                      }