// Criar um programa que leia o salário bruto de uma pessoa e apresente o desconto relacionado ao vale transporte, sendo que é de 6%

package entradaProcessamentoSaida;

import java.util.Scanner;

public class ValeTransporte {
	public static void main(String[] args) {
		
		double salaBruto, descontoVt;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o salário bruto do funcionário:");
		salaBruto = in.nextDouble();
		descontoVt = salaBruto * 6 / 100;
		System.out.println("O desconto do Vale-Transporte do funcionário é de: R$ " + descontoVt);
		in.close();
	}
}



