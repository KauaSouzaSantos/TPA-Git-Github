package facaEnquanto;

import java.util.Scanner;

public class Inss {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 1;
		double salario, desconto;
		
		do {
			System.out.println("Digite o salário do " + i + "° funcionário:");
			salario = in.nextDouble();
			if (salario < 2000) {
				desconto = salario / 100 * 8.5;
				System.out.println("O desconto foi de: R$ " + desconto + " O equivalente a 8,5% do salário total.");
			} else if (salario >= 2000) {
				desconto = salario / 100 * 11;
				System.out.println("O desconto foi de: R$ " + desconto + " O equivalente a 11% do salário total.");
			}
			System.out.println();
			i++;
		} while (i <= 4);
		System.out.println("Fim do programa.");
		in.close();
	}
}
