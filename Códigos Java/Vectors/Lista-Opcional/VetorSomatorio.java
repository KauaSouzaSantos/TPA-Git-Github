/*
	#8 - Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo e tamanho, 
	sendo que cada elemento de B deverá ser o seguinte somatório: 
	B[i] = Somatório de A[j], para todo j variando de i até 10;
 */

package Vetores;

import java.util.Scanner;

public class VetorSomatorio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10, a[], b[], i, j, somatorio;
		
		a = new int[n];
		b = new int[n];
		
		for (i = 0; i < n; i++) {
	  		System.out.printf("Informe o valor da %1d° posição do vetor A: ", (i + 1));
	  	    a[i] = in.nextInt();
		}
		
		for (i = 0; i < n; i++) {
			somatorio = 0;
			
			for (j = 0; j < n; j++) {
				somatorio += a[j];
			}
			b[i] = somatorio;
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
