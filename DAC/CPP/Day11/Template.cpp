// Creating Template to do Swap, Add, Subtract, Multiplication and Division functions

#include<iostream>
using namespace std;
// Adding
template <typename T>
T Add(T a,T b)
{
	return a+b;
}

// Substraction
template <typename T>
T Subtract(T a,T b)
{
	return a-b;
}

//Multiplication
template <typename T>
T Multiply(T a,T b)
{
	return a*b;
}

//Division
template <typename T>
T Divide(T a, T b)
{
	return a/b;
}

// Swap
template <typename T>
void Swap(T &a,T &b)
{
	T temp = a;
	a = b;
	b = temp;
}
int main()
{

	cout<<"__________Integer DataType_______________"<<endl;
	int a,b;
	cout<<"Enter Values of a and b:"<<endl;
	cin>>a>>b;
	cout<<"\nAddition of 2 numbers: "<<Add(a,b)<<endl;
	cout<<"\nSubtraction of 2 numbers:  "<<Subtract(a,b)<<endl;
	cout<<"\nMultiplication of 2 numbers:  "<<Multiply(a,b)<<endl;
	cout<<"\nDivision of 2 numbers:  "<<Divide(a,b)<<endl;
	cout<<"\nBefore Swapping values of a and b are: a= "<<a<<", b= "<<b<<endl;
	Swap(a,b);
	cout<<"\nAfter Swapping values of a and b are: a= "<<a<<", b= "<<b<<endl;
	cout<<"_____________________________________________________________"<<endl;
	cout<<"__________Double DataType_______________"<<endl;
	double c,d;
	cout<<"\nEnter Values of a and b:"<<endl;
	cin>>c>>d;
	cout<<"\nAddition of 2 numbers: "<<Add(c,d)<<endl;
	cout<<"\nSubtraction of 2 numbers:  "<<Subtract(c,d)<<endl;
	cout<<"\nMultiplication of 2 numbers:  "<<Multiply(c,d)<<endl;
	cout<<"\nDivision of 2 numbers:  "<<Divide(c,d)<<endl;
	cout<<"\nBefore Swapping values of c and d are: c= "<<c<<", d= "<<d<<endl;
	Swap(c,d);
	cout<<"\nAfter Swapping values of a and b are: c= "<<c<<", d= "<<d<<endl;
	
	return 0;
}


//output
/*__________Integer DataType_______________
Enter Values of a and b:
60
30

Addition of 2 numbers: 90

Subtraction of 2 numbers:  30

Multiplication of 2 numbers:  1800

Division of 2 numbers:  2

Before Swapping values of a and b are: a= 60, b= 30

After Swapping values of a and b are: a= 30, b= 60
_____________________________________________________________
__________Double DataType_______________

Enter Values of a and b:
89.57
13.5478

Addition of 2 numbers: 103.118

Subtraction of 2 numbers:  76.0222

Multiplication of 2 numbers:  1213.48

Division of 2 numbers:  6.61141

Before Swapping values of c and d are: c= 89.57, d= 13.5478

After Swapping values of a and b are: c= 13.5478, d= 89.57*/
