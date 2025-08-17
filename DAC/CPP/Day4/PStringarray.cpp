#include<iostream>

using namespace std;

int main()
{
	int n;
	cout<<"Enter the size of elements"<<endl;
	cin>>n;
	char arr[n];
	
	
	cout<<"Enter characters into the array"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}

	cout<<"Entered characters are"<<endl;
	for(int j=0;j<n;j++)
	{
		cout<<arr[j];
	}
	cout<<endl;
	return 0;
}
/* Output of Program
 Enter the size of elements
6
A
N
J
U
M
S
Entered characters are
ANJUMS
 */
