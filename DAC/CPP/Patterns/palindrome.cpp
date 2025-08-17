// Check whether given number is palindrome or not

#include<iostream>
using namespace std;

int main()
{
	int number, reverse = 0, palindrome, remainder;
	cout<<"Enter the number:"<<endl;
	cin>>number;

	palindrome = number;
	while(number != 0)
	{
		remainder = number%10;
		reverse = reverse*10 + remainder;
		number = number/10;
	}
	if(reverse == palindrome)
	{
		cout<<palindrome<<" is a palindrome"<<endl;
	}
	else
	{
		cout<<palindrome<<"is not a Palindrome"<<endl;
	}
	return 0;
}
