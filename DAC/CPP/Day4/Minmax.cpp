// Finding out First and Second Minimum and First and Second Maxmimum of array 

#include<iostream>
using namespace std;

// Finding out First Minimum element

int Min(int *const arr, int n)
{

	int min=*arr;
	for(int i=0;i<n;i++)
	{
		if(arr[i] <= min)
		{
			min = arr[i];
		}
	}

	return min;
}

// Finding out second Minimum element

int SecMin(int *const arr, int n, int min)
{
	int secmin = *arr;
	for(int i=0;i<n;i++)
	{
		if((arr[i] <= secmin) && (arr[i]!=min))
		{
			secmin = arr[i];
		}
	}
	return secmin;
}

//Finding out First Maximum element

int Max(int *const arr, int n)
{

        int max=*arr;
        for(int i=0;i<n;i++)
        {
                if(arr[i] >= max)
                {
                        max = arr[i];
                }
        }
        return max;

}

//Finding out Second Maximum element

int SecMax(int *const arr, int n, int max)
{
	int secmax = *arr;
	for(int i=0;i<n;i++)
	{
		if((arr[i] >= secmax) && (arr[i]!=max))
		{
			secmax = arr[i];
		}
	}
	return secmax;
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
	int min = Min(arr,n);
	int secmin = SecMin(arr,n,min);
	
	int max = Max(arr,n);
	int secmax = SecMax(arr,n,max);
	cout<<"Minimum value in the array is:"<<min<<endl;
	cout<<"Second Minimum value in the array is:"<<secmin<<endl;
	
	cout<<"maximum value in the array is:"<<max<<endl;
	cout<<"Second Maximum value in the array is:"<<secmax<<endl;
	
	
	return 0;
}


//OUTPUT OF THE PROGRAM
/*
Enter the size of an Array:
10
Enter the elements into the array:
25
65
34
98
15
34
26
57
82
64
Elements in the Array are:
25 65 34 98 15 34 26 57 82 64
Minimum value in the array is:15
maximum value in the array is:98
Second Minimum value in the array is:25
Second Maximum value in the array is:82
 */
