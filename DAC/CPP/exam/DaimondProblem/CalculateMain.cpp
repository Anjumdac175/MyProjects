//implementation of Math class

#include<iostream>
#include"MathBase.h"
using namespace std;

int main()
{
	Calculator cal;
	int a,b;
	cout<<"Enter the a and b vlaues"<<endl;
	cin>>a>>b;
	cal.Add(a,b);
	cal.Sub(a,b);
	cal.Mul(a,b);
	cal.Div(a,b);
	cal.CallCalArea();
	return 0;
}
