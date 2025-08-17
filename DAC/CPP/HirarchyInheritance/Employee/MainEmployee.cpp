// The Main Function of the Program where all the inherited classess can be called

#include<iostream>
#include "Employee.h"
#include "PermEmployee.h"
#include "ContractEmployee.h"

using namespace std;

int main()
{
	Employee *e;
	PermEmployee pe;
	ContractEmployee ce;

	while(true)
	{
		cout<<"__________________Menu__________________"<<endl;
		cout<<"1--> Do you want to enter the Permanent Employee data "<<endl;
		cout<<"2--> Do you want to enter the Contract Employee data "<<endl;
		cout<<"3--> Exit from the program "<<endl;
		cout<<"____________________________________"<<endl;

		int choice;
		cout<<"Enter your choice"<<endl;
		cin>>choice;
		switch(choice)
		{
			case 1:
				{
					cout<<"Employee's child class Permanent Employee class called:"<<endl;
					e = &pe;
					e->Accept();
					e->Display();
					e->CalcSalary();
					break;
				}	
			case 2:
				{
					cout<<"Employee's child class Contract Employee class called:"<<endl;
					e = &ce;
					e->Accept();
					e->Display();
					e->CalcSalary();
					break;
				}	
			case 3:
				{
					exit(0);
				}
		}
	}

	return 0;
}


//OUTPUT OF THE PROGRAM
/*
 __________________Menu__________________
1--> Do you want to enter the Permanent Employee data
2--> Do you want to enter the Contract Employee data
3--> Exit from the program
____________________________________
Enter your choice
1
Employee's child class Permanent Employee class called:
Enter the Employee ID:
120175
Enter the Employee Name:
Anjum
Enter the Permanent Employee's Basic Salary:
23120.85
Enter the Permanent Employee's HRA:
6008.45
Enter the Permanent Employee's DA:
1535.24
Permanent Employee Salary Details:
____________________
Employee ID is: 120175
Name of the Employee is: Anjum
Basic Salary Permanent Employee is: 23120.8
HRA of the Permanent Employee is: 6008.45
DA of the Permanent Employee is: 1535.24
Total Salary of the Permanent Employee is: 30664.5
__________________Menu__________________
1--> Do you want to enter the Permanent Employee data
2--> Do you want to enter the Contract Employee data
3--> Exit from the program
____________________________________
Enter your choice
2
Employee's child class Contract Employee class called:
Enter the Employee ID:
120183
Enter the Employee Name:
Ankita
Enter the Rate of amount per Hour for a Contract Employee:
100
Enter the no of Hours a Contract Employee worked:
360
Employee ID is: 120183
Name of the Employee is: Ankita
Contract Employee Salary Details:
____________________
Rate of amount per Hour for Contract Employee is: 100
No of Hours a Contract Employee worked is: 360
Total Salary of the Permanent Employee is: 36000
__________________Menu__________________
1--> Do you want to enter the Permanent Employee data
2--> Do you want to enter the Contract Employee data
3--> Exit from the program
____________________________________
Enter your choice
3
*/
