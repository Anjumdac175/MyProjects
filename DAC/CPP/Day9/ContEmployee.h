#include "Employee.h"

class ContEmployee:public Employee
{
	private:
		double bonus;
		int years;
	public:
		ContEmployee();
		ContEmployee(double bonus, int years);
		void Accept();
		void Display();
		void CalcSalary();
};

