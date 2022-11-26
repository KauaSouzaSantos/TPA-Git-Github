/*
	#5 - Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
	imprima cada elemento do vetor A e a relação de todos os divisores do 
	respectivo elemento;
*/

package Vetores;

import java.util.Scanner;

public class VetorRespectivosDivisores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10, a[], i, d;
		
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
				System.out.print(a[i] + "]");
			} else {
				System.out.print(a[i] + " ");
			}
		}
		
		for (i = 0; i < n; i++) {
			System.out.println("\n\nDivisores de " + a[i] + ":");
			
			for (d = 1; d <= a[i]; d++) {
				if (a[i] % d == 0) {
					System.out.print(d + " ");
				}
			}
		}
		in.close();
	}
}
