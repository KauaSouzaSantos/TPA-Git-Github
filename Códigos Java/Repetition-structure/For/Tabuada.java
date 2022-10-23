//Criar  um  programa  que  apresente  a  tabuada de  um  número  inteiro informado  pelo usuário.

package para;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, i = 1, resultado;

		System.out.println("Qual tabuada deseja calcular?");
		n = in.nextInt();
			
		for (i = 1; i <= 10; i++) {
			resultado = n * i;
			System.out.println(n + " x " + i + " = " + resultado);
		}
		
		System.out.println("\nFim do programa.");
		in.close();
	}
}