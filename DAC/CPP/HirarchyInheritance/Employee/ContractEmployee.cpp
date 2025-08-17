
// creating a Contract Employee class implementation 

#include<iostream>
#include "Employee.h"
#include "ContractEmployee.h"
using namespace std;

ContractEmployee::ContractEmployee():hourlyRate(0.0),hoursWorked(0)
{}  //default constructor

ContractEmployee::ContractEmployee(double hourlyRate,int hoursWorked):hourlyRate(hourlyRate),hoursWorked(hoursWorked)
{}
void ContractEmployee::Accept()
{
	Employee::Accept();
	cout<<"Enter the Rate of amount per Hour for a Contract Employee: "<<endl;
        cin>>hourlyRate;

        cout<<"Enter the no of Hours a Contract Employee worked: "<<endl;
        cin>>hoursWorked;
}
void ContractEmployee::Display()
{
	Employee::Display();
	cout<<"Contract Employee Salary Details: "<<endl;
	cout<<"____________________"<<endl;
	cout<<"Rate of amount per Hour for Contract Employee is: "<<this->hourlyRate<<endl;
	cout<<"No of Hours a Contract Employee worked is: "<<this->hoursWorked<<endl;
}

void ContractEmployee::CalcSalary()
{

	double salary = hourlyRate*hoursWorked;
	cout<<"Total Salary of the Permanent Employee is: "<<salary<<endl;
}
