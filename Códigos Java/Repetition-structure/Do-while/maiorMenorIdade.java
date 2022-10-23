package facaEnquanto;

import java.util.Scanner;

public class maiorMenorIdade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoAtual, nascimento, idade, resposta = 1;
		
		System.out.println("Digite o ano atual:");
		anoAtual = in.nextInt();
		
		do {
			
			System.out.println("Digite o seu ano de nascimento: ");
			nascimento = in.nextInt();
			
			idade = anoAtual - nascimento;
			
			if (idade >= 18) {
				System.out.println("Você é maior de idade");
			} else {
				System.out.println("Você é menor de idade");
			}
			
			System.out.println("Deseja continuar a execução? \n[ 1 ] - Sim \n[ 2 ] - Não");
			System.out.println("Sua Opção: ");
			resposta = in.nextInt();
			
		} while(resposta == 1);
		System.out.println("Fim do programa.");
		in.close();
	}
}
