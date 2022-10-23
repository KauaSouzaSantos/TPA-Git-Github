//Criar um programa que leia o dia e mês que uma pessoa nasceu e informe o seu signo do zodíaco.

package escolhaCaso;

import java.util.Scanner;

public class SignoZodiaco {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int dia, mes;
		
		System.out.println("Digite o dia em que você nasceu:");
		dia = in.nextInt();
		
		System.out.println("Digite o mês em que você nasceu:");
		mes = in.nextInt();
		
		switch(mes) {
			case 1:
				if (dia >= 1 && dia <= 20) {
					System.out.println("Signo: Capricórnio");
				} else if (dia >= 21 && dia <= 31) {
					System.out.println("Signo: Aquário");
				}
				break;
			case 2:
				if (dia >= 1 && dia <= 18) {
					System.out.println("Signo: Aquário");
				} else if (dia >= 19 && dia <= 28) {
					System.out.println("Signo: Peixes");
				}
				break;
			case 3:
				if (dia >= 1 && dia <= 20) {
					System.out.println("Signo: Peixes");
				} else if (dia >= 21 && dia <= 31) {
					System.out.println("Signo: Áries");
				}
				break;
			case 4:
				if (dia >= 1 && dia <= 20) {
					System.out.println("Signo: Áries");
				} else if (dia >= 21 && dia <= 30) {
					System.out.println("Signo: Touro");
				}
				break;
			case 5:
				if (dia >= 1 && dia <= 20) {
					System.out.println("Signo: Touro");
				} else if (dia >= 21 && dia <= 31) {
					System.out.println("Signo: Gêmeos");
				}
				break;
			case 6:
				if (dia >= 1 && dia <= 20) {
					System.out.println("Signo: Gêmeos");
				} else if (dia >= 21 && dia <= 30) {
					System.out.println("Signo: Câncer");
				}
				break;
			case 7:
				if (dia >= 1 && dia <= 22) {
					System.out.println("Signo: Câncer");
				} else if (dia >= 23 && dia <= 31) {
					System.out.println("Signo: Leão");
				}
				break;
			case 8:
				if (dia >= 1 && dia <= 22) {
					System.out.println("Signo: Leão");
				} else if (dia >= 23 && dia <= 31) {
					System.out.println("Signo: Virgem");
				}
				break;
			case 9:
				if (dia >= 1 && dia <= 22) {
					System.out.println("Signo: Virgem");
				} else if (dia >= 23 && dia <= 30) {
					System.out.println("Signo: Libra");
				}
				break;
			case 10:
				if (dia >= 1 && dia <= 22) {
					System.out.println("Signo: Libra");
				} else if (dia >= 23 && dia <= 31) {
					System.out.println("Signo: Escorpião");
				}
				break;
			case 11:
				if (dia >= 1 && dia <= 21) {
					System.out.println("Signo: Escorpião");
				} else if (dia >= 22 && dia <= 30) {
					System.out.println("Signo: Sagitário");
				}
				break;
			case 12:
				if (dia >= 1 && dia <= 21) {
					System.out.println("Signo: Sagitário");
				} else if (dia >= 22 && dia <= 31) {
					System.out.println("Signo: Capricórnio");
				}
				break;
			default:
				System.out.println("Mês inválido");
		}
		in.close();
	}
}
