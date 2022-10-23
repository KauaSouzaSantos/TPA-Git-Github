/*Uma escola de futebol classifica seus alunos da seguinte forma:
• Alunos de 6 anos são categoria “dente de leite”
• Alunos de 7 anos são categoria “júnior”
• Alunos de 8 anos são categoria “júnior max”
• Alunos de 9 anos são categoria “júnior master”
• Alunos de 10 anos são categoria “master”

A escola não admite alunos de outras idades. Criar um programa que informe a categoria do aluno.*/

package escolhaCaso;

import java.util.Scanner;

public class CategoriaFutebol {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Informe a idade do aluno:");
		idade = in.nextInt();
		
		switch(idade) {
			case 6:
				System.out.println("Aluno categoria: Dente de Leite");
				break;
			case 7:
				System.out.println("Aluno categoria: Júnior");
				break;
			case 8:
				System.out.println("Aluno categoria: Júnior Max");
			case 9:
				System.out.println("Aluno categoria: Júnior Master");
			case 10:
				System.out.println("Aluno categoria: Master");
			default:
				System.out.println("A escola só aceita alunos entre 6 a 10 anos de idade.");
		}
		in.close();
	}
}
