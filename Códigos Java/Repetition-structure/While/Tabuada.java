//Criar  um  programa  que  apresente  a  tabuada de  um  número  inteiro informado  pelo usuário.

package enquanto;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, i = 1, resultado;

		System.out.println("Qual tabuada deseja calcular?");
		n = in.nextInt();
			
		while (i <= 10) {
			resultado = n * i;
			System.out.println(n + " x " + i + " = " + resultado);
			i++;
		}
		System.out.println("\nFim do programa.");
		in.close();
	}
}