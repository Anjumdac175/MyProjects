//printing of heart

#include<iostream>
using namespace std;

int main()
{
        int n;
        cout<<"Enter the no. of line to be printed"<<endl;
        cin>>n;
        for(int i=n/2;i<=n;i++)
        {
                for(int j=1;j<=n-i;j++)
                {
			cout<<"*";
		}
                cout<<endl;
        }
        return 0;
}
