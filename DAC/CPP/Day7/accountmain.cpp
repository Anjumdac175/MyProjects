#include<iostream>
#include "account.h"
using namespace std;

int main()
{

	int num;
	cout<<"Enter the size of object array:"<<endl;
	cin>>num;
	Account *ac = new Account[num];
	
	while(true)
	{
		cout << "\n-------------------Menu------------------"<< endl;
		cout<<"1.Open Account:"<<endl;
		cout<<"2.Display Account Details:"<<endl;	
		cout<<"3.Deposite Amount:"<<endl;
		cout<<"4.Withdrawl of Amount:"<<endl;
		cout<<"5.Exit:"<<endl;
		cout<<"-----------------------------------"<<endl;

		int choice;
		cout << "Enter choice :";
		cin >> choice;

		switch(choice)
		{
			case 1:
				{
				
					for(int i=0;i<num;i++)
					{
						ac[i].Accept_Details();
					}
					break;
				}
			case 2:
				{
				
					for(int i=0;i<num;i++)
					{
						ac[i].Display_Details();
					}
					break;
				}
			case 3:
				{
					cout<<"Enter the Account no You want to deposit Amount:"<<endl;
					int accno,c;
					cin>>accno;
					double amount;
					cout<<"Enter the amount you want to deposit:"<<endl;
					cin>>amount;
					for(int i=0;i<num;i++)
					{
						if(ac[i].getAccountNo() == accno)
						{
							ac[i].Deposit(amount);
							c=0;
                        				break;
                    				}
                			}

                			if (c!=0) 
					{
                    				cout << "Account Not Found!\n";
                			}	
                			break;
				}
			case 4:
				{
					cout<<"Enter the Account no You want to Withdraw Amount:"<<endl;
                                        int accno,c;
                                        cin>>accno;
                                        double amount;
                                        cout<<"Enter the amount you want to be withdrawn:"<<endl;
                                        cin>>amount;
                                        for(int i=0;i<num;i++)
                                        {
                                                if(ac[i].getAccountNo() == accno)
                                                {
                                                        ac[i].Withdrawl(amount);
                                                        c = 0;
                                                        break;
                                                }
                                        }

                                        if (c!=0) 
					{
                                        	cout << "Account Not Found!\n";
                                        }
                                        break;
				}
			case 5:
				{
					exit(0);
				}
		}
	}
		
		delete []ac;
	
	return 0;
}



/* OUTPUT
 Enter the size of object array:
2

-------------------Menu------------------
1.Open Account:
2.Display Account Details:
3.Deposite Amount:
4.Withdrawl of Amount:
5.Exit:
-----------------------------------
Enter choice :1
Enter Account Details:
Enter Account Holder Name:
Anjum
Enter Acccount Type:
Saving
Enter Balance:
1000
Enter Mobile no:
78946123
Enter Email id:
anjum@gmail.co,
Enter PAN No:
AN46785SK
Enter Account Details:
Enter Account Holder Name:
Ankita
Enter Acccount Type:
Cuurent
Enter Balance:
2000
Enter Mobile no:
879456132
Enter Email id:
ankita@gmail.com
Enter PAN No:
AK45678SK

-------------------Menu------------------
1.Open Account:
2.Display Account Details:
3.Deposite Amount:
4.Withdrawl of Amount:
5.Exit:
-----------------------------------
Enter choice :2
Account Details are:
---------------------------
Acccount No: 100
Account Holder Name: Anjum
Account Type: Saving
Account Balance: 1000
Account Holder Mobile No: 78946123
Account Holder Email: anjum@gmail.co,
Account Holder Pan No: AN46785SK
--------------------
Account Details are:
---------------------------
Acccount No: 101
Account Holder Name: Ankita
Account Type: Cuurent
Account Balance: 2000
Account Holder Mobile No: 879456132
Account Holder Email: ankita@gmail.com
Account Holder Pan No: AK45678SK
--------------------

-------------------Menu------------------
1.Open Account:
2.Display Account Details:
3.Deposite Amount:
4.Withdrawl of Amount:
5.Exit:
-----------------------------------
Enter choice :3
Enter the Account no You want to deposit Amount:
100
Enter the amount you want to deposit:
6000
Your deposit successfully done

-------------------Menu------------------
1.Open Account:
2.Display Account Details:
3.Deposite Amount:
4.Withdrawl of Amount:
5.Exit:
-----------------------------------
Enter choice :2
Account Details are:
---------------------------
Acccount No: 100
Account Holder Name: Anjum
Account Type: Saving
Account Balance: 7000
Account Holder Mobile No: 78946123
Account Holder Email: anjum@gmail.co,
Account Holder Pan No: AN46785SK
--------------------
Account Details are:
---------------------------
Acccount No: 101
Account Holder Name: Ankita
Account Type: Cuurent
Account Balance: 2000
Account Holder Mobile No: 879456132
Account Holder Email: ankita@gmail.com
Account Holder Pan No: AK45678SK
--------------------

-------------------Menu------------------
1.Open Account:
2.Display Account Details:
3.Deposite Amount:
4.Withdrawl of Amount:
5.Exit:
-----------------------------------
Enter choice :4
Enter the Account no You want to Withdraw Amount:
101
Enter the amount you want to be withdrawn:
500
Your Withdraw amount successfully

-------------------Menu------------------
1.Open Account:
2.Display Account Details:
3.Deposite Amount:
4.Withdrawl of Amount:
5.Exit:
-----------------------------------
Enter choice :2
Account Details are:
---------------------------
Acccount No: 100
Account Holder Name: Anjum
Account Type: Saving
Account Balance: 7000
Account Holder Mobile No: 78946123
Account Holder Email: anjum@gmail.co,
Account Holder Pan No: AN46785SK
--------------------
Account Details are:
---------------------------
Acccount No: 101
Account Holder Name: Ankita
Account Type: Cuurent
Account Balance: 1500
Account Holder Mobile No: 879456132
Account Holder Email: ankita@gmail.com
Account Holder Pan No: AK45678SK
--------------------

-------------------Menu------------------
1.Open Account:
2.Display Account Details:
3.Deposite Amount:
4.Withdrawl of Amount:
5.Exit:
-----------------------------------
Enter choice :5
 */
