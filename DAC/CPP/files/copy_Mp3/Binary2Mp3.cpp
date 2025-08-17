// coping one binary file into another binary file but its a mp3

#include<iostream>
#include<fstream>
using namespace std;

int main()
{

	ifstream fin("Theri_Bgm.mp3",ios::binary);
	if(!fin)
	{
		cout<<"File is not found"<<endl;
		return 1;
	}
	ofstream fout("copytheri.mp3",ios::binary);
	if(!fout)
	{
		cout<<"File is unable to write data"<<endl;
		return 1;
	}
	
	char ch[1024];
	while(fin.read(ch,sizeof(ch)))
	{
		fout.write(ch,fin.gcount());
	}
	fout.write(ch,fin.gcount());
	//fout << fin;
	cout << "File copied successfully"<<endl;
	
	fin.close();
	fout.close();

	return 0;
}
