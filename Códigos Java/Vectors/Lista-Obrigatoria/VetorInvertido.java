/*
	#2 - Criar  um  vetor  A  com  10  inteiros.  Calcular  e  apresentar  um  vetor  B,  onde  B
	terá  os mesmos elementos de A em ordem inversa. Ou seja, o 1º elemento de B será o ultimo de A, 
	o segundo elemento de B será o penúltimo de A e assim sucessivamente;
*/

package Vetores;

import java.util.Scanner;

public class VetorInvertido {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10, a[], b[], i, inverso = 9;
		
		a = new int [n];
		b = new int [n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe o  %d° valor da posição do vetor A: ", (i + 1));
			a[i] = in.nextInt();
			b[inverso] = a[i];
			inverso--;
		}
		
		System.out.print("\nVetor A (Normal): ");
		for (i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print("[" + a[i]);
			} else if (i == n - 1) {
				System.out.print(" " + a[i] + "]");
			} else {
				System.out.print(" " + a[i]);
			}
		}
		
		System.out.print("\nVetor B (Inverso): ");
		for (i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print("[" + b[i]);
			} else if (i == n - 1) {
				System.out.print(" " + b[i] + "]\n");
			} else {
				System.out.print(" " + b[i]);
			}
		}
		in.close();
	}

}

