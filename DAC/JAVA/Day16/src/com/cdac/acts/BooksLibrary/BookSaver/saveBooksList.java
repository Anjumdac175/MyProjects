package com.cdac.acts.BooksLibrary.BookSaver;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cdac.acts.BooksLibrary.BookGenre;
import com.cdac.acts.BooksLibrary.Book.Books;


public interface saveBooksList {

	// saves book one by one in to the file and append to file in a binary format
	public static void saveBook( Books books,String Filename) {
		
		try(DataOutputStream DOS = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(Filename,true)))){
							
				DOS.writeInt(books.getBookId());
				DOS.writeUTF(books.getTitle());
				DOS.writeUTF(books.getAuthor());
				DOS.writeUTF(books.getGenre().toString());
				DOS.writeUTF(books.getPubyear().toString());
				DOS.writeDouble(books.getPrice());

				DOS.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Prints/Reads book one by one from the file
	public static List<Books> readBookList(String Filename) throws FileNotFoundException, IOException{
		
		List<Books> bookList = new ArrayList<>();
		
		try(DataInputStream DIS = new DataInputStream(new BufferedInputStream(new FileInputStream(Filename)))){
			
			while(DIS.available() > 0) {
				
				Integer id = DIS.readInt();
				String title = DIS.readUTF();
				String autname = DIS.readUTF();
				BookGenre genre = BookGenre.valueOf(DIS.readUTF());
				LocalDate pubyear = LocalDate.parse(DIS.readUTF());
				Double price = DIS.readDouble();
				
				bookList.add(new Books(id,title,autname,genre,pubyear,price));
			}
		}
		
		return bookList;
		
	}
}
