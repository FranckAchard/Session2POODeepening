package co.simplon.pf1;

import java.util.Arrays;

import javax.sound.midi.Synthesizer;

public class DebugArray2DObjects {

	public static Stone[] initializedArray(Stone s, int nb){
		Stone[] res= new Stone[nb];
		for(int i=0; i != res.length; ++i){
			// res[i]= s makes a shallow copy, thus each res[i] points to the same Stone object => instead we use a copy constructor 
			//res[i]= s;
			res[i]= new Stone(s);
		}
		return res;
	}
	public static Stone[][] initializedArray2D(Stone[] arr, int nb){
		Stone[][] res= new Stone[nb][];
		for(int i=0; i != res.length; ++i) {
			// res[i]= arr makes a shallow copy, thus each res[i] points on the same array => instead we use a copy constructor for each Stone res[i][j]
			//res[i]= arr;
			// init res[i] (to avoid NullPointerException)
			res[i]= new Stone[arr.length];
			for (int j=0; j < arr.length; ++j) {
				/*
				System.out.println("i = " + i + " ; j = " + j);
				System.out.println("arr[" + j + "] = " + arr[j]);
				System.out.println("res[" + i + "][" + j + "] = " + res[i][j]);
				*/
				res[i][j]= new Stone(arr[j]);
			}
			
		}
		return res;
	}

	public static void display(Stone[][] board){
		for(Stone[] row : board){
			for(Stone c : row){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Stone[][] screen= initializedArray2D(initializedArray(new Stone(false), 20), 20);

		/*
		for (int i=0; i < screen.length; ++i) {
			System.out.println("screen[" + i + "] = " + screen[i]);
		}
		
		for (int i=0; i < screen.length; ++i) {
			System.out.println("screen[" + i + "] content :");
			for (int j=0; j < screen[i].length; ++j) {
				System.out.print("screen[" + i + "][" + j + "] = " + screen[i][j] + " ; ");
			}
			System.out.println();
		}
		*/
		
		/*
		for (Stone[] s : screen) {
			System.out.println(s);
		}
		*/
			
		for(int i= 0; i != Math.min(screen.length, screen[0].length); ++i){
			screen[i][i].setFirstPlayer(true);
			screen[screen.length-i-1][i].setFirstPlayer(true);
		}
		
		display(screen);
	}
}
