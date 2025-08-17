#ifndef _________EMP__H___
#define _________EMP__H___ 
#include<string>
using namespace std;

class Employee{
	
	private:
	int empid;
	string name;
	double salary;
	
	public:
	Employee();
	Employee(int empid,string name,double salary);
//	double getsalary(double salary);
	virtual void Accept();
	virtual void Display();
	virtual void CalcSalary()=0;
};
#endif
