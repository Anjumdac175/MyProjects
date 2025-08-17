#include<iostream>
#include"Employee.h"
#include"PermEmployee.h"


PermEmployee::PermEmployee():bonus(0),exp(0)
{}

PermEmployee::PermEmployee(double bonus, int exp):bonus(3000),exp(exp)
{
}

void PermEmployee::Accept()
{
        Employee::Accept();
        //cout<<"Enter the Bonus of the Permanent Employee:"<<endl;
        //cin>>bonus;
        cout<<"Enter the no of experience of Permanent Employee:"<<endl;
        cin>>exp;
}
void PermEmployee::Display()
{
        Employee::Display();
        cout<<"Bonus of Contract Employee is: "<<bonus<<endl;
        cout<<"No of years of Contract Employee is: "<<exp<<endl;
}
void PermEmployee::CalcSalary()
{

	
}

