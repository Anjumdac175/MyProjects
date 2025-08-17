// Creating a Header File to Contract Employee class

#include "Employee.h"

class ContractEmployee : public Employee
{
	private:
		double hourlyRate;
		int hoursWorked;
	public:
		ContractEmployee();
		ContractEmployee(double hourlyRate,int hoursWorked);
		void Accept();
		void Display();
		void CalcSalary();
};
