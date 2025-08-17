// sorting an array using pointer

#include<iostream>
using namespace std;


void SortArray(int *const arr, int n)
{
	int temp;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=i;j++)
		{
		
			if(arr[i]<=arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	cout<<"Sorted Array Elements are:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}
int main()
{
	int n;
	cout<<"Enter the size of array"<<endl;
	cin>>n;

	int arr[n];

	cout<<"Enter the elements in to the array"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}

	cout<<"Elements in the array"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<arr[i]<<" ";
	}
	cout<<endl;

	SortArray(arr,n);

	return 0;
}

/* Output of Program
 
   Enter the size of array
10
Enter the elements in to the array
56
24
89
75
12
64
35
20
11
8
Elements in the array
56 24 89 75 12 64 35 20 11 8
Sorted Array Elements are:
8 11 12 20 24 35 56 64 75 89 */
