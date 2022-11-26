/* 
	#2 - Criar um vetor A com 5 elementos inteiros. Escreva um programa que 
	imprima a tabuada de cada um dos elementos do vetor A;
*/


package Vetores;

import java.util.Scanner;

public class VetorTabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 5, a[], i, t;
		
		a = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe o valor da %d° tabuada que deseja calcular: ", (i + 1));
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
			System.out.printf("%n%n Tabuada do: %d %n", a[i]);
			for (t = 1; t <= 10; t++) {
				System.out.printf("%n %d x %d = %d", a[i], t, (a[i] * t));
			}
		}
		in.close();
	}
}
