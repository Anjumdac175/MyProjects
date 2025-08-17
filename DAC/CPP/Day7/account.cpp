#include<iostream>
#include<string>
#include "account.h"
using namespace std;

int Account::count =100;
Account::Account():Acc_no(count),Account_Holder_name(""),Account_type(""),balance(0.0),mobile_no(""),emailid(""),PANno("")
{
	count++;
}
Account::Account(int Acc_no,string Account_Holder_name,string Account_type,double balance,string mobile_no,string emailid,string PANno):Acc_no(count),Account_Holder_name(Account_Holder_name),Account_type(Account_type),balance(balance),mobile_no(mobile_no),emailid(emailid),PANno(PANno)
{
	count++;
}

void Account::Accept_Details()
{
	
	cout<<"Enter Account Details:"<<endl;
	cout<<"Enter Account Holder Name:"<<endl;
	cin>>Account_Holder_name;
	cout<<"Enter Acccount Type:"<<endl;
	cin>>Account_type;
	cout<<"Enter Balance:"<<endl;
	cin>>balance;
	cout<<"Enter Mobile no:"<<endl;
	cin>>mobile_no;
	cout<<"Enter Email id:"<<endl;
	cin>>emailid;
	cout<<"Enter PAN No:"<<endl;
	cin>>PANno;
//	count`:++;

}

void Account::Display_Details()

{
	
	cout<<"Account Details are:"<<endl;
	cout<<"---------------------------"<<endl;
	cout<<"Acccount No: "<<Acc_no<<endl;
	cout<<"Account Holder Name: "<<Account_Holder_name<<endl;
	cout<<"Account Type: "<<Account_type<<endl;
	cout<<"Account Balance: "<<balance<<endl;
	cout<<"Account Holder Mobile No: "<<mobile_no<<endl;
	cout<<"Account Holder Email: "<<emailid<<endl;
	cout<<"Account Holder Pan No: "<<PANno<<endl;
	cout<<"--------------------"<<endl;
}

void Account::Deposit(double amount)
{

      balance = balance+amount;
      cout<<"Your deposit successfully done"<<endl;
}

void Account::Withdrawl(double amount)
{

      balance = balance-amount;
      cout<<"Your Withdraw amount successfully"<<endl;
}
int Account::getAccountNo()
{
	return Acc_no;
}
    
