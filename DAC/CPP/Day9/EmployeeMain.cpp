#include<iostream>
#include"PermEmployee.h"
#include"ContEmployee.h"
using namespace std;

int main()
{
	cout<<"Employee class obj"<<endl;
//	Employee e;
	//e.Accept();
	//e.Display();

 	
	cout<<"Permanent Employee class obj"<<endl;
	PermEmployee pe;
	//pe.Accept();
	//pe.Display();

	cout<<"Contract Employee class obj"<<endl;
	ContEmployee ce;
//	ce.Accept();
//	ce.Display();
	while(true)
	{
	cout<<"-------------------Menu-----------"<<endl;
	cout<<"1.Do you want to enter Permanent Employee Details:"<<endl;
	cout<<"2.Do you want to enter contract employee details:"<<endl;
	cout<<"3.Exit"<<endl;
	int ch;
	cout<<"Enter your choice"<<endl;
	cin>>ch;

	switch(ch)
	{
		case 1:
			{
			
				cout<<"Employee to Permanent Employee class obj which is for Run-time Polymorphism"<<endl;
				Employee *ep;
				ep = &pe;
				ep->Accept();
				ep->Display();
				ep->CalcSalary();
				break;
			}

		case 2:
			{
				cout<<"Employee to Permanent Employee class obj which is for Run-time Polymorphism"<<endl;
				Employee *ep;
				ep = &ce;
				ep->Accept();
				ep->Display();
				ep->CalcSalary();
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
