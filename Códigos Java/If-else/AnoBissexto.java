//Criar um programa que leia o ano de nascimento de uma pessoa e informe se a pessoa nasceu num ano bissexto ou não.

package seSenao;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoNasc;
		
		System.out.println("Digite o ano de nascimento:");
		anoNasc = in.nextInt();
		
		if (anoNasc % 4 == 0) {
			System.out.println("Esse ano é bissexto.");
		} else {
			System.out.println("Esse ano não é bissexto.");
		}
		in.close();
	}
}
