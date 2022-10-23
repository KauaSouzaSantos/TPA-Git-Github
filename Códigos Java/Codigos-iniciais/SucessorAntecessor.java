//Criar  um  programa  que  leia  um  número  inteiro,  apresente  o  seu antecessor  e  o  seu sucessor;

package entradaProcessamentoSaida;

import java.util.Scanner;

public class SucessorAntecessor {
	public static void main(String[] args) {
		
		int n, suc, ant;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um valor:");
		n = in.nextInt();
		suc = n + 1;
		ant = n - 1;
		System.out.println("O antecessor de " + n + " é: " + ant + "\nE o sucessor é: " + suc);
		in.close();
	}
}