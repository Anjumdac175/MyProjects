#include "Employee.h"

class PermEmployee:public Employee
{
	private:
		double bonus;
		int exp;
	public:
		PermEmployee();
		PermEmployee(double bonus, int exp);
		void Accept();
		void Display();
		void CalcSalary();

};
