//Swapping of two numbers using Functions

#include<iostream>
using namespace std;

void Swap(int a,int b)
{
	int temp;
	temp = a;
	a = b;
	b = temp;
	cout<<"After Swapping of a and b is: "<<a<<"\t"<<b<<endl;
}
int main()
{
	int a,b;
	cout<<"Enter the Values of a and b:"<<endl;
	cin>>a>>b;
	cout<<"Before Swapping of a and b is: "<<a<<"\t"<<b<<endl;
	Swap(a,b);
        return 0;
}  
