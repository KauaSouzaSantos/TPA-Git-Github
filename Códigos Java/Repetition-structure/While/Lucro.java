package enquanto;

import java.util.Scanner;

public class Lucro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double produto, margemLucro, precoVenda;
		String repetir = "S";
		
		while (repetir.equalsIgnoreCase("S")); {
			System.out.println("Digite o preço do produto:");
			produto = in.nextDouble();
			
			System.out.println("Digite a margem de lucro desejada:");
			margemLucro = in.nextDouble();
			
			precoVenda = produto + ((margemLucro / 100) * produto);
			
			System.out.println("O preço de venda desse produto devera ser de R$ " + precoVenda);
			
			System.out.println("Deseja calcular novamente? (S/N)");
			repetir = in.next();
		}
		
		System.out.println("Fim do programa.");
		in.close();
	}
}