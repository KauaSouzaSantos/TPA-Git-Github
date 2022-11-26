/*
	#1 - Criar um vetor A com 10 inteiros. Calcular e apresentar um vetor B
	onde cada elemento de B será a raiz quadrada do respectivo elemento de A;
*/

package Vetores;

import java.util.Scanner;

public class VetorRaizQuadrada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double b[];
		int n = 10, a[], i;
		
		a = new int [n];
		b = new double [n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe o valor da %d° posição do vetor A: ", (i + 1));
			a[i] = in.nextInt();
			b[i] = Math.sqrt(a[i]);
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
				System.out.printf("[" + b[i] + " ");
			} else if (i == n - 1) {
				System.out.print(b[i] + "]");
			} else {
				System.out.print(b[i] + " ");
			}
		}
		in.close();
	}
}

