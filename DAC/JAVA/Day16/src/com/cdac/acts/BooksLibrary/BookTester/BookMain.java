package com.cdac.acts.BooksLibrary.BookTester;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.BooksLibrary.BookGenre;
import com.cdac.acts.BooksLibrary.Book.Books;
import com.cdac.acts.BooksLibrary.BookSaver.saveBooksList;

public class BookMain {
	
	
	
	

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String fileName = "C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\Day16\\BookList.dat";
		
		String menu = "***********BOOKSLIST**********************"+
				"\n 1. Add Book"+
				"\n 2. Print Books"+
				"\n 3. Exit from Program"+
				"************************";
		
		while(true) {
			
			System.out.println(menu);
			System.out.println("\nEnter Your Choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Book ID: ");
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
				
				Books books = new Books(bookid,title,authorname,bgenre,bookPublish,price);
				
				saveBooksList.saveBook(books,fileName);
				System.out.println("Book Record Saved Successfully");
				break;
			case 2:
				List<Books> bookFromFile = saveBooksList.readBookList(fileName);
				bookFromFile.forEach(System.out::println);
				break;
			case 3:
				sc.close();
				System.out.println("Exit Successfully");
				System.exit(0);
			default:
				System.out.println("Enter valid Input........");
			}
		}		
	}
}