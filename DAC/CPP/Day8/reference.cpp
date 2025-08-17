#include<iostream>
using namespace std;

int factorial(int const &n)
{
	//n=9;
	if(n == 0)
	{
		return 1;
	}
	else
	{
		return n*factorial(n-1);
	}

}


int main()
{

	int num;
	cout<<"Enter the factorial no"<<endl;
	cin>>num;
	
	int fact = factorial(num);
	cout<<"Factorial of "<<num<<" is: "<<fact<<endl;

}

//OUTPUT
/*
Enter the factorial no
6
Factorial of 6 is: 720 

**if we change value of n then error occurs***

 reference.cpp: In function ‘int factorial(const int&)’:
reference.cpp:6:10: error: assignment of read-only reference ‘n’
    6 |         n=9;
      |         ~^~
      */
