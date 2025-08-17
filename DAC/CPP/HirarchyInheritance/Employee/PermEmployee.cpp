
// creating a Permanent Employee class implementation 

#include<iostream>
#include "Employee.h"
#include "PermEmployee.h"
using namespace std;

PermEmployee::PermEmployee():basicsalary(0.0),HRA(0.0),DA(0.0)
{}  //default constructor

PermEmployee::PermEmployee(double basicsalary,double HRA,double DA):basicsalary(basicsalary),HRA(HRA),DA(DA)
{

	//parametrized constructor
}

void PermEmployee::Accept()
{
	Employee::Accept();

	cout<<"Enter the Permanent Employee's Basic Salary: "<<endl;
	cin>>basicsalary;

	cout<<"Enter the Permanent Employee's HRA: "<<endl;
	cin>>HRA;
	
	cout<<"Enter the Permanent Employee's DA: "<<endl;
	cin>>DA;

}
void PermEmployee::Display()
{
	cout<<"Permanent Employee Salary Details: "<<endl;
	cout<<"____________________"<<endl;
	Employee::Display();
	cout<<"Basic Salary Permanent Employee is: "<<this->basicsalary<<endl;
	cout<<"HRA of the Permanent Employee is: "<<this->HRA<<endl;
	cout<<"DA of the Permanent Employee is: "<<this->DA<<endl;
}

void PermEmployee::CalcSalary()
{

	double salary = basicsalary+HRA+DA;
	cout<<"Total Salary of the Permanent Employee is: "<<salary<<endl;
}
