// implementation

#include<iostream>
#include"CalculateSalary.h"
using namespace std;
//Date defination
Date :: Date(int d, int m,int y) : date(d),month(m),year(y)
{}

void Date:: Display() const
{
	cout<<date<<"-"<<month<<"-"<<year<<endl;
}

// implementation of employee

Employee::Employee(int id, string n,Date d,double s) : empid(id),name(n),doj(d),salary(s)
{}

void Employee::Display() const
{
	cout<<"Employee Details:"<<endl;
	cout<<"\nID:\t"<<empid<<" ,Name\t"<<name<<" ,Date of Joining\t";
	doj.Display();
	cout<<"Base Salary\t"<<salary<<endl;
}

//implementing of manager class

Manager::Manager(int id, string n,Date d, double s, double ta,double hra) : Employee(id,n,d,s),TA(ta),HRA(hra)
{}

void Manager::calsalary()
{
	double sal = sal+TA+HRA;
	cout<<"Manager Salary is: "<<sal<<endl;
}

void Manager::Display() const
{
	Employee::Display();
	cout<<"Manager TA is: "<<TA<<"\tHRA is: "<<HRA<<endl;
}

//saleperson implementation

SalesPerson::SalesPerson(int id, string n, Date d, double s,double sm,double comm) : Employee(id,n,d,s),sales(sm),comm(comm)
{}

void SalesPerson::calsalary()
{
	double sal = sal+(sales*comm);
	cout<<"SalesPerson Salary is: "<<sal<<endl;
}

void SalesPerson::Display() const
{
	Employee::Display();
	cout<<"Sales Person's Sales are: "<<sales<<"\tCommission is: "<<comm<<endl;
}

// Wage Employee implementation

WageEmp::WageEmp(int id,string n,Date d,double s, double sm,double comm,double rate) : SalesPerson(id,n,d,s,sm,comm),rate(rate)
{}

void WageEmp::calsalary()
{
	double sal = sal+rate;
	cout<<"Wage Employee daily wage is: "<<sal<<endl;
}

void WageEmp::Display() const
{
	SalesPerson::Display();
	cout<<"Wage Employee rate per day is: "<<rate<<endl;
}
