/*
	Criar um programa que leia um vetor A com 10 posições de inteiro e 
	imprima na tela um vetor B sendo que cada elemento de B seja o quadrado de A.
 */


package Vetores;

import java.util.Scanner;

public class VetorAoQuadrado {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10, a[], b[], i;
		
		a = new int[n];
		b = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor A:");
			a[i] = in.nextInt();
			b[i] = a[i] * a[i];
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
