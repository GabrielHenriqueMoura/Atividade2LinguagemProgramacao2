package atividade;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[]args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = leitor.nextLine();
		System.out.println("Digite quantas vezes você deseja repetir a frase");
		  int tamanho = leitor.nextInt();
		  int numero = 0;
		   for( numero = 0; numero < tamanho; numero++) {
			   System.out.println(frase);
		   }
	}
}
