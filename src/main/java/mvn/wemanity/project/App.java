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
		String nb = sc.nextLine();

		System.out.println(TranslationFooBar.printFooBar(nb));
		System.out.println("Merci d'avoir joué. ");
	}

	

}
