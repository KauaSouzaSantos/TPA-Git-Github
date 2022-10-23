//Criar um programa que leia o preço de um veículo e calcule o valor do seu IPVA, sabendo que o mesmo será 4% o valor do veículo;

package entradaProcessamentoSaida;

import java.util.Scanner;

public class Ipva {
	public static void main(String[] args) {
		
		double v, ipva;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor FIPE do veículo:");
		v = in.nextDouble();
		ipva = v * 4 / 100;
		System.out.println("O IPVA desse veículo é de: R$ " + ipva);
		in.close();
	}
}