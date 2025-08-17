// Creating a Employee class header File
#ifndef ______Emp___
#define ______Emp___ 
#include<string>
using namespace std;

class Employee
{
	private:
		int empid;
		string empname;
	public:
		Employee();
		Employee(int empid, string empname);
		virtual void Accept();
		virtual void Display();
		virtual void CalcSalary()=0;
};
#endif
