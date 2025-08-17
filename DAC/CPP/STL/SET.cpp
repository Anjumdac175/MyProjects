// Implementing Set using Iterators for travesal

#include<iostream>
#include<set>
using namespace std;

int main()
{
	set<int> s;
	int n,element;
	cout<<"Enter the no of elements into the SET"<<endl;
	cin>>n;

	cout<<"\nEnter elements into SET"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>element;
		s.insert(element);
	}
	cout<<"\n---------------------------"<<endl;

	set<int>::iterator it;
	cout<<"Elements in the SET are: \n"<<endl;
	for(it = s.begin(); it != s.end(); it++)
	{
		cout<<*it<<" ";
	}
	cout<<endl;
	cout<<"\nElements in SET are default sorted list!!!"<<endl;
	cout<<"\n---------------------------"<<endl;

}
