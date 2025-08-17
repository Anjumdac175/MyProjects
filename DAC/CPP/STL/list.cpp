// Implementing List and using Iterators for travesal

#include<iostream>
#include<list>
using namespace std;

int main()
{
	list<int> ls;
	int n,element;
	cout<<"Enter the no of elements into the List"<<endl;
	cin>>n;

	cout<<"\nEnter elements into List"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>element;
		ls.push_back(element);
	}
	cout<<"\n---------------------------"<<endl;

	list<int>::iterator it;
	cout<<"Elements in the List are: \n"<<endl;
	for(it = ls.begin(); it != ls.end(); it++)
	{
		cout<<*it<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;

}
