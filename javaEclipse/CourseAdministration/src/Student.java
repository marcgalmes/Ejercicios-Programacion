
public class Student {
	int id;
	String firstName;
	String lastName;
	int birthYear, birthMonth, birthDay;
	
	boolean isBirthday() {
		// Return true if it's the student's birthday today.
		return false;
	}
	
	void giveWarning(boolean isFinalWarning) {
		// You should study harder!
	}
	
	int numberOfFriends() {
		// Return the number of friends the student has.
		return 0;
	}
	
	public static void main(String[] args) {
		Student firstStudent = new Student();
		Student secondStudent =  new Student();
		firstStudent.id = 1;
		firstStudent.firstName = "Marc";
		secondStudent.id = 2;
		secondStudent.firstName = "Sophie";
		
		System.out.println("The student object referred to "+
				"by the variable second student has the first "+
				"name: "+ secondStudent);
		
		Book book1 = new Book();
		book1.title = "Beginning Java";
		book1.authors = new String[]{
				"Bart Baesens",
				"Aimee Backiel",
				"Seppe vanden Broucke"
		};
		
		Book book2 = new Book();
		book2.title = "Catcher in the Rye";
		book2.authors = new String[]{"J. D. Salinger"};
		
		Book book3 = new Book();
		// Oops, forgot to set title...
		System.out.println("Title equals: "+book3.title);
	}
}
