#include<iostream>
#include "array.h"
using namespace std;

Array::Array()
{
	//default constructor
}
Array::Array(int n)
{
	//Parameterized Constructor
	this->n = n;
	arr = new int[n];
	cout<<"Dynamic allocation for Array created succuessfully"<<endl;
}

void Array::Accept()
{
	cout<<"Enter the array elements:";

	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
}

void Array::Display()
{

	cout<<"Array elements are:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}

Array::~Array()//destructor
{
	delete []arr;
}
