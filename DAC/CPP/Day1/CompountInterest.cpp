//Calculating Compound Interest

#include<iostream>
using namespace std;

int main()
{
	float amount=0, principal,ci;
	int year,rate;
	
	cout<<"Enter the Principal amount:"<<endl;
	cin>>principal;
	cout<<"Enter the rate of interest:"<<endl;
	cin>>rate;
	cout<<"Enter the no. of years:"<<endl;
	cin>>year;
		

	amount = principal*((1+(rate/100))^year);  // calculating amount for a period of time on principal
	cout<<"Amount over a period of time:"<<amount<<endl;

	ci = amount - principal;
	cout<<"Compound Interest on Principal amount is:"<<ci<<endl;

	return 0;	
}



//OUTPUT OF THE PROGRAM
/*
Enter the Principal amount:
15000.35
Enter the rate of interest:
12
Enter the no. of years:
3
Amount over a period of time:30000.7
Compound Interest on Principal amount is:15000.3
*/


