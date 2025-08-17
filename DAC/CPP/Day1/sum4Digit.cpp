//Calculating sum of digits of a 4 digit number using loop 

#include<iostream>
using namespace std;

int main()
{
	int number,sum = 0;
	cout<<"Enter the four-Digit number:"<<endl;
	cin>>number;

	if(number >=1000 && number <= 9999)
	{
		while(number != 0)
		{
			sum = sum+(number%10);
			number = number/10;
		}

		cout<<"Sum of Four-Digit Number is: "<<sum<<endl;

	}
	else
	{
		cout<<"Enter a valid four-Digit number: "<<endl;
	}
        return 0;
}


//OUTPUT OF THE PROGRAM
/*Enter the four-Digit number:
7894
Sum of Four-Digit Number is: 28*/


