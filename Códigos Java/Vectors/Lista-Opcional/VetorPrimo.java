/*
	#3 - Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
	imprima cada elemento do vetor A e uma mensagem indicando se o 
	respectivo elemento é um número primo ou não;
*/

package Vetores;

import java.util.Scanner;

public class VetorPrimo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10, a[], i, p, qtdDiv = 0;
		
		a = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe o valor da %d° posição do vetor A: ", (i + 1));
			a[i] = in.nextInt();
		}
		
	  	System.out.print("\nVetor A: ");
		for (i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print("[" + a[i] + " ");
			} else if (i == n - 1) {
				System.out.print(a[i] + "]\n");
			} else {
				System.out.print(a[i] + " ");
			}
		}
		
		for (i = 0; i < n; i++) {
			
			for (p = 1; p <= a[i]; p++) {
				if (a[i] % p == 0) {
					qtdDiv += 1;
				}
			}
			
			if (qtdDiv == 2) {
				System.out.printf("%d é primo! | ", a[i]);
			} else {
				System.out.printf("%d não é primo! | ", a[i]);
			}
			qtdDiv = 0;
		}
		in.close();
	}
}
