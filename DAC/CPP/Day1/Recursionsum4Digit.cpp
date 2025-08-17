//Calculating the sum of four-digit number using Recursion

#include<iostream>
using namespace std;

int SumofDigits(int number)
{
        if(number == 0)
        {
                return 0;
        }
        return (number%10)+SumofDigits(number/10);
}

int main()
{
        int number,sum = 0;
        cout<<"Enter the four-Digit number:"<<endl;
        cin>>number;

        if(number >=1000 && number <= 9999)
        {
                cout<<"Sum of Four-Digit Number is: "<<SumofDigits(number)<<endl;
        }
        else
        {
                cout<<"Enter a valid four-Digit number: "<<endl;
        }
        return 0;
}


// OUTPUT OF THE PROGRAM
/*Enter the four-Digit number:
4568
Sum of Four-Digit Number is: 23*/


