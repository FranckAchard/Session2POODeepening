package consolidation;

public class ReplaceInt {
	
	public static void replaceNegative(int[] pArray) {
		for (int i=0; i < pArray.length; ++i) {
			if (pArray[i] < 0) {
				pArray[i]= 0;
			}
		}
	}

	public static int[] replaceNegativeNew(int[] pArray) {
		int[] res= {};
		for (int i=0; i < pArray.length; ++i) {
			if (pArray[i] < 0) {
				res[i]= 0;
			} else {
				res[i]= pArray[i];
			}
		}
		return res;
	}

	public static void printIntArray(int[] pArray) {
		for (int i=0; i < pArray.length; ++i) {
			System.out.print(pArray[i] + " ; ");
		}
	}
	
	public static void main(String[] args) {

		int[] array= {1, -5, 3, -2, 7};
		int[] array2= {1, -5, 3, -2, 7};
		int[] arrayNew= {};
		printIntArray(array);
		System.out.println();
		replaceNegative(array);
		printIntArray(array);

		arrayNew= replaceNegativeNew(array2);
		printIntArray(array2);
		printIntArray(arrayNew);


	}

}
