package atividade;

import java.util.Scanner;

public class Questao1{
	public static void main(String[]args){
	Scanner leitor = new Scanner(System.in);
	System.out.println("Diga o teu nome");
	String nome = leitor.nextLine();
	//next = ler até encontrar um espaço
	//nextLine = Lê até o fim do que for escrito
System.out.println("ola " + nome + "!" );

}
}

