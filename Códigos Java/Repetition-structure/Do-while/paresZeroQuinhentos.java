package facaEnquanto;

import java.util.Scanner;

public class paresZeroQuinhentos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 0;
		do {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		} while (i <= 500);
		in.close();
	}

}
