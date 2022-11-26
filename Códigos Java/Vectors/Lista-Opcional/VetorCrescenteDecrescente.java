/*
	#15 - Ler um vetor A com dez elementos inteiros. 
	Criar um vetor B que tenha os 10 elementos de A em ordem crescente
	e um vetor C que tenha os 10 elementos de A em ordem descrescente.
 */

package Vetores;

import java.util.Scanner;

public class VetorCrescenteDecrescente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10, a[], b[], c[], i, aux, atual, proximo;
		
		a = new int[n];
		b = new int[n];
		c = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe o valor da %1d° posição do vetor A: ", (i + 1));
	  	    a[i] = in.nextInt();
	  	    b[i] = a[i];
	  	    c[i] = a[i];
		}
		
		for (i = 0; i < n; i++) {

			for (atual = 0; atual < n - 1; atual++) {
				
				proximo = atual + 1;
				
				if (b[atual] > b[proximo]) {
					aux = b[atual];
					b[atual] = b[proximo];
					b[proximo] = aux;
				}
			}
		}
		
		for (i = 0; i < n; i++) {
			for (atual = 0; atual < n - 1; atual++) {
				
				proximo = atual + 1;
				
				if (c[atual] < c[proximo]) {
					aux = c[atual];
					c[atual] = c[proximo];
					c[proximo] = aux;
				}
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
		
	  	System.out.print("\nVetor B (Crescente): ");
		for (i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print("[" + b[i] + " ");
			} else if (i == n - 1) {
				System.out.print(b[i] + "]");
			} else {
				System.out.print(b[i] + " ");
			}
		}
		
	  	System.out.print("\nVetor C (Decrescente): ");
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
