#include<iostream>
#include<string>

using namespace std;

class Employee
{
	public:
	int empno;
	string empname;
	int empsalary;
	string empdept;
	
	public:

	/*Employee()
	{
		//cout<<"Default constructor called"<<endl;
		this->empno =0;
		this->empname ="";
		this->empsalary =0;
		this->empdept ="";
	}*/

	void Accept()
	{	
		//cout<<"Enter Employee details:"<<endl;
		cout<<"\nEnter the Employee id:"<<endl;
		cin>>this->empno;
		cout<<"Enter the Employee Name:"<<endl;
		cin>>this->empname;
		cout<<"Enter the Employee Salary:"<<endl;
		cin>>this->empsalary;
		cout<<"Enter the Employee Deaprtment:"<<endl;
		cin>>this->empdept;
	}

	void Display() const
	{
		cout<<"\n\nEmployee details are:"<<endl;
		cout<<"\nEmployee ID: "<<this->empno<<endl;
		cout<<"Employee Name: "<<this->empname<<endl;
		cout<<"Employee Salary: "<<this->empsalary<<endl;
		cout<<"Employee Department: "<<this->empdept<<endl;
	}
};

void SortEmpSalary(Employee* e,int n)
{
	int temp;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			if(e[i].empsalary<=e[j].empsalary)
			{
				temp = e[i].empsalary;
				e[i].empsalary = e[j].empsalary;
				e[j].empsalary = temp;		
			}	
		}
	}
	cout<<"\n\nEmployee salary sorted:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<e[i].empsalary<<" ";
	}
	cout<<endl;
}

void SortEmpName(Employee* e,int n)
{
	string temp;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=i;j++)
		{
		
			if(e[i].empname <= e[j].empname)
			{
				temp = e[i].empname;
				e[i].empname = e[j].empname;
				e[j].empname = temp;		
			}	
		}
	}
	cout<<"\n\nEmployee Name sorted:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<e[i].empname<<" ";
	}
	cout<<endl;
}

void SortEmpID(Employee* e,int n)
{
	
	int temp;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			if(e[i].empno<=e[j].empno)
			{
				temp = e[i].empno;
				e[i].empno = e[j].empno;
				e[j].empno = temp;		
			}	
		}
	}
	cout<<"\n\nEmployee ID sorted:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<e[i].empno<<" ";
	}
	cout<<endl;
}
	

int main()
{

	
	int n;
	cout<<"\nEnter no of employees Details to be entered:"<<endl;
	cin>>n;

	Employee e[n];
	while(true)
	{
		cout << "\n-------------------Menu------------------"<< endl;
		cout<<"\n1.Accept the Details of the Employee:"<<endl;
		cout<<"\n2.Display the Details of the Employee:"<<endl;	
		cout<<"\n3.Sort by Employee ID:"<<endl;
		cout<<"\n4.Sort by Employee Name:"<<endl;
		cout<<"\n5.sort by Employee Salary:"<<endl;
		cout<<"\n6.Exit:"<<endl;

		int choice;
		cout << "Enter choice :";
		cin >> choice;

		switch(choice)
		{
		case 1:
			{
				for(int i = 0;i < n;i++)
				{
					e[i].Accept();
				}
				break;
			}
		case 2:
			{
				for(int i = 0;i < n;i++)
				{
					e[i].Display();
				}
				break;
			}
		case 3:
			{
				cout<<"Sort by Employee ID"<<endl;
				SortEmpID(e,n);
				break;
			}
		case 4:
			{
				cout<<"Sort by Employee Name"<<endl;
				SortEmpName(e,n);
				break;
			}	

		case 5:
			{
				cout<<"Sort by Employee Salary"<<endl;
				SortEmpSalary(e,n);
				break;
			}

		case 6:
			{
				exit(0);
			}
		}
	}
	return 0;
}

/*OUTPUT OF PROGRAM
 Enter no of employees Details to be entered:
2

-------------------Menu------------------

1.Accept the Details of the Employee:

2.Display the Details of the Employee:

3.Sort by Employee ID:

4.Sort by Employee Name:

5.sort by Employee Salary:

6.Exit:
Enter choice :1

Enter the Employee id:
183
Enter the Employee Name:
shreya
Enter the Employee Salary:
50000
Enter the Employee Deaprtment:
It

Enter the Employee id:
175
Enter the Employee Name:
ankita
Enter the Employee Salary:
2000
Enter the Employee Deaprtment:
dac

-------------------Menu------------------

1.Accept the Details of the Employee:

2.Display the Details of the Employee:

3.Sort by Employee ID:

4.Sort by Employee Name:

5.sort by Employee Salary:

6.Exit:
Enter choice :2


Employee details are:

Employee ID: 183
Employee Name: shreya
Employee Salary: 50000
Employee Department: It


Employee details are:

Employee ID: 175
Employee Name: ankita
Employee Salary: 2000
Employee Department: dac

-------------------Menu------------------

1.Accept the Details of the Employee:

2.Display the Details of the Employee:

3.Sort by Employee ID:

4.Sort by Employee Name:

5.sort by Employee Salary:

6.Exit:
Enter choice :3
Sort by Employee ID


Employee ID sorted:
175 183 

-------------------Menu------------------

1.Accept the Details of the Employee:

2.Display the Details of the Employee:

3.Sort by Employee ID:

4.Sort by Employee Name:

5.sort by Employee Salary:

6.Exit:
Enter choice :4
Sort by Employee Name


Employee Name sorted:
ankita shreya 

-------------------Menu------------------

1.Accept the Details of the Employee:

2.Display the Details of the Employee:

3.Sort by Employee ID:

4.Sort by Employee Name:

5.sort by Employee Salary:

6.Exit:
Enter choice :5
Sort by Employee Salary


Employee salary sorted:
2000 50000 

-------------------Menu------------------

1.Accept the Details of the Employee:

2.Display the Details of the Employee:

3.Sort by Employee ID:

4.Sort by Employee Name:

5.sort by Employee Salary:

6.Exit:
Enter choice :6

 
 */
