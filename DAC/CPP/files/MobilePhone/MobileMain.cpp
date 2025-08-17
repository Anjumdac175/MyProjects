#include<iostream>
#include<fstream>
#include"MobilePhone.h"
using namespace std;

#define MAX_SIZE 100
int main()
{
	MobilePhone Marr[MAX_SIZE];
	int size=0;

	while(true)
	{
		cout<<"_____________________Menu_________________________"<<endl;
		cout<<"1. Write Mobile Phone Data into File"<<endl;
		cout<<"2. Read Mobile Phone Data into File"<<endl;
		cout<<"3. Read Mobile Phone Data and Sort them by Price"<<endl;
		cout<<"4. Exit"<<endl;
		cout<<"_______________________________________________"<<endl;

		int choice;
		cout<<"Enter your Choice"<<endl;
		cin>>choice;

		switch(choice)
		{
			case 1:
				{
					MobilePhone mp;
					mp.Accept();
					ofstream fout("phone.txt",ios::binary|ios::app);
					if(!fout)
					{
						cout<<"File not Found"<<endl;
						return 1;
					}
					fout.write((char*)&mp,sizeof(MobilePhone));
					fout.close();
					cout<<"data stored......"<<endl;

					break;
				}
			case 2:
				{
					ifstream fin("phone.txt",ios::binary);
					if(!fin)
					{
						cout<<"File not Found"<<endl;
						return 1;
					}
					size = 0;
					while(size<MAX_SIZE && fin.read((char*)&Marr[size],sizeof(MobilePhone)))
					{
						size++;
					}
					fin.close();

					for(int i=0;i<size;i++)
					{
						Marr[i].Display();
					}

					break;
				}
			case 3:
				{
					MobilePhone::sortByPrice(Marr,size);
					break;
				}
			case 4:
				{
					exit(0);
				}
		}
	}
}

