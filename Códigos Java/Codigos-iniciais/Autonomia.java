//Faça um algoritmo que leia a distância percorrida por um automóvel em quilômetrose o total de combustível gasto no percursoem litros. Imprima o consumo médio do automóvel nessa viagem(km/litro)

package entradaProcessamentoSaida;

import java.util.Scanner;

public class Autonomia {
	public static void main(String[] args) {
		
		double km, l, autonomia;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a distância percorrida em quilômetros:");
		km = in.nextDouble();
		System.out.println("Digite o total de combustível gasto em litros:");
		l = in.nextDouble();
		autonomia = km / l;
		System.out.println("A autonomia foi de: " + autonomia + " km/l");
		in.close();
	}
}
