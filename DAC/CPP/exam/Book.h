// book header file
#ifndef BOOK__H__
#define BOOK__H__

#include<string>
using namespace std;

class Book
{
	private:
		int bookId;
		string bookTitle,bookAuth;
		double price;
	public:
		Book();
		void Accept();
		void Display() const;
		int getBookId() const;

static void AddBook();
static void DisplayAll();
static void Displayspec(int pos);
static void DeleteBook(int id);
};
#endif
