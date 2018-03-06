package co.simplon.pf1;

import java.util.Arrays;

public class DebugArr2D {

	public static char[] initializedArray(char c, int nb){
		char[] res= new char[nb];
		for(int i=0; i != res.length; ++i){
			res[i]= c;
		}
		return res;
	}

	public static char[][] initializedArray2D(char[] arr, int nb){
		char[][] res= new char[nb][];
		for(int i=0; i != res.length; ++i){
			res[i]= Arrays.copyOf(arr, arr.length);
		}
		return res;
	}
	
	/*
	public static char[][] initializedArray2D(char c, int nbLn, int nbCl){
		char[][] res= new char[nbLn][nbCl];
		for(int i=0; i < nbLn; ++i){
			for (int j=0; j < nbCl; ++j) {
				res[i][j]= c;
			}
		}
		return res;
	}
	*/
	
	public static void display(char[][] arr2D){
		for(char[] row : arr2D){
			for(char c : row){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		
		char[][] screen= initializedArray2D(initializedArray(' ', 20), 20);
		// char[][] screen= initializedArray2D(' ', 20, 20);

		/*
		for (int i=0; i < screen.length; ++i) {
			System.out.println(screen[i] + "\n");
		}
		*/
		
		for(int i= 0; i != Math.min(screen.length, screen[0].length); ++i){
			screen[i][i]='X';
			screen[screen.length-i-1][i]='X';
		}
		
		display(screen);
	}

}
