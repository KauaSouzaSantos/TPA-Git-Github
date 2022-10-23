//Criar um programa que leia o salário de uma pessoa. Apresentar o valor devido de INSS e o salário liquido,sabendo que:
//1. Se a pessoa ganhar até 2500 pagará 9% do salário bruto de INSS
//2. Sea pessoa ganhar acima de 2500 pagará 11% do salário bruto de INSS

package seSenao;

import java.util.Scanner;

public class Inss {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double salario, inss, salaLiquido;
		
		System.out.println("Digite o salário:");
		salario = in.nextDouble();
		
		if (salario <= 2500) {
			inss = (salario * 9) / 100;
		} else {
			inss = (salario * 11) / 100;
		}
		
		salaLiquido = salario - inss;
		
		System.out.println("Valor devido ao INSS: " + inss + " R$");
		System.out.println("Salário Liquido: " + salaLiquido + " R$");
		
		in.close();
	}
}
