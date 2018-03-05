
public class Person {
	String firstName;
	String lastName;
	int age;

	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1= new Person("Franck", "Achard", 44);
		Person p2= new Person("Franck", "Achard", 44);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1 == p2);
			
	}

}
