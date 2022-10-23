//Criar   um   programa   que   calcule   e   apresente   o   fatorial   de   um   número   inteiro apresentado pelo usuário. 
//Obs: O fatorial de um número é obtido por meio do cálculo: 5! = 5*4*3*2*1 = 120

package facaEnquanto;

import java.util.Scanner;

public class Fatorial {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
		
			double fatorial = 1;
			int i;
			
			System.out.println("Informe o número que deseja calcular o fatorial:");
			i = in.nextInt();
			
			System.out.print(i + "! = ");
			
			do {
				fatorial = fatorial * i;
				System.out.print(i + " x ");
				i--;
			} while (i > 1);
			
			System.out.print(i + " = " + fatorial);
			in.close();
		}
}