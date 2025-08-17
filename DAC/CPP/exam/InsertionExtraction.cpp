// implementing insertion and extraction operator overloading using friend function

#include<iostream>
#include<string>
using namespace std;

class Student
{
	private:
		string name;
		int age;
	public:
		Student():name(""),age(0) {}
	
	//overloading extraction(>>) operator for input
	friend istream& operator>>(istream& in, Student& s)
	{
		cout<<"Enter the Name of the Student:"<<endl;
		in >> s.name;
		cout<<"Enter the age of Student: "<<endl;
		in >> s.age;
		
		return in;
	}


	//overlaoding insertion(<<) operator for output
	friend ostream& operator<<(ostream& out, Student& s)
	{
		out<<"Student Name is: "<<s.name<<endl;
		out<<"Student Age is: "<<s.age<<endl;

		return out;
	}
};
int main()
{
	Student s;
	cin >> s;
	cout << s;

	return 0;
}
