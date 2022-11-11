// A série de Fibonacci é formada pela sequência: 1, 1, 2, 3, 5, 8, 13, 21, 34...
//Criar um programa que imprima a série de Fibonacci até o enésimo termo, onde N (o número de termos) deverá ser informado pelo usuário;

package para;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N, primeiro = 0, segundo = 1, proximo;
		
		System.out.println("Até qual termo da sequência deseja ver?");
		N = in.nextInt();
		
		in.close();
		
		System.out.print("1 ");
		
		for (int i = 1; i < N; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.print(proximo + " ");
		}
	}

}
