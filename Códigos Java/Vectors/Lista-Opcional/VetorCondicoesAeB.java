/*
	#14 - Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho,
	obedecendo as seguintes regras de formação:
	a) C[i] deverá receber 1 quando A[i] for maior que B[i];
	b) C[i] deverá receber 0 quando A[i] for igual a B[i];
	c) C[i] deverá receber -1 quando A[i] for menor que B[i];
 */

package Vetores;

import java.util.Scanner;

public class VetorCondicoesAeB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10, a[], b[], c[], i;
		
		a = new int[n];
		b = new int[n];
		c = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe o valor da %1d° posição do vetor A: ", (i + 1));
	  	    a[i] = in.nextInt();
		}
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe o valor da %1d° posição do vetor B: ", (i + 1));
	  	    b[i] = in.nextInt();
		}
		
		for (i = 0; i < n; i++) {
			
			if (a[i] > b[i]) {
				c[i] = 1;
			} else if (a[i] == b[i]) {
				c[i] = 0;
			} else {
				c[i] = -1;
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
		
		System.out.print("\nVetor C: ");
		for (i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print("[" + c[i] + " ");
			} else if (i == n - 1) {
				System.out.print(c[i] + "]");
			} else {
				System.out.print(c[i] + " ");
			}
		}
		in.close();
	}
}
