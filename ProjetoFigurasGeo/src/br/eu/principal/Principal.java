package br.edu.principal;

import br.edu.figurasGeo.Triangulo;

public class Principal {

	public static void main(String[] args) {
	
		Triangulo obj = new Triangulo();
		obj.altura = 2;
		obj.base = 3;
		
		
		

        obj.calcArea1();
		
        double result =  obj.calcArea2();
        System.out.println("A área é ingual a "+result);
        
        obj.calcArea3(obj.base, obj.altura);
        
        obj.ListaAtributos();
        
       
		
	}

}
