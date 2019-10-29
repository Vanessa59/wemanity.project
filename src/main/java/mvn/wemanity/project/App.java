package mvn.wemanity.project;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Bonjour !");
		boolean wantToQuit = false;
		Scanner sc = new Scanner(System.in);
		
		while (!wantToQuit) {
			
			System.out.println("Veuillez entrer un nombre à traduire. Entrez 'Q' pour quitter.");
			String nb = sc.nextLine();

			if (nb.toUpperCase().equals("Q")) {
				wantToQuit = true;
			} else {
				System.out.println(TranslationFooBar.printFooBar(nb));
			}
		}

		System.out.println("Merci d'avoir joué. ");
		sc.close();
	}

}
