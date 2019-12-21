package prob7;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		//set up
		Book book = new Book("test",3);
		List<BookCopy> copies = book.getCopies();
		copies.forEach(copy -> copy.changeAvailability());
		
		//test
		//System.out.println(book.isAvailable());
		
		
		//boolean test = Boolean.logicalOr(false, true);
		@SuppressWarnings("unused")
		boolean test = false || false;
		
		System.out.println(test);
	}
}
