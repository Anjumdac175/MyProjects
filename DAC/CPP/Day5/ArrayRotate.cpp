#include<iostream>
using namespace std;

void LeftRotate(int arr[],int n)
{
	int lr,i,l=0;
	cout<<"\nEnter left shift value:"<<endl;
	cin>>lr;
	int temp[lr],arr1[n];
	for(int i=0;i<n;i++)
	{
		arr1[i] = arr[i];
	}
	for(int i=0;i<lr;i++)
	{
		temp[i]=arr1[i];
	}
	for(i=0;i<n-lr;i++)
	{
		arr1[l]=arr1[i+lr];
		l++;
	}
	for(i=0;i<lr;i++)
	{
		arr1[l++]=temp[i];
	}
	cout<<"\nElements after Left shift:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<arr1[i]<<" ";
	}
	cout<<endl;
}

void RightRotate(int arr[],int n)
{
        int rr,i;
        cout<<"\nEnter right shift value:"<<endl;
        cin>>rr;
        int temp[n];
        for(int i=rr;i>0;i--)
	{
                temp[i-1]=arr[n-i+1];
		cout<<"temp = "<<temp[i];
        }
       /* for(i=0;i<n-rr;i++)
        {
                temp[rr]=arr[i];
        }
      
        cout<<"\nElements after Right shift:"<<endl;
        for(int i=0;i<n;i++)
        {
                cout<<temp[i]<<" ";
        }
        cout<<endl;*/
}


int main()
{
	int n;
	cout<<"Enter the no of Elements:"<<endl;
	cin>>n;

	int arr[n];
	cout<<"Enter Array Elements:"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}

	
	cout<<"Array Elements:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<arr[i]<<" ";
	}

	LeftRotate(arr,n);
	RightRotate(arr,n);
	return 0;

}
