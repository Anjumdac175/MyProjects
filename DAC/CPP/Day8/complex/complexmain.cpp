
// Main function of Complax Class

#include "complex.h"
#include<iostream>
using namespace std;

int main()
{
	Complex c1,c2;
	Complex c3;
	// accept and Displays Complex numbers Real and Imaginary Values
	c1.Accept();
	c1.Display();
	
	// accept and Displays Complex numbers Real and Imaginary Values
	c2.Accept();
	c2.Display();
	
	// Addition of Two Complex Numbers
	c3 = c1 + c2;
	c3.Display();
	
	// Subtraction of Two Complex Numbers
	c3 = c1 - c2;
	c3.Display();
	
	// Multiplication of Two Complex Numbers
	c3 = c1 * c2;
	c3.Display();
	return 0;
}


//OUTPUT
/*Enter the real and imaginary no
24
18
Complex no is [ 24 + 18i ]
Enter the real and imaginary no
12
8
Complex no is [ 12 + 8i ]
Addition of two Complex numbers is: Complex no is [ 36 + 26i ]
Subtraction of two Complex numbers is: Complex no is [ 12 + 10i ]
Multiplication of two Complex numbers is: Complex no is [ 144 + -24i ]*/
