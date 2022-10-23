//A Loja Tudo Mais Barato está comuma promoção que concede 10% de desconto sobre suas compras eparcelamento de até 5 vezes sem juros em suas compras, com prestações fixas. 
//Faça um algoritmo que leia o valor da comprae o número de prestações pretendidas e imprima o valor da prestação.

package entradaProcessamentoSaida;

import java.util.Scanner;

public class Prestacoes {
	public static void main(String[] args) {
		
		double compra, totalCompra, valor, desconto;
		int prest;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor da compra:");
		compra = in.nextDouble();
		System.out.println("Digite a quantidade de prestações:");
		prest = in.nextInt();
		desconto = (compra * 10) / 100;
		totalCompra = compra - desconto;
		valor = totalCompra / prest;
		System.out.println("O valor total da compra com desconto foi de: R$ " + totalCompra + "\nA compra foi parcelada em " + prest + " prestações." + "\nCada prestação sairá por: R$ " + valor);
		in.close();
	}
}