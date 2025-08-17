// implementation of Employee class through vector template/STL

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
#include"Employee.h"
using namespace std;

		Employee::Employee():empid(0),name(""),address(""),salary(0.f)
		{}

		Employee::Employee(int empid,string name,string address,double salary):empid(empid),name(name),address(address),salary(salary)
		{}

		void Employee::Accept()
		{
			cout<<"Enter the Employee Details"<<endl;
			cout<<"\n Enter the Employee ID"<<endl;
			cin>>this->empid;
			cin.ignore();
			cout<<"\n Enter the Employee Name"<<endl;
			getline(cin,this->name);
			cout<<"\n Enter the Employee Address"<<endl;
			getline(cin,this->address);
			cout<<"\n Enter the Employee Salary"<<endl;
			cin>>this->salary;
		}
		int Employee:: getEmpId()
		{
			return empid;
		}
		void Employee :: Display()
		{
			cout<<"\n_______________________________\n"<<endl;
			cout<<"\nEmployee Details are:"<<endl;
			cout<<"\nEmployee ID :"<<this->empid<<endl;
			cout<<"\nEmployee Name :"<<this->name<<endl;
			cout<<"\nEmployee Address :"<<this->address<<endl;
			cout<<"\nEmployee Salary :"<<this->salary<<endl;
			cout<<"\n_______________________________\n"<<endl;
		}

vector<Employee> vemp;

void AddEmp()
{
	Employee ep;
	ep.Accept();
	vemp.push_back(ep);
	cout<<"Employee Added Successfully!!"<<endl;
}

void DisplayAll()
{
	if(vemp.empty())
	{
		cout<<"Records not found"<<endl;
		return;
	}

	for(auto it = vemp.begin(); it !=vemp.end(); it++)
	{
		it->Display();
	}
}

void SearchEmp()
{
	int eid;
	cout<<"Enter the employee to be searched"<<endl;
	cin>>eid;

	for(auto it = vemp.begin(); it !=vemp.end(); it++)
	{
		if(it->getEmpId() == eid)
		{
			it->Display();
			return;
		}

	}
	cout<<"Records not found"<<endl;
}

void DeleteEmp()
{
	int eid;
	cout<<"Enter the Employee id which is to be deleted"<<endl;
	cin>>eid;

	for(auto it = vemp.begin(); it != vemp.end(); it++)
	{
		if(it->getEmpId() == eid)
		{
			vemp.erase(it);
			cout<<"Records deleted successfully!!"<<endl;
			return;
		}
	}
	cout<<"Records not found"<<endl;
}

void ModifyEmp()
{
	int eid;
	cout<<"Enter the Employee id which is to be Modified"<<endl;
	cin>>eid;

	for(auto it = vemp.begin();it != vemp.end(); it++)
	{
		if(it->getEmpId() == eid)
		{
			cout<<"Enter new Modify records"<<endl;
			it->Accept();
			cout<<"Records modified successfully"<<endl;
			return;
		}
	}
	cout<<"Records not found"<<endl;
}
