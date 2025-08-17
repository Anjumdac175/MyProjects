#include"Book.h"
#include<iostream>
#include<fstream>
using namespace std;

Book::Book() : bookId(0),bookTitle(""),bookAuth(""),price(0.f)
{}

void Book::Accept()
{
	cout<<"Enter book details"<<endl;
	cout<<"\n Book ID:"<<endl;
	cin>>bookId;
	cout<<"\n Book Title:"<<endl;
	cin>>bookTitle;
	cout<<"\n Book Author:"<<endl;
	cin>>bookAuth;
	cout<<"\n Book price:"<<endl;
	cin>>price;
}

int Book::getBookId() const
{
	return bookId;
}
void Book:: Display() const
{
	cout<<"Book details are"<<endl;
        cout<<"\n Book ID: "<<bookId<<endl;
	cout<<"\n Book Title:"<<bookTitle<<endl;
	cout<<"\n Book Author:"<<bookAuth<<endl;
	cout<<"\n Book price:"<<price<<endl;
}

void Book::AddBook()
{
	Book bk;
	bk.Accept();
	ofstream fout("Book.dat",ios::binary|ios::app);
	if(!fout)
	{
		cout<<"File not found"<<endl;
		return;
	}
	fout.write((char*)&bk,sizeof(bk));
	fout.close();
	cout<<"data stored......"<<endl;

}

void Book::DisplayAll()
{
	Book bk;
	ifstream fin("Book.dat",ios::binary);
	if(!fin)
	{
		cout<<"File not found"<<endl;
		return;
	}
	while(fin.read((char*)&bk,sizeof(bk)))
	{
		bk.Display();
	}
	fin.close();
}

void Book::Displayspec(int pos)
{
	Book bk;
	 ifstream fin("Book.dat",ios::binary);
        if(!fin)
        {
                cout<<"File not found"<<endl;
                return;
        }
	fin.seekg(pos * sizeof(bk),ios::beg);

        if(fin.read((char*)&bk,sizeof(bk)))
        {
                bk.Display();
        }
	else
	{
		cout<<"book records not found"<<endl;
	}
        fin.close();

}

void Book::DeleteBook(int id)
{
	Book bk;
	ifstream fin("Book.dat",ios::binary);
     	ofstream fout("temp.dat",ios::binary);

	bool found = false;

	while(fin.read((char*)&bk,sizeof(bk)))
	{
		if(bk.getBookId() != id)
		{
			fout.write((char*)&bk,sizeof(bk));
		}
		else
		{
			found = true;
		}
	}
	fin.close();
	fout.close();

	remove("book.dat");
	rename("temp.dat","book.dat");

	if(found)
	{
		cout<<"Book deleted....."<<endl;
	}
	else
	{
		cout<<"id not found"<<endl;
	}
}
