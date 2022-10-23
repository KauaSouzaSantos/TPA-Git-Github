package facaEnquanto;

import java.util.Scanner;

public class VelhoNovo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 1, idade, idadeNovo = 0, idadeVelho = 0;
		String nome, nomeNovo = null, nomeVelho = null;
		 
		 do {
			 System.out.println("Digite o nome do " + i + " usuário:");
			 nome = in.next();
			 
			 System.out.println("Digite a idade do " + i + " usuário:");
			 idade = in.nextInt();
			 
			 if (i == 1) {
				 nomeNovo = nomeVelho = nome;
				 idadeNovo = idadeVelho = idade;
			 }
			 
			 if (idade > idadeVelho) {
				 nomeVelho = nome;
				 idadeVelho = idade;
			 } else if (idade < idadeNovo) {
				 nomeNovo = nome;
				 idadeNovo = idade;
			 }
			 i++;
		 } while (i <= 10);
		 
		 System.out.println("Usuário mais velho: " + nomeVelho + "\nIdade: " + idadeVelho);
		 System.out.println("Usuário mais novo: " + nomeNovo + "\nIdade: " + idadeNovo);
		 System.out.println("Fim do programa.");
		 in.close();
	}
}