//Digitar um valor e apresentar o dobro e o triplo como resultado.

package entradaProcessamentoSaida;

import java.util.Scanner;

public class DobroTriplo {
	public static void main(String[] args) {
		
		double v, dobro, triplo;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número:");
		v = in.nextDouble();
		dobro = 2 * v;
		triplo = 3 * v;
		System.out.println("O dobro de " + v + " é: " + dobro + "\nE o triplo é: " + triplo);
		in.close();
	}
}