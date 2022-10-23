package escolhaCaso;


import java.util.Scanner;

public class Mes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int mes;
		
		System.out.println("Digite um número corresponde a um mês, de 1 a 12:");
		mes = in.nextInt();
		
		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Esse mês possui 31 dias");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Esse mês possui 30 dias");
				break;
			case 2:
				System.out.println("Esse mês possui 28 dias");
			default:
				System.out.println("Mês inválido");
		}
		in.close();
	}

}
