// Implementing Vector, Stack, List, Set and Map and using Iterators for travesal

#include<iostream>
#include<vector>
using namespace std;

int main()
{
	vector<int> vtr;
	int n,element;
	cout<<"Enter the no of elements into the vector"<<endl;
	cin>>n;
	
	
	// Inserting elements into vector using Push_back()
	cout<<"\nEnter elements into vector"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>element;
		vtr.push_back(element);
	}
	cout<<"\n---------------------------"<<endl;
	
	
	
	// Traversing Vector with Iterator
	vector<int>::iterator it;
	cout<<"Elements in the vector are: \n"<<endl;
	for(it = vtr.begin(); it != vtr.end(); it++)
	{
		cout<<*it<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;

}
