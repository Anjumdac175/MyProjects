// Calculating Average for n numbers from the user

#include<iostream>
using namespace std;


int PAverageArray(int *const arr,int n)
{
	int sum = 0;
	for(int i = 0;i < n;i++)
	{
		sum = sum+arr[i];
	}
	cout<<"Sum of numbers is:"<<sum<<endl;
	return sum/n;

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

	int Avg = PAverageArray(arr,n);
	cout<<"Average of N numbers are:"<<Avg<<endl;

	return 0;
}


//OUTPUT OF THE PROGRAM
/*
 Enter the size of an Array:
6
Enter the elements into the array:
8
2
5
49
6
4
Elements in the Array are:
8 2 5 49 6 4 
Sum of numbers is:74
Average of N numbers are:12

 */
