// Implementation of vector template with Employee class

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>

using namespace std;

class Employee
{
	private:
		int empid;
		string name;
		string address;
		double salary;
	public:
		Employee():empid(0),name(""),address(""),salary(0.f)
		{}

		Employee(int emp, string ename, string eaddress, double esalary):empid(emp),name(ename),address(eaddress),salary(esalary)
		{}
		
		// Getter methods
    		int getEmpId() const { return empid; }
    		string getName() const { return name; }
    		string getAddress() const { return address; }
    		double getSalary() const { return salary; }

    		// Setter methods
    		void setName(const string& newName) { name = newName; }
    		void setAddress(const string& newAddress) { address = newAddress; }
    		void setSalary(double newSalary) { salary = newSalary; }
		void Display() const
		{
			cout<<"---------------------------"<<endl;
			cout<<"\nEmployee Details are:"<<endl;
			cout<<"\n Employee ID: "<<name<<endl;
			cout<<"\n Employee Name: "<<name<<endl;
			cout<<"\n Employee Address: "<<address<<endl;
			cout<<"\n Employee Salary: "<<salary<<endl;
			cout<<"\n---------------------------"<<endl;
		}
};

vector<Employee> vemp;

void EmpAdd()
{
	int id;
	string name;
	string address;
	double salary;

	cout<<"\nEnter the Employee Details"<<endl;
	cout<<"\nEnter the Employee ID"<<endl;
	cin>>id;
	cin.ignore();
	cout<<"\nEnter the Employee Name"<<endl;
	getline(cin,name);
	cout<<"\nEnter the Employee Address"<<endl;
	getline(cin,address);
	cout<<"\nEnter the Employee Salary"<<endl;
	cin>>salary;
	cout<<"\n---------------------------"<<endl;

	vemp.push_back(Employee(id,name,address,salary));
	cout<<"Employee Added Successfully!!"<<endl;
}

void DisplayAll()
{
	if(vemp.empty())
	{
		cout<<"Employee not found"<<endl;
		return;
	}

	for(auto it = vemp.begin(); it != vemp.end(); it++)
	{
		it->Display();
	}
}

void EmpSearch()
{
	int eid;
	cout<<"Enter the Employee Id to be searched"<<endl;
	cin>>eid;

	auto it = find_if(vemp.begin(), vemp.end(), [eid](const Employee &e) {return e.getEmpId() == eid; });
	if(it != vemp.end())
	{
		it->Display();
	}
	else
	{
		cout<<"Employee not Found"<<endl;
	}
}

void EmpDelete()
{
	int eid;
	cout<<"Enter the Employee Id to be searched"<<endl;
	cin>>eid;

	auto it = find_if(vemp.begin(),vemp.end(),[eid](const Employee &e) {return e.getEmpId() == eid;});
	if(it != vemp.end())
	{
		it->Display();
		cout<<"Employee deleted Successfully"<<endl;
	}
	else
	{
		cout<<"Employee not Found to delete"<<endl;
	}

}
void EmpModify()
{
	int eid;
	cout<<"Enter the Employee Id to be searched"<<endl;
	cin>>eid;
	
	string newName,newAddress;
	double newSalary;

	auto it = find_if(vemp.begin(),vemp.end(), [eid](const Employee &e) {return e.getEmpId() == eid;});
	if(it !=vemp.end())
	{
		cin.ignore();
		cout<<"Enter the Name of the Employee's to be modified"<<endl;
		getline(cin,newName);
		it->setName(newName);
		cout<<"Enter the Address of the Employee's to be modified"<<endl;
		getline(cin,newAddress);
		it->setAddress(newAddress);
		cout<<"Enter the Salary of the Employee's to be modified"<<endl;
		cin>>newSalary;
		it->setSalary(newSalary);

		cout<<"Details modified Successfully"<<endl;
	}
	else
	{
		cout<<"Employee not Found to Modify"<<endl;
	}

}

