package atividade;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[]args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite quantas linhas você deseja que a palavra se repita");
		  int tamanho = leitor.nextInt();
		  System.out.println("Digite quantas colunas você deseja que a palavra se repita");
		  int tamanho2 = leitor.nextInt();
		  leitor.nextLine();
		System.out.println("Digite uma palavra a ser repetida: ");
		String frase = leitor.next();
		  int numero = 0;
		  int numero2 = 0;
		   for( numero = 0; numero < tamanho; numero++) {
			   for(numero2 = 0; numero2 < tamanho2; numero2++) {
				   System.out.printf(frase + " ");
			   }
			  System.out.println("\n");
		   }
	}
}
