// coping one binary file into another binary file but its a mp3

#include<iostream>
#include<fstream>
using namespace std;

int main()
{

	ifstream fin("source.mp3",ios::binary);
	if(!fin)
	{
		cout<<"File is not found"<<endl;
		return 1;
	}
	ofstream fout("destination.mp3",ios::binary);
	if(!fout)
	{
		cout<<"File is unable to write data"<<endl;
		return 1;
	}
	
	fout << fin.rdbuf();
	cout << "File copied successfully"<<endl;
	
	fin.close();
	fout.close();

	return 0;
}
