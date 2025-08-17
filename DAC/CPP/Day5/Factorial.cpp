#include<iostream>
using namespace std;

int Factorial(int n)
{	
	if(n==0)
	{
		return 1;
	}
	else
	{
		return n*Factorial(n-1);
	}
}



int main()
{
	int num;
	cout<<"Enter the N series of factorial to be printed:"<<endl;
	cin>>num;
	cout<<"Factorial series is:"<<endl;
	
	for(int i=1;i<=num;i++)
	{
		int fact = Factorial(i);
		cout<<fact<<endl;
	}
	

	return 0;
}
