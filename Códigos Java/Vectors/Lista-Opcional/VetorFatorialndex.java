/*
	#7 - Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
	mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do 
	elemento correspondente em A;
 */

package Vetores;

import java.util.Scanner;

public class VetorFatorialndex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 15, a[], i;
		double fatorial = 1, b[];
		
		a = new int[n];
		b = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe o valor da %d° posição do vetor A: ", (i + 1));
			a[i] = in.nextInt();
			
			for (int f = a[i]; f >= 1; f--) {
				fatorial *= f;
			}
			
			b[i] = fatorial;
			fatorial = 1;
		}
		
		System.out.print("\nVetor A: ");
		for (i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print("[" + a[i] + " ");
			} else if (i == n - 1) {
				System.out.print(a[i] + "]");
			} else {
				System.out.print(a[i] + " ");
			}
		}
		
		System.out.print("\nVetor B: ");
		for (i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print("[" + b[i] + " ");
			} else if (i == n - 1) {
				System.out.print(b[i] + "]");
			} else {
				System.out.print(b[i] + " ");
			}
		}
		in.close();
	}
}
