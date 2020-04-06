package LibraryManagementSystem;

import java.util.*;

public class LibraryManagement {

	static HashMap<String, Person> issueDetails = new HashMap<String, Person>();
	static List<String> availableBooks = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		System.out.println("Enter 1 to add a book");
		System.out.println("Enter 2 to issue a book");
		System.out.println("Enter 3 to return a book");

		
		
		
		Scanner s = new Scanner(System.in);
		
		int input = s.nextInt();
		
		switch(input){
			
		case 1 : addBook();
				break;
		
		case 2 : issueBook();
				break;
		
		case 3 : returnBook();
				break;
		}
		
		System.out.println("Available books : " + availableBooks);
		System.out.println("issued books : ");
		for(Map.Entry<String, Person> entry : issueDetails.entrySet()){
			System.out.println(entry.getKey()+ " " + entry.getValue().toString());
		}
		
		main(args);
	}
	

	private static void addBook() {

		System.out.println("Enter book name");
		Scanner s = new Scanner(System.in);
		
		String bookName = s.nextLine();
		
		availableBooks.add(bookName);	
		
	}
	
	private static void issueBook() {
		
		System.out.println("Enter your details");
		Scanner s = new Scanner(System.in);
	
		String id = s.nextLine();
		String name = s.nextLine();
	
		System.out.println("Show available books : " + availableBooks);
		
		System.out.println("Enter book to be issued -- ");
		String issueBook = s.nextLine();
		
		issueDetails.put(issueBook, new Person(id, name));
		
		availableBooks.remove(issueBook);
		
	}

	private static void returnBook() {
		  
		
	}
}
