//implementation of Math class

#include<iostream>
#include"MathBase.h"
using namespace std;

		void MathBase :: CalArea()
		{
			cout<<"Base class calculate area"<<endl;
		}

		void Math1 :: Add(int a,int b)
		{
			cout<<"Sum of a and b is: "<<a+b<<endl;
		}

		void Math1 :: Sub(int a, int b)
		{
			cout<<"Substract of a and b is: "<<a-b<<endl;
		}
		void Math1 :: CalArea()
		{
			cout<<"Math1 Calculate Area is called"<<endl;
		}
		void Math2 :: Mul(int a, int b)
		{
		
			cout<<"Multiplication of a and b is: "<<a*b<<endl;
		}
		void Math2 :: Div(int a, int b)
		{
			if(b != 0)
			{
				cout<<"Division of a and b is: "<<a/b<<endl;
			}
			else
			{
				
				cout<<"Division of a and b is not possible, Division can't divide by Zero"<<endl;
			}
		}
		void Math2 :: CalArea()
		{
			cout<<"Math2 Calculate Area is called"<<endl;
		}
		
		void Calculator :: CalArea()
		{
			cout<<"Calculator Area called"<<endl;
		}
		void Calculator :: CallCalArea()
		{
			Math1::CalArea();
		}

