// Employee header file
#ifndef Emp_H___
#define Emp_H___
#include<vector>
#include<iostream>
using namespace std;

class Employee
{
	private:
		int empid;
		string name,address;
		double salary;
	public:
		Employee();
		Employee(int empid,string name, string address, double salary);
			
		void Accept();
		int getEmpId();
		void Display();
};
extern vector<Employee> vemp;

void AddEmp();
void DisplayAll();
void SearchEmp();
void DeleteEmp();
void ModifyEmp();

#endif

