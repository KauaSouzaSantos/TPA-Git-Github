/*
	#11 - Ler 10 elementos inteiros em um vetor A. Montar uma rotina de busca, 
	para pesquisar se um dado elemento X está armazenado em A.
 */

package Vetores;

import java.util.Scanner;

public class VetorBusca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10, a[], i, x;
		
		a = new int[n];
		
		for (i = 0; i < n; i++) {
	  		System.out.printf("Informe o valor da %1d° posição do vetor A: ", (i + 1));
	  	    a[i] = in.nextInt();
		}
		
  		System.out.printf("Informe o valor que deve ser procurado no vetor A: ");
		x = in.nextInt();
		
	  	System.out.print("\nVetor A: ");
		for (i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print("[" + a[i] + " ");
			} else if (i == n - 1) {
				System.out.print(a[i] + "]\n");
			} else {
				System.out.print(a[i] + " ");
			}
		}
		
		for (i = 0; i < n; i++) {
			
			if (x == a[i]) {
				System.out.printf("O valor %d foi encontrado na %d° posição do vetor A.", x, (i + 1));
				break;
			} else if (x != a[i] && i == (n - 1)) {
				System.out.printf("O valor %d não foi encontrado no vetor A.", x);
			}
		}
		in.close();
	}
}
