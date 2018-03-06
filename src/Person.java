
public class Person {
	// attributes
	String firstName;
	String lastName;
	int age;

	// constructors
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	// equals override
	public boolean equals(Object other) {
		boolean result= false;
		
		if (other != null && (other instanceof Person)) {
			Person otherPerson= (Person) other;
			if (this.firstName.equals(otherPerson.firstName) && this.lastName.equals(otherPerson.lastName) && (this.age == otherPerson.age)) {
				result= true;
			}
		}
		
		return result;
	}
	
	// shallow copy of 2 dimensions int array
	public static int[][] shallowCopy(int[][] pData) {
		int[][] result= new int[pData.length][];
		for(int i=0; i < pData.length; ++i){
			result[i]= pData[i];
		}
		return result;
	}

	// deep copy of 2 dimensions int array
	public static int[][] deepCopy(int[][] pData) {
		int[][] result= new int[pData.length][];
		
		for (int i=0; i < pData.length; ++i) {
			result[i]= new int[pData[i].length];
			for (int j=0; j < pData[i].length; ++j) {
				result[i][j]= pData[i][j];
			}	
		}
		return result;
	}
	
	// print int array 1st dimension
	public static void printIntArray1(int[][] pData, String pDataName) {
		for (int i=0; i < pData.length; ++i) {
			System.out.println(pDataName + "[" + i + "] = " + pData[i]);
		}
	}
	
	// print int array 1st and 2nd dimensions
	public static void printIntArray2(int[][] pData, String pDataName) {
		for (int i=0; i < pData.length; ++i) {
			System.out.println(pDataName + "[" + i + "] : ");
			for (int j=0; j < pData[i].length; ++j) {
				System.out.println("*** " + pDataName + "[" + i + "][" + j + "] = " + pData[i][j]);
			}
		}
	}
	
	// print all levels of 2 dimensions int array 
	public static void printIntArrayAllDim(int[][] pData, String pDataName) {
		System.out.println();
		System.out.println("******************************************");
		System.out.println("******** " + pDataName + " refs and values");
		System.out.println("******************************************");
		System.out.println();
		// print pData ref
		System.out.println("*** " + pDataName + " ref = " + pData);
		System.out.println();

		// print pData[] refs
		for (int i=0; i < pData.length; ++i) {
			System.out.println("*** " + pDataName + "[" + i + "] ref = " + pData[i]);
		}
		
		System.out.println();
		
		// print pData[][] values
		for (int i=0; i < pData.length; ++i) {
			for (int j=0; j < pData[i].length; ++j) {
				System.out.println("*** " + pDataName + "[" + i + "][" + j + "] value = " + pData[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	
	// main
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] data= new int[2][];
		
		// data[] init
		for(int i=0; i < data.length; ++i){
			data[i]= new int[2+i];
		}
		
		// data[][] init
		int k= 0;
		for (int i=0; i < data.length; ++i) {
			for (int j=0; j < data[i].length; ++j) {
				data[i][j] = k;
				++k;
			}
		}
		
		// print data
		printIntArrayAllDim(data, "data");
		
		int[][] other= new int[data.length][];
		System.out.println("init of other 1st dimension");
		System.out.println("other = " + other);
		printIntArray1(other, "other");
		
		// shallow copy of data in other
		System.out.println("\n######## shallow copy of data in other");
		other= shallowCopy(data);
		printIntArrayAllDim(other, "other");

		System.out.println("######## change other[0][0]");
		other[0][0]= 17;
		printIntArrayAllDim(data, "data");
		printIntArrayAllDim(other, "other");

		// deep copy of data in other
		System.out.println("######## deep copy of data in other\n");
		other= deepCopy(data);
		printIntArrayAllDim(data, "data");
		printIntArrayAllDim(other, "other");
		
		System.out.println("######## change other[0][0]");
		other[0][0]= 34;
		printIntArrayAllDim(data, "data");
		printIntArrayAllDim(other, "other");

	
		
		/*
		Person p1= new Person("Franck", "Achard", 44);
		Person p2= new Person("Franck", "Achard", 44);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1 == p2);
		*/
	}

}
