package para;

import java.util.Scanner;

public class idadesUsuarios {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		int anoAtual = 0, anoNascimento, idade, i, idadeVelho = 0, idadeNovo = 0;
		
		System.out.println("Informe o ano atual:");
		anoAtual = in.nextInt();
		
		for (i = 1; i <= 10; i++) {
			
			System.out.println("Informe o ano de nascimento do " + i + "° usuário:");
			anoNascimento = in.nextInt();
			
			idade = anoAtual - anoNascimento;
			
			if (i == 1) {
				idadeVelho = idadeNovo = idade;
			}

			if (idade > idadeVelho) {
				idadeVelho = idade;
			} else if (idade < idadeNovo) {
				idadeNovo = idade;
			}
			
			System.out.println("A idade desse usuário que nasceu em " + anoNascimento + " é: " + idade + " anos ");
			System.out.println();
		}
		
		System.out.println("Dentre todos os usuários cadastrados o mais usuário mais velho nasceu no ano de " + (anoAtual - idadeVelho) + " e possui " + idadeVelho + " anos de idade.");
		System.out.println("E o mais novo nasceu no ano de " + (anoAtual - idadeNovo) + " e possui " + idadeNovo + " anos de idade.");
		in.close();
	}
}
