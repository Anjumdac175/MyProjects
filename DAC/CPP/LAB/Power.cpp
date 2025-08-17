//Calculate the power of a number

#include<iostream>
using namespace std;

int main()
{

	int number,power,result = 1;
	cout<<"Enter the number :"<<endl;
	cin>>number;
	cout<<"Enter the power :"<<endl;
	cin>>power;
	
	for(int i=1;i<=power;i++)
	{
		result = result*number;
	}
	
	cout<<"Power of a given number "<<number<<" is "<<result<<endl;

        return 0;
}  
