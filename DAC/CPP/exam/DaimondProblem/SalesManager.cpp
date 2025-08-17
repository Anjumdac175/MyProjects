// implementation of Salesperson diamond prblm

#include"SalesManager.h"
#include<string>
#include<iostream>
using namespace std;

//Employee constructor
Employee::Employee(string name)
{
	this->name = name;
}
// Employee Salary
void Employee:: Cal_Salary()
{
	cout<<"Employee class salary"<<endl;
}


//Manager ctr
Manager::Manager(string name, double basic_salary) : Employee(name)
{	
	this->basic_salary = basic_salary;
}
//manager salary
void Manager:: Cal_Salary()
{
	cout<<"Manager Salary is: "<<basic_salary<<endl;
}


// Salesperson ctr
SalesPerson:: SalesPerson(string name, double commission) : Employee(name)
{
	this->commission = commission;
}
//salesperson salary
void SalesPerson :: Cal_Salary()
{
	cout<<"SalePerson Commission is: "<<commission<<endl;
}


//Salesmanager ctr
SalesManager :: SalesManager(string name,double basic_salary, double commission) : Employee(name),Manager(name,basic_salary),SalesPerson(name,commission)
{}

// finally calculating salary
void SalesManager :: Cal_Salary()
{
	double Salary = basic_salary + commission;
	cout<<"Sales Manager's Salary is: "<<Salary<<endl;
}
