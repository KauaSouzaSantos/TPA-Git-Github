/*
	#12 - Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor 
	quando escritos da esquerda para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. 
	Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja, 
	se o primeiro elemento do vetor e igual ao último, se o segundo elemento do vetor é igual ao 
	penúltimo e assim por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.
*/

package Vetores;

import java.util.Scanner;

public class VetorPalindromo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10, a[], i, j = n - 1, palindromo = 1;
		
		a = new int[n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe o valor da %d° posição do vetor A: ", (i + 1));
	  	    a[i] = in.nextInt();
		}
		
		for (i = 0; i < j; i++) {
			if (a[i] != a[j]) {
				palindromo = 0;
				break;
			} else {
				j--;
			}
		}
		
	  	System.out.print("\nVetor A (Normal): ");
		for (i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print("[" + a[i] + " ");
			} else if (i == n - 1) {
				System.out.print(a[i] + "]");
			} else {
				System.out.print(a[i] + " ");
			}
		}
		
	  	System.out.print("\nVetor B (Inverso do A): ");
		for (j = n - 1; j >= 0; j--) {
			if (j == 0) {
				System.out.print(a[j] + "]\n");
			} else if (j == n - 1) {
				System.out.print("[" + a[j] + " ");
			} else {
				System.out.print(a[j] + " ");
			}
		}
		
		if(palindromo == 1) {
			System.out.println("Os valores do vetor A, formam um palíndromo.");
		} else {
			System.out.println("Os valores do vetor A, não formam um palíndromo.");
		}
		in.close();
	}
	
}
