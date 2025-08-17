// Implementing Set using Iterators for travesal

#include<iostream>
#include<set>
using namespace std;

int main()
{
	set<int> s,s1;
	int n,element;
	cout<<"Enter the no of elements into the SET"<<endl;
	cin>>n;
	
	//insertion of elements into SET
	cout<<"\nEnter elements into SET"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>element;
		s.insert(element);
	}
	cout<<"\n---------------------------"<<endl;
	
	//Traversal using iterators
	set<int>::iterator it;
	cout<<"Elements in the SET are: \n"<<endl;
	for(it = s.begin(); it != s.end(); it++)
	{
		cout<<*it<<" ";
	}
	cout<<endl;
	cout<<"\nElements in SET are default sorted list!!!"<<endl;
	cout<<"\n---------------------------"<<endl;
	
	
	//Deleting in SET using erase(begin)
	s.erase(s.begin());
	cout<<"Elements in the SET after Deleting are: \n"<<endl;
	for(int i : s)
	{
		cout<<i<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	
	//SET using assigning values
	s1 = {10,50,60};
	cout<<"Elements in the SET are: \n"<<endl;
	for(int i : s1)
	{
		cout<<i<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	//Inserting elements into set
	s1.insert(70);
	s1.insert(20);
	s1.insert(30);
	s1.insert(40);
	cout<<"Elements in the SET after insertion are: \n"<<endl;
	for(int i : s1)
	{
		cout<<i<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	//Deleting elements by value
	s1.erase(70);
	s1.erase(20);
	cout<<"Elements in the SET are: \n"<<endl;
	for(int i : s1)
	{
		cout<<i<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	//searching of elements in set
	if(s1.find(40) != s1.end())
	{
		cout<<"Element is found!!"<<endl;
	}
	else
	{
		cout<<"Element is found!!"<<endl;
	}	
	cout<<"\n---------------------------"<<endl;
	cout<<"Some important points in set are: \n"<<endl;
	cout<<"1>SET is internally a self-balanced red-black binary tree\n"<<endl;
	cout<<"2>So it will automatically in sorted format\n"<<endl;
	cout<<"3>SET doesn't support index-based access as it is not a sequential data structure \n"<<endl;
	cout<<"4>inserting or deleting a particular element through some index is not possible in SET \n"<<endl;
	cout<<"\n---------------------------"<<endl;

}
