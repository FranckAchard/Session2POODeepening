package co.simplon.pf1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Intersection {

	public static void main(String[] args) {
		
		/* intersection de 2 ensembles de caractères
		 * prend en entrée 2 listes de caractères et affiche l'intersection
		 */
		String liste1, liste2;
		ArrayList<String> listeChar1= new ArrayList<String>();
		ArrayList<String> listeChar2= new ArrayList<String>();
		
		
		if (args.length != 2) {
			liste1= "a,b,c,d,e,f";
			liste2= "b,f,g,h,m";
			System.out.println("Vous n'avez pas saisi le bon nombre d'arguments, les listes ont été initialisées à :\n" + liste1 + "\n" + liste2);
			
		} else {
			liste1= args[0];
			liste2= args[1];			
		}
		
		System.out.println("Liste1 = " + liste1 + "\nListe2 = " + liste2);
		System.out.println("Intersection liste1 et liste2 = " + intersec(liste1, liste2).toString());
		System.out.println("Intersection liste1 et liste2 sans doublon = " + intersecUniq(liste1, liste2).toString());

		
	}
	
	public static ArrayList<String> intersec(String pListe1, String pListe2) {
		ArrayList<String> arList1= new ArrayList<String>(stringToAr(pListe1));
		ArrayList<String> arList2= new ArrayList<String>(stringToAr(pListe2));
		ArrayList<String> res= new ArrayList<String>();
		
		/*
		for (String str : pListe1.split(",")) {
			arList1.add(str);
		}
		
		for (String str : pListe2.split(",")) {
			arList2.add(str);
		}
		*/
		
		for (String str : arList1) {
			if (arList2.contains(str)) {
				res.add(str);
			}
		}
		
		return res;
				
	}
	
	
	public static HashSet<String> intersecUniq(String pListe1, String pListe2) {
		ArrayList<String> arList1= new ArrayList<String>(stringToAr(pListe1));
		ArrayList<String> arList2= new ArrayList<String>(stringToAr(pListe2));
		HashSet<String> res= new HashSet<String>();
	
		for (String str : arList1) {
			if (arList2.contains(str)) {
				res.add(str);
			}
		}

		return res;
	}
	

	public static ArrayList<String> stringToAr(String str){
		ArrayList<String> res= new ArrayList<String>();
		for (String st : str.split(",")) {
			res.add(st);
		}
		return res;
	}
	
	/*
	public static HashSet<String> stringToHS(String str) {
		HashSet<String> res= new HashSet<String>();
		for (String st : str.split(",")) {
			res.add(st);
		}
		return res;
	}
	*/

}
