// Implementing Map and using Iterators for travesal

#include<iostream>
#include<string>
#include<map>
using namespace std;

int main()
{
	map<int,string> mymap;
	int n,key;
	string value;
	cout<<"Enter the no of elements into the map"<<endl;
	cin>>n;

	cout<<"\nEnter key and value pair into map"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>key;
		cin>>value;
		mymap[key] = value;
	}
	cout<<"\n---------------------------"<<endl;

	map<int,string>::iterator it;
	cout<<"Key-value pair in Map are: \n"<<endl;
	for(it = mymap.begin(); it != mymap.end(); it++)
	{
		cout<<"["<<it->first<<"]"<<" = "<<it->second<<endl;
	}
	cout<<endl;
	cout<<"\nElements in map are defaultly sorted keys along with their values"<<endl;
	cout<<"\n---------------------------"<<endl;

}
