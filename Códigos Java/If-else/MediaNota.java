//Criar um programa que leia duas notas para um aluno. Calcular e apresentar a sua média, sendo que: 
//• SE a média for menor do que 3 o aluno está REPROVADO; • SE a média for >=6 o aluno está APROVADO; 
//• SE a média for >=3 e < 6 avisar via mensagem que o aluno está  em  EXAME.  Solicitar  então uma nota de EXAME, extrair uma nova média entre a média anterior e a nota de EXAME. 
//Caso a nova média seja >=6 o aluno será APROVADO. Caso contrário está reprovado.

package seSenao;

import java.util.Scanner;

public class MediaNota {
	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double nota1, nota2, notaExame, media;
        
        System.out.println("Digite a 1° Nota:");
        nota1 = in.nextDouble();
        System.out.println("Digite a 2° Nota:");
        nota2 = in.nextDouble();
		
        media = (nota1 + nota2) / 2;
        
        if (media < 3) {
        	System.out.println("REPROVADO");
        } else if (media >= 6) {
        	System.out.println("APROVADO");
        } else if (media >= 3 && media < 6) {
        	System.out.println("EM EXAME");
        	
        	System.out.println("Por favor, insira uma nota de Exame:");
        	notaExame = in.nextDouble();
        	
        	media = (notaExame + media) / 2;
        	
        	if (media >= 6) {
            	System.out.println("APROVADO");
        	} else {
            	System.out.println("REPROVADO");
        	}
        }
        in.close();
	}
}

