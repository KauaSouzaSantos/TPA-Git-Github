//A área de uma circunferência é calculada pela fórmula Area = r².Criar um programa que apresente a área de uma circunferência qualquer.

package entradaProcessamentoSaida;

import java.util.Scanner;

public class Circunferencia {
	public static void main(String[] args) {
		
		double r, area;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o raio da circunferência:");
		r = in.nextDouble();
		area = 3.14 * (r * r);
		System.out.println("A área dessa circunferência é: " + area);
		in.close();
	}
}
