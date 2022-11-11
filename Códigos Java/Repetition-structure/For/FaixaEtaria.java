// Faça um programa que receba a idade de 15 pessoas, calcule e mostre:
// <> A quantidade de pessoas em cada faixa etária;
// <> A porcentagem de pessoas em cada faixa etária;

/* 
Faixa Etária <--> Idade

1ª <--> Até 15 anos
2ª <--> De 16 a 30 anos
3ª <--> De 31 a 45 anos
4ª <--> De 46 a 60 anos
5ª <--> Acima de 61 anos
*/

package para;

import java.util.Scanner;

public class FaixaEtaria {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade, i, faixaUm = 0, faixaDois = 0, faixaTres = 0, faixaQuatro = 0, faixaCinco = 0;
		
		for (i = 1; i <= 15; i++) {
			
			System.out.println("Informe a idade do " + i + "° usuário:");
			idade = in.nextInt();
			
			in.close();
			
			if (idade <= 15) {
				faixaUm += 1;
			} else if (idade <= 30) {
				faixaDois += 1;
			} else if (idade <= 45) {
				faixaTres += 1;
			} else if (idade <= 60) {
				faixaQuatro += 1;
			} else {
				faixaCinco += 1;
			}
		}
		
		System.out.println("Quantidade de pessoas por faixas e porcentagem:");
		System.out.println("Total de pessoas: 15 - 100%");
		System.out.println("1° Faixa: " + faixaUm + " - " + (faixaUm * 100 / 15) + "%" + 
				"\n2° Faixa: " + faixaDois + " - " + (faixaDois * 100 / 15) + "%" +
				"\n3° Faixa: " + faixaTres + " - " + (faixaTres * 100 / 15) + "%" +
				"\n4° Faixa: " + faixaQuatro + " - " + (faixaQuatro * 100 / 15) + "%" +
				"\n5° Faixa: " + faixaCinco + " - " + (faixaCinco * 100 / 15) + "%");
	}
}
