#include<iostream>
using namespace std;

void SortArray(int* arr,int n)
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

	cout<<"\nSorted Array is:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}

int main()
{

	int n;
	cout<<"Enter the number of elements:"<<endl;
	cin>>n;

	cout<<"Elements  into array :"<<endl;
	int* arr = new int[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}

	cout<<"Elements  in array are:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<arr[i]<<" ";
	}

	SortArray(arr,n);

	delete []arr;
	return 0;
}

//output
/*
 Enter the number of elements:
5
Elements  into array :
6
4
2
1
8
Elements  in array are:
6 4 2 1 8 
Sorted Array is:
1 2 4 6 8 

 */
