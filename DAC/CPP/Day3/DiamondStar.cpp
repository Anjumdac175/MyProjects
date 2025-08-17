//printing of stars at right

#include<iostream>
using namespace std;

int main()
{
        int n;
        cout<<"Enter the no. of line to be printed"<<endl;
        cin>>n;
	// for upper traiangle
	
        for(int i=1;i<=n;i++)             //rows
        {
		for(int j=1;j<=n-i;j++)
		{
			cout<<" ";	//spaces
		}
		for(int j=1;j<=(2*i)-1;j++)
		{
			cout<<"*";
		}
                cout<<endl;
        }

	//for lower traingle
	
	for(int i=n-1;i>=1;i--)
	{
		for(int j=n-i;j>=1;j--)
		{
			cout<<" ";
		}
		for(int j=1;j<=(2*i)-1;j++)
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
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *
 */
