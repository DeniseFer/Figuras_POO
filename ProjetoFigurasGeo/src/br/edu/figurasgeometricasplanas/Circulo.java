package br.edu.figurasgeometricasplanas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circulo {
	Scanner sc = new Scanner(System.in);

	// ATRIBUTOS;
		private double raio;
		
		
		
	// CONSTRUTOR
		
		public Circulo() {
			this.raio = 0.0;
			
		}
		
		
	// MÉTODO PRA ALTERAR ATRIBUTOS
		
		public void setlistaAtributos6() {
			
			System.out.println("Digite o valor do raio do círculo:\n");
			this.raio = sc.nextDouble();
			
			
			System.out.println("\nValor do raio: " + raio);
			
			
		}
		
	// ÁREA
		
		public void getcalcArea6(){
			double area = Math.pow(raio, 2) * Math.PI;
			System.out.println("Área do Círculo: "+ new DecimalFormat(".##").format(area));
		}
		

}
