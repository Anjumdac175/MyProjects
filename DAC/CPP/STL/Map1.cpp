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
	
	//Inserting elements into map using key value pairs
	cout<<"\nEnter key and value pair into map"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>key;
		cin>>value;
		mymap[key] = value;
	}
	cout<<"\n---------------------------"<<endl;
	
	//Traversal using iterators
	map<int,string>::iterator it;
	cout<<"Key-value pair in Map are: \n"<<endl;
	for(it = mymap.begin(); it != mymap.end(); it++)
	{
		cout<<it->first<<" --> "<<it->second<<endl;
	}
	cout<<endl;
	cout<<"\nElements in map are defaultly sorted keys along with their values"<<endl;
	cout<<"\n---------------------------"<<endl;
	
	
	//Deleting element in map using erase(iterator)
	auto it1 = mymap.find(183);
	if(it1 != mymap.end());
	mymap.erase(it1);
	cout<<"Key-value pair in Map after deleting are: \n"<<endl;
	for(auto &p : mymap)
	{
		cout<<p.first<<" --> "<<p.second<<endl;
	}
	cout<<"\n---------------------------"<<endl;
	
	
	//Modifying key value in map
	int k;
	string n1;
	cout<<"Enter the key you want to update\n"<<endl;
	cin>>k;
	cout<<"Enter the value you want to update\n"<<endl;
	cin>>n1;
	mymap[k] = n1;
	cout<<"Key-value pair in Map after modifying are: \n"<<endl;
	for(auto &p : mymap)
	{
		cout<<p.first<<" --> "<<p.second<<endl;
	}
	cout<<"\n---------------------------"<<endl;

}
