//Check whether given number is armstrong number or not

#include<iostream>
using namespace std;

int main()
{
	int number,add=0,remainder;
	cout<<"Enter the number to be checked:"<<endl;
	cin>>number;
	
	int original = number;
	while(number != 0)
	{
		remainder = number%10;
		add = add+(remainder*remainder*remainder);
		number = number/10;
	}
	if(add == original)
	{
		cout<<original<<" is a Armstrong Number"<<endl;
	}
	else
	{
	
		cout<<original<<" is not a Armstrong Number"<<endl;
	}
	return 0;
}
