// Defination of Constrcutors and Function Members implementation

#include "complex.h"
#include<iostream>

using namespace std;

Complex::Complex():real(0), img(0)
{
//Default Constructor
}

Complex::Complex(int real,int img):real(real),img(img)
{
//Parametrized constructor
}

void Complex::Accept()
{
	cout<<"Enter the real and imaginary no"<<endl;
	cin>>real>>img;
}

void Complex::Display()

{
	cout<<"Complex no is [ "<<real<<" + "<<img<<"i ]"<<endl;
}

Complex Complex::operator+(Complex temp) //(Add(c1.r+c2.r, c1.im+c2.img))
{
	cout<<"Addition of two Complex numbers is: ";
	return Complex(this->real+temp.real,this->img+temp.img);
}
Complex Complex::operator-(Complex temp)  //(Subtraction(c1.r-c2.r,c1.im-c2.im))
{
	cout<<"Subtraction of two Complex numbers is: ";
	return Complex(this->real-temp.real,this->img-temp.img);
}
Complex Complex::operator*(Complex temp)//(c1.r*c2.r - c1.im*c2.im, c1.r*c2.im-c1.im*c2.r)
{
	cout<<"Multiplication of two Complex numbers is: ";
	return Complex((this->real*temp.real)-(this->img*temp.img),(this->real*temp.img)-(this->img*temp.real));
}
