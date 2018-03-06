package co.simplon.pf1;

public class DebugArray2DObjects {

	public static Stone[] initializedArray(Stone s, int nb){
		Stone[] res= new Stone[nb];
		for(int i=0; i != res.length; ++i){
			res[i]= s;
		}
		return res;
	}
	public static Stone[][] initializedArray2D(Stone[] arr, int nb){
		Stone[][] res= new Stone[nb][];
		for(int i=0; i != res.length; ++i){
			res[i]= arr;
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
		for(int i= 0; i != Math.min(screen.length, screen[0].length); ++i){
			screen[i][i].setFirstPlayer(true);
			screen[screen.length-i-1][i].setFirstPlayer(true);
		}
		display(screen);
	}
}
