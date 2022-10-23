package escolhaCaso;

import java.util.Scanner;

public class RodizioSp {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int fP;
		
		System.out.println("Informe o último digito da placa do seu veículo:");
		fP = in.nextInt();
		
		switch(fP) {
			case 1:
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
			case 4:
				System.out.println("Terça-feira");
				break;
			case 5:
			case 6:
				System.out.println("Quarta-feira");
				break;
			case 7:
			case 8:
				System.out.println("Quinta-feira");
				break;
			case 9:
			case 0:
				System.out.println("Sexta-feira");
				break;
			default:
				System.out.println("Número de placa inválido");
		} 
		in.close();
	}
}
