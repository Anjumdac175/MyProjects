// header file for declaring all inhertance

#ifndef EMPL__H____
#define EMPL__H____

#include<string>
using namespace std;

class Date
{
	public:
		int date,month,year;
		Date(int d = 1,int m = 1,int y = 2000);
		void Display() const;

};

class Employee
{
	private:
		int empid;
		string name;
		Date doj;
		double salary;
	public:
		Employee(int empid,string name, Date doj,double salary);
		void Display() const;
		virtual void calsalary()=0;
		virtual ~Employee() {}; 
};

class Manager : public Employee
{
	private:
		double TA;
		double HRA;
	public:
		Manager(int empid,string name,Date obj, double salary,double ta,double hra);
		void calsalary();
		void Display() const;
};

class SalesPerson : public Employee
{
	private:
		double sales;
		double comm;
	public:
		SalesPerson(int empid,string name, Date obj,double salary,double sales,double comm);
		void calsalary();
		void Display() const;
};

class WageEmp : public SalesPerson
{
	private:
		double rate;
	public:
		WageEmp(int empid,string name,Date obj,double salary,double sales,double comm, double rate);
		void calsalary();
		void Display() const;
};

#endif
