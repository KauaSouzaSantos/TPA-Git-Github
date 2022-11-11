// Criar um programa que receba a idade de 10 pessoas. Calcule e mostre:
// <> A média das alturas das pessoas;
// <> A idade da pessoa mais jovem;
// <> A idade da pessoa mais velha;

package para;

import java.util.Scanner;

public class AlturasIdadesPesos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade, velho = 0, novo = 0;
		double altura, alturas = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Informe a idade do " + i + "° usuário");
			idade = in.nextInt();
			
			System.out.println("Informe a altura desse mesmo usuário.");
			altura = in.nextDouble();
			
			alturas += altura;
			
			if (i == 1) {
				velho = novo = idade;
			} else {
				
				if (idade < novo) {
					novo = idade;
				} else if (idade > velho) {
					velho = idade;
				}
				
			}
		}
		
		System.out.println("A média de alturas dos usuários foi de : " + (alturas / 10) + "m");
		System.out.println("O usuário mais velho tem : " + velho + " anos de idade.");
		System.out.println("E o usuário mais novo tem : " + novo + " anos de idade.");
		in.close();
	}
}
