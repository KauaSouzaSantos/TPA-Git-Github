//Criar um programa que leia uma quantidade x de metros, converta para quilômetros e apresente o valor convertido;

package entradaProcessamentoSaida;

import java.util.Scanner;

public class MetroQuilometros {
	public static void main(String[] args) {
		
		double m, km;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a quantidade de metros a serem convertidos:");
		m = in.nextDouble();
		km = m / 1000;
		System.out.println(m + " metro(s), equivale(m) a " + km + " quilômetro(s)");
		in.close();
	}
}