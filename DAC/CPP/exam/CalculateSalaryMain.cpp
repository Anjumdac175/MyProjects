// implementing main class

#include"CalculateSalary.h"
#include<iostream>
using namespace std;

int main()
{
	Manager m(175,"Anjum",Date(25,2,2025),23120.45,6001.45,7161.25);
	SalesPerson s(183,"Ankita",Date(26,2,2025),32120.45,1000,0.05);
	WageEmp w(187,"Shreya",Date(21,2,2025),23120.45,500,0.03,600);

	m.Display();
	s.Display();
	w.Display();

	m.calsalary();
	s.calsalary();
	w.calsalary();

	return 0;
}
