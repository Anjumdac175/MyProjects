// initiating class in head file for sales manager
#ifndef EMP___H__
#define EMP___H__
#include<string>
using namespace std;

class Employee
{
	protected:
		string name;
	public:
		Employee(string name);
		virtual void Cal_Salary();

};

class Manager : virtual public Employee
{
	protected:
		double basic_salary;
	public:
		Manager(string name,double basic_salary);
		void Cal_Salary();
};

class SalesPerson : virtual public Employee
{
	protected:
		double commission;
	public:
		SalesPerson(string name,double commission);
		void Cal_Salary();
};

class SalesManager : public Manager, public SalesPerson
{
	public:
		SalesManager(string name,double basic_salary,double commission);
		void Cal_Salary();
};

#endif
