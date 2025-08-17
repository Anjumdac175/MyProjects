// Creating a Header file for Permanent Employee class

#include "Employee.h"
class PermEmployee : public Employee
{
	private:
		double basicsalary,HRA,DA;

	public:
		PermEmployee();
		PermEmployee(double basicsalary,double HRA,double DA);
		void Accept();
		void Display();
		void CalcSalary();
};

