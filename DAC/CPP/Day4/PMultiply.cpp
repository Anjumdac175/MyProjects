// Calculating Average for n numbers from the user

#include<iostream>
using namespace std;


void PMultiplyArray(int *const arr,int n)
{

	int res=0;
	cout<<"Product of N numbers are:"<<endl;
	for(int i = 0;i < n;i++)
	{
	 	res=arr[i]*2; 
		cout<<res<<endl;
	}


}
int main()
{
	int n;
	cout<<"Enter the size of an Array:"<<endl;
	cin>>n;

	int arr[n];
	cout<<"Enter the elements into the array:"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	
	cout<<"Elements in the Array are:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<arr[i]<<" ";
	}
	cout<<endl;

	 PMultiplyArray(arr,n);
//	cout<<"Product of N numbers are:";
//	cout<<Mul<<endl;

	return 0;
}

//OUTPUT OF THE PROGRAM
/*Enter the size of an Array:
5
Enter the elements into the array:
2
6
9
8
7
Elements in the Array are:
2 6 9 8 7 
Product of N numbers are:
4
12
18
16
14

 */
