#include<iostream>
#include "array.h"

using namespace std;

int main()

{
	int n;
	cout<<"Enter the no of elements:"<<endl;
	cin>>n;
	Array a(n);
	a.Accept();
	a.Display();
	
	return 0;
}


//OUTPUT
/*Enter the no of elements:
10
Dynamic allocation for Array created succuessfully
Enter the array elements:32
54
86
48
75
16
35
29
78
20
Array elements are:
32 54 86 48 75 16 35 29 78 20*/
