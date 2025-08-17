#include<iostream>
#include "Employee.h"
using namespace std;


Employee::Employee():empid(0),name(""),salary(0.0)
{

}
Employee::Employee(int empid,string name,double salary):empid(empid),name(name),salary(salary)
{

}

void Employee::Accept()
{

	cout<<"Enter the Employee Details:"<<endl;
	cout<<"Enter the Employee ID:"<<endl;
	cin>>empid;
	cout<<"Enter the Employee name:"<<endl;
	cin>>name;
	cout<<"Enter the employee Basic salary:"<<endl;
	cin>>salary;
	
}
void Employee::Display()
{
	cout<<"Employee Details are:"<<endl;
	cout<<empid<<endl;
	cout<<name<<endl;
	cout<<salary<<endl;
}
void Employee::CalcSalary()
{}
