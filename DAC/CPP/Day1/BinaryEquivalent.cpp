//Calculating Binary Equivalent of a given number using Recursion function

#include<iostream>
using namespace std;

void BinaryEquivalent(int number)
{
	int result =0;
	result = number%2;
	if(number == 0)
	{
		cout<<"Binary Equivalent of the given number is:"<<endl;
		return;
	}
	BinaryEquivalent(number/2);
	cout<<result;
}
int main()
{
	int number;
	cout<<"Enter the number to change into Binary:"<<endl;
	cin>>number;
	BinaryEquivalent(number);
        return 0;
}




//OUTPUT OF THE PROGRAM
/*Enter the number to change into Binary:
32
Binary Equivalent of the given number is:
100000*/


