package entradaProcessamentoSaida;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		
		int anoNasc, anoAtual, idade;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o ano de nascimento:");
		anoNasc = in.nextInt();
		System.out.println("Digite o ano atual:");
		anoAtual = in.nextInt();
		idade = anoAtual - anoNasc;
		System.out.println("A idade é: " + idade);
		in.close();
	}
}