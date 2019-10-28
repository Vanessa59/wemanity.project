package mvn.wemanity.project;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Bonjour !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre.");
		NumberFooBar nb = new NumberFooBar(sc.nextLine());

		System.out.println(nb.printFooBar());
		System.out.println("Merci d'avoir joué. ");
	}

	

}
