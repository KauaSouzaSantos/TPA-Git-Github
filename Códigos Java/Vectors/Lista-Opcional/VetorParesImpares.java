/*
	#1 - Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de 
	A utilizando apenas um vetor extra B. Sugestão: no início do vetor B 
	armazene os elementos pares de A e nas posições restantes do vetor B 
	armazene os elementos de A que são ímpares;
*/

package Vetores;

import java.util.Scanner;

public class VetorParesImpares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 20, a[], b[], i, par = 0, impar = n - 1;
		
		a = new int[n];
		b = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Digite o %d° valor: ", (i + 1));
			a[i] = in.nextInt();
		}

		for (i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				b[par] = a[i];
				par++;
			} else {
				b[impar] = a[i];
				impar--;
			}
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
