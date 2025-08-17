// implementation of account class

#include<iostream>
#include<string>
#include<stdexcept>
using namespace std;

class Account 
{
	private:
		int accno;
		string name;
		double balance;
	public:
		Account():accno(0),name(""),balance(0.f) 
		{}

		Account(int accno,string name, double balance):accno(accno),name(name),balance(balance)
		{}

		void Accept()
		{
			cout<<"Enter the Account Details:"<<endl;
			cout<<"\nEnter the Account No: "<<endl;
			cin>>accno;
			cout<<"\nEnter the Name of the Account Holder: "<<endl;
			cin>>name;
			cout<<"\nEnter the Minimum Balance in Account: "<<endl;
			cin>>balance;

			if(balance <= 0)
			{
				throw runtime_error("Mimimum Balance can't be Zero or Negative");
			}
		}

		void Display() const
		{
			cout<<"-----------------------------"<<endl;
			cout<<"\nAccount Details are: "<<endl;
			cout<<"\nAccount No: "<<this->accno<<endl;
			cout<<"\nAccount Holder Name: "<<this->name<<endl;
			cout<<"\nAccount Balance: "<<this->balance<<endl;

		}

		void Deposit(double amount)
		{
			if(amount >= 50000)
			{
				throw runtime_error("You are Required a Pan Card to deposit amount for above 50,000");
			}

			balance = balance + amount;
			cout<<"Amount of "<<amount<<"Deposited Successfully!!"<<endl;
			
		}

		void Withdraw(double amount)
		{
			if(balance-amount<1000)
			{
				throw runtime_error("Insufficient Balance! Balance can't go below 1000");
			}

			balance = balance - amount;
			cout<<"Amount of "<<amount<<"Withdrawl Successfully!!"<<endl;
			
		}
};
