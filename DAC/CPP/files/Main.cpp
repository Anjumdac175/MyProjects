#include<iostream>
#include<fstream>
#include"MobilePhone.cpp"

using namespace std;

int main()
{
	ofstream fout("MobilePhone.txt",ios::out|ios::app);
	if(!fout)
	{
		cout<<"File not Found"<<endl;
		return 1;
	}

	//fout << "My file has created successfully"<<endl;
	char ch;
	MobilePhone mp;

	do
	{
		mp.Accept();
		fout.write((char*)&mp,sizeof(mp));
		cout<<"Do you Want to add more data(Y or N)"<<endl;
		cin>>ch;
		cin.get();
	 }while(ch != 'N');

	fout.close();
	cout<<"My file stores data"<<endl;

	return 0;
}
