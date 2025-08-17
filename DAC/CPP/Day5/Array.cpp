#include<iostream>
#include<string>
using namespace std;

void DisplayStudent(int *const studentarr,int n)
{
	cout<<"Student Details are:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<studentarr[i]<<endl;
	}
}

void DisplayStdname(string *const studentname, int n)
{
	cout<<"Student Names are:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<studentname[i]<<endl;
	}
}

int main()
{
	int n;
	cout<<"Enter the no of students:"<<endl;
	cin>>n;
	int studentarr[n];
	cout<<"Enter Student Roll no"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>studentarr[i];
	}

	string studentname[n];
	cout<<"Enter the Student names:"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>studentname[i];
	}

	DisplayStudent(studentarr,n);
	DisplayStdname(studentname,n);
	return 0;
}
/* Output of Program
 Enter the no of students:
5
Enter Student Roll no
122
175
183
184
188
Enter the Student names:
nupur
anjum
ankita 
sivam
shreya
Student Details are:
122
175
183
184
188
Student Names are:
nupur
anjum
ankita
sivam
shreya

 
 */
