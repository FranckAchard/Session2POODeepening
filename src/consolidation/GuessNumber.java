package consolidation;

import java.util.*;


public class GuessNumber {

	public static void main(String[] args) {

		int nbMax=9, nbInput=0, nbTry=0;
		int toGuess= new Random().nextInt(nbMax+1);
		Scanner input= new Scanner(System.in);
				
		do {
			System.out.println("Merci de saisir un nombre entier entre 0 et " + nbMax);
			try {
				nbInput= input.nextInt();
			} catch(InputMismatchException e) {
				System.err.println("Merci de saisir un nombre!");
			}
			nbTry++;
			input.nextLine();
		} while(nbInput != toGuess);

		System.out.println("Bravo, vous avez trouvé le nombre à deviner : " + toGuess + ", en " + nbTry + " tentatives");
		
		input.close();
	}

}
