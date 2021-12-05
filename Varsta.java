package curs3;

import java.util.Scanner;

public class Varsta {

	int number;

	public void intreabaVarsta() {
		System.out.println("Tasteaza varsta aici :");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();

	}

	public void verificaVarsta() {

		if (number < 18) {

			System.out.println("Esti minor!" + " (" + number + ") ");

		} else if (number >= 18 && number <= 65) {

			System.out.println("Esti adult! " + " (" + number + ") ");
		} else {
			System.out.println("Esti batran! " + " (" + number + ") ");

		}
	}
	public static void main(String[] args) {
		Varsta obiect = new Varsta();
		obiect.intreabaVarsta();
		obiect.verificaVarsta();
	}

}
