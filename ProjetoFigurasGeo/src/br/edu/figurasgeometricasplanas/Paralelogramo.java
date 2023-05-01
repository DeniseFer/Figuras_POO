package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Paralelogramo {
	Scanner sc = new Scanner(System.in);

	// ATRIBUTOS;
		private double base;
		private double altura;
		
		
	// CONSTRUTOR
		
		public Paralelogramo() {
			this.base = 0.0;
			this.altura = 0.0;
			
			
		}
		
	// MÉTODO PRA ALTERAR ATRIBUTOS
		
		public void setlistaAtributos3() {
			
			System.out.println("Digite o valor da base do paralelogramo:\n");
			this.base = sc.nextDouble();
			
			System.out.println("Digite o valor da altura do paralelogramo:\n");
			this.altura = sc.nextDouble();
			
			System.out.println("\nValor da Base:" + base);
			System.out.println("Valor da Altura:" + altura);
			
		}
		
	// ÁREA
		
		public void getcalcArea3(){
			double area = base * altura;
			System.out.println("Área do Paralelogramo: "+area);
		}
		
		
		
		
	}


