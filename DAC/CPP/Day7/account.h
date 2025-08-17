#include<string>
using namespace std;

class Account{

	private:
		static int count; 
		int Acc_no;
		string Account_Holder_name;
		string Account_type;
		double balance;
	        string mobile_no;
		string emailid;
		string PANno;


	public:
		Account();
		Account(int Acc_no,string Account_Holder_name,string Account_type,double balance,string mobile_no,string emailid,string PANno);

		void Accept_Details();
		void Display_Details();
		void Deposit(double amount);	
		void Withdrawl(double amount);
		int getAccountNo();
		
};

