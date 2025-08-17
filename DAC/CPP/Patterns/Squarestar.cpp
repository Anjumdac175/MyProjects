//printing of stars at right

#include<iostream>
using namespace std;

int main()
{
        int n;
        cout<<"Enter the no. of line to be printed"<<endl;
        cin>>n;
        for(int i=1;i<=n;i++)
        {
		for(int j=1;j<=n;j++)
                {
			cout<<"*";
                }
                cout<<endl;
        }
        return 0;
}
