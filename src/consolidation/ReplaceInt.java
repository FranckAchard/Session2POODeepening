package consolidation;

public class ReplaceInt {
	
	public static void replaceNegative(int[] pArray) {
		for (int i=0; i < pArray.length; ++i) {
			if (pArray[i] < 0) {
				pArray[i]= 0;
			}
		}
	}

	public static void main(String[] args) {

		int[] array= {1, -5, 3, -2, 7};
		for (int i=0; i < array.length; ++i) {
			System.out.print(array[i] + " ; ");
		}
		System.out.println();
		replaceNegative(array);
		for (int i=0; i < array.length; ++i) {
			System.out.print(array[i] + " ; ");
		}
	}

}
