#include<iostream>
#include"Employee.h"
#include"ContEmployee.h"
using namespace std;

ContEmployee::ContEmployee():bonus(0),years(0)
{}
ContEmployee::ContEmployee(double bonus, int years):bonus(bonus),years(years)
{}
void ContEmployee::Accept()
{
	Employee::Accept();
	cout<<"Enter the Bonous of the Contract Employee:"<<endl;
	cin>>bonus;
	cout<<"Enter the no of years of Contract Employee:"<<endl;
	cin>>years;
}
void ContEmployee::Display()
{
	Employee::Display();
	cout<<"Bonus of Contract Employee is: "<<bonus<<endl;
	cout<<"No of years of Contract Employee is: "<<years<<endl;
}
void ContEmployee::CalcSalary()
{}
