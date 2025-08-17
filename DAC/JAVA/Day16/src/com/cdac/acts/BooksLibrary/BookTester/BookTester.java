/*1) Use Book class from Library application and use DataOuputStream and DataInputStream to write and read books from binary file.
 
Write methods to save book in file and save many books in file. Pass book object and DOS to method for saving book. Reuse the method to save multiple books.
 
Create methods to read one book and read many books until data is available on stream.
 
Print the data read from file suing forEach and method reference.
*/


package com.cdac.acts.BooksLibrary.BookTester;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.BooksLibrary.BookGenre;
import com.cdac.acts.BooksLibrary.Book.Books;
import com.cdac.acts.BooksLibrary.BookSaver.saveBooksList;

public class BookTester {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		List<Books> books = new ArrayList<>();
		
		/*System.out.println("Enter Book ID: ");
		Integer bookid = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Book Title: ");
		String title = sc.nextLine();
		
		System.out.println("Enter Author Name: ");
		String authorname = sc.nextLine();
		
		System.out.println("Enter Genre of the Book: ");
		String genre = sc.nextLine();
		BookGenre bgenre = BookGenre.valueOf(genre);
		
		System.out.println("Enter Book Publish Year: ");
		String pubyear = sc.nextLine();
		LocalDate bookPublish = LocalDate.parse(pubyear, format);
		
		System.out.println("Enter Price of Book: ");
		Double price = sc.nextDouble();
		
		Books books = new Books(bookid,title,authorname,bgenre,bookPublish,price);*/
		
		String fileName = "C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\Day16\\Books.dat";
		
		saveBooksList.saveBook(new Books(101, "To Kill a Mockingbird", "Harper Lee",BookGenre.FICTION,LocalDate.parse("21-06-1960", format), 499.00), fileName);
		saveBooksList.saveBook(new Books(102, "The Great Gatsby", "F. Scott Fitzgerald",BookGenre.FICTION,LocalDate.parse("25-05-1925", format), 399.00), fileName);
		saveBooksList.saveBook(new Books(201, "Gone Girl", "Gillian Flynn",BookGenre.MYSTRY,LocalDate.parse("12-12-2012", format), 350.00), fileName);
		saveBooksList.saveBook(new Books(202, "The Da Vinci Code", "Dan Brown",BookGenre.MYSTRY,LocalDate.parse("13-03-2003", format), 550.00), fileName);
		saveBooksList.saveBook(new Books(301, "A Brief History of Time", "Stephen Hawking",BookGenre.SCIENCE,LocalDate.parse("18-08-1988", format), 600.00), fileName);
		saveBooksList.saveBook(new Books(401, "Clean Code", "Robert C. Martin",BookGenre.TECHNOLOGY,LocalDate.parse("22-02-2008", format), 599.00), fileName);
		saveBooksList.saveBook(new Books(501, "Sapiens: A Brief History of Humankind", "Yuval Noah Harari",BookGenre.HISTORY,LocalDate.parse("10-11-2011", format), 499.00), fileName);
		saveBooksList.saveBook(new Books(601, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling",BookGenre.FANTASY,LocalDate.parse("16-08-1997", format), 650.00), fileName);
		//saveBooksList.saveBook(books,fileName);
		System.out.println("Book Record Saved Successfully");
		
		List<Books> bookFromFile = saveBooksList.readBookList(fileName);
		bookFromFile.forEach(System.out::println);
		
		sc.close();
	}
}
