//printing of Diamondsquare

#include<iostream>
using namespace std;

int main()
{
        int n;
        cout<<"Enter the no. of line to be printed"<<endl;
        cin>>n;

	for(int i=n;i>=1;i--)
        {
		 for(int j=1;j<=i;j++)
                {
                        cout<<"*";
                }
                
		for(int j=n-i;j>=1;j--)
                {
                        cout<<"  ";
                }
                for(int j=1;j<=i;j++)
                {
                        cout<<"*";
                }
		cout<<endl;
	}
	//lower traingle
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			cout<<"*";
		}
		for(int j=1;j<=n-i;j++)
                {
                        cout<<"  ";
                }
		for(int j=1;j<=i;j++)
		{
			cout<<"*";
		}
                cout<<endl;
	}

        return 0;
}
