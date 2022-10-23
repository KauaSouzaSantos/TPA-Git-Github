//Faça um algoritmo que leia o nome de um vendedor, o salário fixo e o total de vendas efetuado por ele no mês. Sabendo-se que a comissãodo vendedoré de 15% sobre o valor total de vendas, calcule o salário total do vendedor e imprima o nome, salário fixo e o salário final

package entradaProcessamentoSaida;

import java.util.Scanner;

public class Vendedor {
	public static void main(String[] args) {
		
		double salaFixo, salaTotal;
		int comi, totalVendas;
		String nome;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o seu 1° nome:");
		nome = in.next();
		System.out.println("Digite o seu salário fixo:");
		salaFixo = in.nextDouble();
		System.out.println("Digite o total de vendas realizadas no mês:");
		totalVendas = in.nextInt();
		comi = 15 * 100 / totalVendas;
		salaTotal = comi + salaFixo;
		System.out.println("O vendedor " + nome + " com salário fixo de: R$ " + salaFixo + " obteve uma comissão de 15% sobre suas " + totalVendas + " venda(s), obtendo um salário final de: R$ " + salaTotal);
		in.close();
	}
}