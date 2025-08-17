// To print N series of Prime

#include<iostream>
using namespace std;

int main()
{

	int num, n = 0,prime = 1;
	cout<<"Enter the N series:"<<endl;
	cin>>num;
	
	cout<<" prime number are: ";
	while(n<num)
	{
		int c = 0;
		for(int j=1;j<=prime;j++)
		{
			if(prime%j == 0)
			{
				c = c+1;
			}
		}
		if(c == 2)
		{
			cout<<prime<<endl;
			n++;
		}
			prime++;
	}


	return 0;
}
