package entradaProcessamentoSaida;

import java.util.Scanner;

public class ValoresInvertidos {
	public static void main(String[] args) {
		
		double a, b, c;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		a = in.nextDouble();
		System.out.println("Digite o valor de B:");
		b = in.nextDouble();
		c = a;
		a = b;
		b = c;
		System.out.println("A: " + a + "\nB: " + b);
		in.close();
	}
}