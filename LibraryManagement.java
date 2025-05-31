package assignment.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib= new Library();
		lib.issueBook();
		String newbook= lib.addBook("Java Program");
		System.out.println(newbook);
	}

}
