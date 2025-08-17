// implementing main for Employee
#include"Employee.h"
#include<iostream>
#include<vector>
using namespace std;

int main()
{
	int choice;
	while(true)
	{
		cout<<"-----------------Menu--------------------"<<endl;
		cout<<"\n1>Add Employee Records"<<endl;
		cout<<"\n2>DisplayAll Employee Records"<<endl;
		cout<<"\n3>Search in Employee Records"<<endl;
		cout<<"\n4>Delete in Employee Records"<<endl;
		cout<<"\n5>Modify in Employee Records"<<endl;
		cout<<"\n6>Exit"<<endl;
		cout<<"\n-------------------------------------"<<endl;

		cout<<"Enter your choice"<<endl;
		cin>>choice;

		switch(choice)
		{
			case 1:
				{
					AddEmp();
					break;
				}
			case 2:
				{
					DisplayAll();
					break;
				}
			case 3:
				{
					SearchEmp();
					break;
				}
			case 4:
				{
					DeleteEmp();
					break;
				}
			case 5:
				{
					ModifyEmp();
					break;
				}
			case 6:
				{
					exit(0);
					cout<<"Exit successfully!!"<<endl;
				}
		}
	}
	return 0;
}
