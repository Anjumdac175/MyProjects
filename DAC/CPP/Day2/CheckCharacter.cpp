//Check Whether the Given Character is Capital or Small

#include<iostream>
using namespace std;

int main()
{
	char ch;
	cout<<"Enter the Character:"<<endl;
	cin>>ch;

	if(ch >= 'A' && ch <= 'Z')
	{
		cout<<ch<<" is Capital Letter"<<endl;
	}
	else if(ch >= 'a' && ch <= 'z')
	{
		cout<<ch<<" is small Letter"<<endl;
	}
	else
	{	
		cout<<ch<<" is not a valid character"<<endl;
	}
        return 0;
}



//OUTPUT OF PROGRAM
/*
 Enter the Character:
U
U is Capital Letter
Enter the Character:
h
h is small Letter
Enter the Character:
#
# is not a valid character
 */


