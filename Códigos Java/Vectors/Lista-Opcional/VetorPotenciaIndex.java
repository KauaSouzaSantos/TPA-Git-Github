/*
	#6 - Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada 
	elemento do vetor A é formado pela potência de base 2 elevado ao expoente 
	igual a posição do respectivo elemento, ou seja: A[i] = 2^i;
*/

package Vetores;

import java.util.Scanner;

public class VetorPotenciaIndex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 11, a[], b[], i, potencia = 0;
		
		a = new int[n];
		b = new int[n];
		
		for (i = 0; i < n; i++) {
			
			if (i == 0) {
				potencia = 1;
			} else {
				potencia = 2;
				
				for (int p = 1; p < i; p++) {
					potencia *= 2;
				}
			}
			
			a[i] = i;
			b[i] = potencia;
		}
		
		System.out.print("Vetor A: ");
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
