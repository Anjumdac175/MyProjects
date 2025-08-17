//printing of stars at right down with spaces

#include<iostream>
using namespace std;

int main()
{
        int n;
        cout<<"Enter the no. of line to be printed"<<endl;
        cin>>n;
        for(int i=n;i>=0;i--)
        {
                for(int j=n-i;j>=1;j--)
                {
                        cout<<" ";
                }
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
**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *
 */
