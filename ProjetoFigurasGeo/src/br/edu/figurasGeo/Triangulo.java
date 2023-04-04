package br.edu.figurasGeo;

public class Triangulo {
  public double altura;
  public double base;
  public double area;

public void calcArea1() {
	area = (base * altura) / 2;
	System.out.println("A área é igual a "+ area);
	
}

public double calcArea2() {
	area = (base * altura) / 2;
	return area;
}

public void calcArea3(double b, double h) {
	area = (b * h) / 2;
	System.out.println("A área é imegual a "+ area);
}

public void ListaAtributos( ) {
	System.out.println("OS ATRIBUTOS SÃO: \n" + "A altura é: "+altura );
	System.out.println("A base é: "+ base);
	System.out.println("A area é: "+ area);
}

}

