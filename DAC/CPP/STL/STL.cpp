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

	cout<<"\nEnter elements into vector"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>element;
		vtr.push_back(element);
	}
	cout<<"\n---------------------------"<<endl;

	vector<int>::iterator it;
	cout<<"\nElements in the vector are: "<<endl;
	for(it = vtr.begin(); it != vtr.end(), it++)
	{
		cout<<*it<<" ";
	}
	cout<<endl;

}
