// Implementing Main class

#include<iostream>
#include<stdexcept>
#include"Account.cpp"
using namespace std;

int main()
{
	Account ac;
	int choice;
	double amount;
	while(true)
	{
		cout<<"------------------Menu------------------"<<endl;
		cout<<"1>Accept the Account Details"<<endl;
		cout<<"2>Display the Account Details"<<endl;
		cout<<"3>Deposit amount into the Account "<<endl;
		cout<<"4>Withdraw amount into the Account "<<endl;
		cout<<"5>Exit from the program"<<endl;
		cout<<"------------------------------------"<<endl;
	
		cout<<"\nEnter your choice"<<endl;
		cin>>choice;
		
		try
		{
			switch(choice)
			{
				case 1:
					{
						ac.Accept();
						break;
					}
				case 2:
					{	
						ac.Display();
						break;
					}
				case 3:
					{
						cout<<"Enter the Amount to be deposit"<<endl;
						cin>>amount;
						ac.Deposit(amount);
						break;
					}
				case 4:
					{	
						cout<<"Enter the Amount to be Withdraw"<<endl;
						cin>>amount;
						ac.Withdraw(amount);
						break;
					}
				case 5:
					{	
						exit(0);
						cout<<"Exit successfully"<<endl;
					}
			}
		}
		catch(const runtime_error &e)
		{
			cout<<"Error!!"<< e.what()<<endl;
		}
	}
	return 0;
}
