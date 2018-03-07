package consolidation;

import java.util.Scanner;

public class HelloWorldNb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb;
		Scanner input= new Scanner(System.in);
		System.out.println("Merci de saisir le nombre d'occurrences : ");
		nb= input.nextInt();
		for (int i=0; i < nb; ++i) {
			System.out.println("Hello world!");
		}
		input.close();
	}

}
