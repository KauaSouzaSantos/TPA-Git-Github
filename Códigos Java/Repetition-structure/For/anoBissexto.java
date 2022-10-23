package para;

import java.util.Scanner;

public class anoBissexto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoI, anoF, i, contador = 1;
		
		System.out.println("Digite o ano inicial: ");
		anoI = in.nextInt();
		
		System.out.println("Digite o ano final: ");
		anoF = in.nextInt();
		
		for (i = anoI; i <= anoF; i++) {
			
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.println(i + " é um ano bissexto.");
			}
			contador++;
		}
	}
}