package session5;

public class Access_Person {

	public static void main(String[] args) {
		//Original Person Object
		Person originalPerson = new Person("ZOVIC",20);
		
		Person copiedPerson = new Person(originalPerson);//Object dependency
		
		System.out.println("Original Person");
		originalPerson.displayInfo();
		
		System.out.println("Copied Person");
		copiedPerson.displayInfo();
	}
}

