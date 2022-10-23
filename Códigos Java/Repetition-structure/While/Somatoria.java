//Criar um programa que apresente a somatória dos números de 1 a 100.

package enquanto;

import java.util.Scanner;

public class Somatoria {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
		
			int n1 = 1, n2 = 2, resultado;
			
			while (n2 <= 100) {
				resultado = n1 + n2;
				System.out.println(n1 + " + " + n2 + " = " + resultado);
				n1 = n1 + n2;
				n2++;
			}
			System.out.println("\nFim do programa.");
			in.close();
		}
}