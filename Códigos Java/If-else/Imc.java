//Criar um programa que leia o peso e a altura de um usuário. Informar o seu IMC de acordo com a sua condição:

package seSenao;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double peso, altura, imc = 0;
        
        System.out.println("Digite um peso em kg:");
		peso = in.nextDouble();
		System.out.println("Digite uma altura em metros:");
		altura = in.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("IMC: " + imc);
		
		if (imc < 18.5) {
			System.out.println("Excesso de Magreza");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso Normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Excesso de Peso");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Obesidade (Grau I)");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidade (Grau II)");
		} else if (imc >= 40) {
			System.out.println("Obesidade (Grau III)");
		}
		in.close();
	}

}
