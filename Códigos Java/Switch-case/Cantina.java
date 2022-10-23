/*A cantina da escola decidiu criar um programa que facilite a consulta de preços dos itens disponíveis para venda. Com isso, colocou um computador para uso dos alunos em que a qualquer momento, de posse do código de um produto, eles possam ser informados de sua descrição e valor. 
Criar o programa em que o aluno informe o código do produto e receba como saída a descrição do produto e o seu valor.*/

package escolhaCaso;

import java.util.Scanner;

public class Cantina {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int codigo;
		
		System.out.println("Digite o código do produto:");
		codigo = in.nextInt();
		
		switch(codigo) {
			case 1:
				System.out.println("Cachorro Quente");
				System.out.println("Valor: R$ 8,00");
				break;
			case 2:
				System.out.println("Cheeseburger");
				System.out.println("Valor: R$ 12,00");
				break;
			case 3:
				System.out.println("X-Salada");
				System.out.println("Valor: R$ 15,00");
				break;
			case 4:
				System.out.println("Misto Quente");
				System.out.println("Valor: R$ 11,00");
				break;
			case 5:
				System.out.println("Pão na chapa");
				System.out.println("Valor: R$ 6,00");
				break;
			default:
				System.out.println("Código do produto Inválido. Verifique-o e tente novamente.");
		}
		in.close();
	}

}
