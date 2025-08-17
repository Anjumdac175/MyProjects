//printing of stars at left

#include<iostream>
using namespace std;

int main()
{
	int n;
	cout<<"Enter the no. of line to be printed"<<endl;
	cin>>n;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			cout<<"*";
		}
		cout<<endl;
	}
        return 0;
}

//OUTPUT OF THE PROGRAM
/*
 Enter the no. of line to be printed
10
*
**
***
****
*****
******
*******
********
*********
**********
 */
