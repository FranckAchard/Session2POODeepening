
public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1= {1,2,3};
		//int[] array2= {7,1,4,4,8};
		
		int[] array2= {1,2,3};
		
		//int[] array1= null;
		//int[] array2= null;

		//printArrays(array1, array2);
		
		// identity test
		if (array1 == array2) {
			System.out.println("array1 et array2 sont identiques : array1 = " + array1 + " et array2 = " + array2);
		} else {
			System.out.println("array1 et array2 ne sont pas identiques : array1 = " + array1 + " et array2 = " + array2);
		}
		
		// equality test
		/*
		if (intArrayEquality(array1, array2)) {
			System.out.println("array1 et array2 sont égaux");
		} else {
			System.out.println("array1 et array2 ne sont pas égaux");
		}
		*/

		
		
		if (array1.equals(array2)) {
			System.out.println("array1 equals array2");
		} else {
			System.out.println("array1 does not equals array2");
		}
		
		// print arrays to check
		System.out.println("array1 :");
		printArray(array1);
		System.out.println("array2 :");
		printArray(array2);
		
	}
	
	// print one array
	public static void printArray(int[] pArray1) {
		String output="";
		for (int i=0; i < pArray1.length; i++) {
			//System.out.println(pArray1[i]);
			output+= pArray1[i] + " ; ";
		}
		System.out.println(output);
	}
	
	// put longest array in first one and print fist array then second array
	public static void printArrays(int[] pArray1, int[] pArray2) {
		
		if (pArray1.length < pArray2.length) {
			int[] arrayTmp= pArray1;
			pArray1= pArray2;
			pArray2= arrayTmp;
		}
		
		printArray(pArray1);
		printArray(pArray2);

	}
	
	public static boolean intArrayEquality (int[] pArray1, int[] pArray2) {
		boolean equal= true;
		
		if (pArray1.length != pArray2.length) {
			equal= false;
		} else {
			for (int i=0; i < pArray1.length && equal; i++) {
				if (pArray1[i] != pArray2[i]) {
					equal= false;
				}
			}
		}
		return equal;
	}

}
