//Printing N series of Factorials

#include<iostream>
using namespace std;
void NFactorial(int num)
{
	for(int i = 1;i <= num;i++)
	{
		int fact = 1;
		for(int j = 1;j <= i;j++)
		{
			fact = fact*j;
		}

		cout<<"Factorial of "<<i<<" is: "<<fact<<endl;
	}
}
int main()
{
	int number;
	cout<<"Enter the N Series: "<<endl;
	cin>>number;
	NFactorial(number);

        return 0;
}



//OUTPUT OF THE PROGRAM
/*
Enter the N Series:
10
Factorial of 1 is: 1
Factorial of 2 is: 2
Factorial of 3 is: 6
Factorial of 4 is: 24
Factorial of 5 is: 120
Factorial of 6 is: 720
Factorial of 7 is: 5040
Factorial of 8 is: 40320
Factorial of 9 is: 362880
Factorial of 10 is: 3628800 
 */

