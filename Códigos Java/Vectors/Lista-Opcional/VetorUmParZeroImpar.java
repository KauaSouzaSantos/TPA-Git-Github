/*
	#13 - Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, 
	obedecendo as seguintes regras de formação: 
	a) B[i] deverá receber 1 quando A[i] for par;
	b) B[i] deverá receber 0 quando A[i] for ímpar;
 */

package Vetores;

import java.util.Scanner;

public class VetorUmParZeroImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10, a[], b[], i;
		
		a = new int[n];
		b = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe o valor da %1d° posição do vetor A: ", (i + 1));
	  	    a[i] = in.nextInt();
		}
		
		for (i = 0; i < n; i++) {
			
			if (a[i] % 2 == 0) {
				b[i] = 1;
			} else {
				b[i] = 0;
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
