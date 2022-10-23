//Criar um programa que leia o ano de nascimento e o ano atual. Apresentar a idade do usuário e uma mensagem informando se o usuário poderá ou não tirar o título de Eleitor no Brasil.

package seSenao;

import java.util.Scanner;

public class TituloEleitor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoNasc, anoAtual, idade;
		
		System.out.println("Digite o ano de nascimento:");;
		anoNasc = in.nextInt();
		System.out.println("Digite o ano atual:");
		anoAtual = in.nextInt();
		
		idade = anoAtual - anoNasc;
		
		if (idade < 16) {
			System.out.println("Você não pode tirar o título de eleitor:");
		} else {
			System.out.println("Você pode tirar o título de eleitor:");
		}
		in.close();	
	}
}
