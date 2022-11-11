// Criar um programa que leia um número inteiro e informe ao final se o número lido é primo ou não.
// OBS: Um número primo é um número que só é divisível por 1 e ele mesmo;

package para;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int primo = 0;
		
		System.out.println("Digite um número:");
		int n = in.nextInt();
		
		in.close();
		
		for (int i = 1; i <= n; i++) {
			
			if (n % i == 0) {
				primo += 1;
			}
		}
		if (primo == 2) {
			System.out.println(n + " é primo");
		} else {
			System.out.println(n + " não é primo.");
		}
	}

}
