package atividade;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[]args){
	Scanner leitor = new Scanner(System.in);
	System.out.println("Informe a altura de um retângulo");
	double altura = leitor.nextDouble();
	System.out.println("Informe a base de um retângulo");
	double base  = leitor.nextDouble();
	System.out.println("A area do retangulo vai ser: " + base*altura);
	System.out.println("Enquanto o perimetro vai ser: " + 2*(base + altura));
	
	}
}
