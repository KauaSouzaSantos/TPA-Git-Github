package seSenao;

import java.util.Scanner;

public class SalarioMinimo {
	public static void main(String[] args) {
		
		double salario, salaMinimo;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o sal�rio:");
		salario = in.nextDouble();
		salaMinimo = 954.00;
		
		if (salario < salaMinimo) {
			System.out.println("Esse sal�rio est� abaixo do m�nimo.");
		} else {
			System.out.println("Esse sal�rio est� acima do m�nimo.");
		}
		in.close();
	}
}