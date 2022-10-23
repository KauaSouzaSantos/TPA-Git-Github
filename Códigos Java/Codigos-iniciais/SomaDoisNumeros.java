package entradaProcessamentoSaida;

import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args) {
		
		double n1, n2, soma;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número:");
		n1 = in.nextDouble();
		System.out.println("Digite outro número:");
		n2 = in.nextDouble();
		soma = n1 + n2;
		System.out.println("A soma de " + n1 + " e " + n2 + " é igual a " + soma);
		in.close();
	}
}