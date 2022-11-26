/*
	Criar um vetor A que leia 10 valores inteiros.
	Calcule e apresente a média dos dez valores lidos;
 */


package Vetores;

import java.util.Scanner;

public class MediaVetores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10, a[], i;
		double acumulador = 0;
		
		a = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe o %d° valor do vetor A: ", (i + 1));
			a[i] = in.nextInt();
			acumulador += a[i];
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
		System.out.print("\nMédia do vetor A: " + (acumulador / n));
		in.close();
	}
}
