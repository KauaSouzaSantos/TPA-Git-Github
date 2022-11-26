/*
	#10 - Criar dois vetores A e B cada um com 10 elementos inteiros. 
	Desenvolver um programa que crie um vetor C que é a diferença dos
	conjuntos formados pelos elementos dos vetores A e B. 
	Diferença de conjuntos = todos os elementos do conjunto A que não existem no conjunto B.
 */

package Vetores;

import java.util.Scanner;

public class VetorDiferenca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 10, a[], b[], c[], i, j, x = 0, diferenca;
	  	
	  	a = new int [n];
	  	b = new int [n];
	  	c = new int [n];
	  	
	  	for (i=0; i<n; i++) {
	  		System.out.printf("Informe o valor da %1d° posição do vetor A: ", (i + 1));
	  	    a[i] = in.nextInt();
	  	}
	  	
	  	for (i=0; i<n; i++) {
	  		System.out.printf("Informe o valor da %1d° posição do vetor B: ", (i + 1));
	  	    b[i] = in.nextInt();
	  	}
	  	
	  	for (i=0; i<n; i++) {
	  	    diferenca = 0;
	  	    for (j=0; j<n; j++) {
	  	    	
	  	      if (a[i] == b[j]) {  
	  	    	  diferenca = 1;
	  	      }

	  	    }
	  	    
	  	    if (diferenca == 0) {
	  	    	c[x] = a[i];
	  	    	x++;
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
		
		System.out.print("\nVetor C (Diferença): ");
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
