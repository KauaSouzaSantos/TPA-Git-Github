//Criar um programa que leia três números inteiros, apresente a soma do quadrado dos três valores

package entradaProcessamentoSaida;

import java.util.Scanner;

public class QuadradoSoma {
	public static void main(String[] args) {
		
		int v1, v2, v3, ele1, ele2, ele3, resultado;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o 1° valor:");
		v1 = in.nextInt();
		System.out.println("Digite o 2° valor:");
		v2 = in.nextInt();
		System.out.println("Digite o 3° valor:");
		v3 = in.nextInt();
		ele1 = v1 * v1;
		ele2 = v2 * v2;
		ele3 = v3 * v3;
		resultado = ele1 + ele2 + ele3;
		System.out.println("A soma dos valores elevados ao quadrado é: " + resultado);
		in.close();
	}
}
