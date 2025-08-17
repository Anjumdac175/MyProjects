// creating a Employee class implementation 

#include<iostream>
#include "Employee.h"
using namespace std;

Employee::Employee():empid(0),empname("")
{}  //default constructor

Employee::Employee(int empid,string name):empid(empid),empname(empname)
{
	//parametrized constructor
}

void Employee::Accept()
{

	cout<<"Enter the Employee ID: "<<endl;
	cin>>empid;

	cout<<"Enter the Employee Name: "<<endl;
	cin>>empname;
}

void Employee::Display()
{
	cout<<"Employee ID is: "<<this->empid<<endl;
	cout<<"Name of the Employee is: "<<this->empname<<endl;
}

void Employee::CalcSalary()
{}
