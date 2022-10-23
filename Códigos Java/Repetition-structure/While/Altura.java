//João  tem  1,34m  de  altura  e  Pedro  tem  1,45m.  João  cresce  2,5cm  por  ano  e  Pedro cresce 2cm por ano. Quantos anos irá demorar para João ficar mais alto que Pedro?

package enquanto;

import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double joao = 134, pedro = 145;
		int ano = 1;
		
		while (joao <= pedro) {
			System.out.println("\n" + ano + " ano(s):");
			System.out.println("Idade de Pedro: " + (pedro = pedro + 2) / 100 + "m");
			System.out.println("Idade de João: " + (joao = joao + 2.5) / 100 + "m");
			ano++;
		}
		System.out.println("\nSerá(ão) necessário(s) " + (ano - 1) + " ano(s) para João ficar mais alto que Pedro.");
		System.out.println("\nFim do programa.");
		in.close();
	}
}