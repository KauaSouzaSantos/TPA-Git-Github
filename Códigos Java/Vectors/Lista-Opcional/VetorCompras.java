/*
	Dona Maria foi a uma feira, levando R$ 150,00. Mas ao chegar lá ficou com receio de seu dinheiro não ser suficiente para pagar as compras. 
	Dito isso, crie um programa que leia o valor de 5 produtos, calcule e apresente:
	1° A soma dos preços de todos os produtos.
	2° A média de preço dos produtos.
	3° O preço do produto mais caro.
	4° Retorne uma mensagem dizendo se Dona Maria conseguirá ou não realizar suas compras;
*/

package Vetores;

import java.util.Scanner;

public class VetorCompras {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 5, i;
		double total = 0, maior = 0, a[];
		
		a = new double[n];
		
		for (i = 0; i < n; i++) {
	  		System.out.println("Informe o valor do " + (i + 1) +"° produto");
	  	    a[i] = in.nextDouble();
	  	    total += a[i];
		}
		
		for (i = 0; i < n; i++) {
			if (i == 0) {
				maior = a[i];
			} else {
				if  (a[i] > maior) {
					maior = a[i];
				}
			}
		}
		
		System.out.println("O valor total dos produtos é: R$ " + total);
		System.out.println("A média de preço dos 5 produtos é: R$ " + (total / n));
		System.out.println("O produto mais caro custa: R$ " + maior);
		
		if (total <= 150) {
			System.out.println("Dona Maria conseguirá realizar suas compras :) E sobrará R$ " + (150 - total) + " de troco");
		} else {
			System.out.println("Dona Maria não conseguirá comprar todos seus produtos :( Pois irão lhe faltar R$ " + (total - 150));
		}
		in.close();
	}
}
