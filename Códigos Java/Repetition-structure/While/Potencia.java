//Criar um programa que leia uma base e um expoente e apresente o cálculo da potência.

package enquanto;

import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int base, expoente, i = 1, resultado;
		
		System.out.println("Qual número deseja-se calcular?");
		base = in.nextInt();
		
		System.out.println("A qual expoente esse número será elevado?");
		expoente = in.nextInt();
		
		resultado = base;
		
		while (i < expoente) {
			resultado = resultado * base;
			i++;
		}
		System.out.println(base + "^" + expoente + " = " + resultado);
		in.close();
	}
}