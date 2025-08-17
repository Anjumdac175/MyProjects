// Main Function of Mobile Phone into a File

#include<iostream>
#include<fstream>
#include<cstring>
using namespace std;

int main()
{

	string filename;
	cout<<"Enter the file name: "<<endl;
	cin>>filename;

	int num;
	cout<<"Enter the no of records to be done: "<<endl;
	cin>>num;
	MobilePhone mp[num];
	ofstream fout(filename,ios::out|ios::binary);
	for(int i=0;i<num;i++)
	{
		mp[i].Accept();
		fout.write((char*)&mp[i],sizeof(mp[i]));
	}
	fout.close();
	cout<<"Data stored......"<<endl;
	
	ifstream fin(filename,ios::in|ios::binary);
	for(int i=0;i<num;i++)
	{
		//mp[i]->Display();
		fin.read((char*)&mp[i],sizeof(mp[i]));
		mp[i].Display();
	}
	fin.close();
	
	MobilePhone::sortByPrice(mp,num);


	return 0;
}
