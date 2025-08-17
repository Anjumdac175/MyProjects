#include<iostream>
using namespace std;

struct student{

	int rollno;
	char name[10];
};

void AcceptDetails(student* const s)
{
	
	cout<<"Enter the roll no of Student:"<<endl;
	cin>>s->rollno;
	cout<<"Enter the name of student:"<<endl;
	cin>>s->name;
}

void DisplayDetails(const student* const s)
{

	cout<<"Student roll no is:"<<s->rollno<<endl;
	cout<<"Student Name is:"<<s->name<<endl;
}
int main()
{ 
	int n;
	cout<<"Enter the no of Students"<<endl;
	cin>>n;

	student s;

	for(int i=0;i<n;i++)
	{
		AcceptDetails(&s);
		DisplayDetails(&s);
	}	

	return 0;

}
/*Output of Program
 Enter the no of Students
2
Enter the roll no of Student:
175
Enter the name of student:
anjum
Student roll no is:175
Student Name is:anjum
Enter the roll no of Student:
183
Enter the name of student:
ankita
Student roll no is:183
Student Name is:ankita

 */
