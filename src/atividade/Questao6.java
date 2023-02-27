package atividade;

import java.util.Scanner;

public class Questao6 {
	 public static void main(String[] args) {
		 
		    Scanner leitor = new Scanner(System.in);
		    boolean finalizador = false;
		    int option;
		    int tamanho;
		    int tamanho2;
		    int numero;
		  
	 do {
		 System.out.println(" \n O que deseja fazer ? \n \n"
		 		+ "1- Escrever seu nome para que o programa o imprima \n \n"
				 + "2- Adicinar uma frase que será repetida \n \n"
				 + "3- Adicionar uma frase que será repetida(V2) \n \n"
				 + "4- Exercicio de geometria \n \n " 
				 + "5- Adicionar uma frase e escolher o número de colunas e linhas \n \n "
				 + 
				 "6- Encerrar programa");
		 option = leitor.nextInt();
		 leitor.nextLine();
		 if(option == 1) {
				System.out.println("Diga o teu nome");
				 String nome = leitor.nextLine();
				
			System.out.println("ola " + nome + "!" );
		 }
if(option == 2) {
	System.out.println("Digite uma frase: ");
	String frase = leitor.nextLine();
	System.out.println("Digite quantas vezes você deseja repetir a frase");
	  tamanho = leitor.nextInt();
	  numero = 0;
	   for( numero = 0; numero < tamanho; numero++) {
		   System.out.println(frase);
	   }
		 }
if(option == 3) {
	System.out.println("Digite quantas vezes você deseja repetir a frase");
	   tamanho = leitor.nextInt();
	  leitor.nextLine();
	System.out.println("Digite uma frase a ser repetida: ");
	String frase = leitor.nextLine();
	  numero = 0;
	   for( numero = 0; numero < tamanho; numero++) {
		   System.out.println(frase);
	   }
}
if(option == 4) {
	System.out.println("Informe a altura de um retângulo");
	double altura = leitor.nextDouble();
	System.out.println("Informe a base de um retângulo");
	double base  = leitor.nextDouble();
	System.out.println("A area do retangulo vai ser: " + base*altura);
	System.out.println("Enquanto o perimetro vai ser: " + 2*(base + altura));
}
if(option == 5) {
	System.out.println("Digite quantas linhas você deseja que a palavra se repita");
	   tamanho = leitor.nextInt();
	  System.out.println("Digite quantas colunas você deseja que a palavra se repita");
	   tamanho2 = leitor.nextInt();
	  leitor.nextLine();
	System.out.println("Digite uma palavra a ser repetida: ");
	String frase = leitor.next();
	    numero = 0;
	  int numero2 = 0;
	   for( numero = 0; numero < tamanho; numero++) {
		   for(numero2 = 0; numero2 < tamanho2; numero2++) {
			   System.out.printf(frase + " ");
		   }
		  System.out.println("\n");
	   }
}
if(option == 6) {
	 finalizador = true;
	 }
	 }
	  while(finalizador == false);
	 }
	 }
