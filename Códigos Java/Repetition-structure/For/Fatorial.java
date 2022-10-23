//Criar   um   programa   que   calcule   e   apresente   o   fatorial   de   um   número   inteiro apresentado pelo usuário. 
//Obs: O fatorial de um número é obtido por meio do cálculo: 5! = 5*4*3*2*1 = 120

package para;

import java.util.Scanner;

public class Fatorial {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
		
			float fatorial = 1;
			int i, N;

			System.out.println("Informe o número que deseja calcular o fatorial:");
			N = in.nextInt();
			
			for (i = N; i > 1; i--) {
				fatorial = fatorial * i;
				System.out.print(i + " x ");
			}
			System.out.println(i + " = " + fatorial);
			in.close();
		}
}