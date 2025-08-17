// Implementing Vector, Stack, List, Set and Map and using Iterators for travesal

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main()
{
	vector<int> vtr, vtr1;
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
	
	
	// Search in Vector
	auto it1 = find(vtr.begin(), vtr.end(), 45);
	if(it1 !=vtr.end())
	{
		cout<<"Element found in index at: "<<it1 - vtr.begin()<<endl;
	}
	else
	{
	
		cout<<"Element not found"<<endl; 
	}
	cout<<"\n---------------------------"<<endl;

	//sorting of vector
	sort(vtr.begin(),vtr.end());
	cout<<"Elements in the vector after sorting are:"<<endl;
	for(int num : vtr)
	{
		cout<<num<<" ";
	}
	cout<<endl;
	cout<<"-------------------------------------"<<endl;

	// deleting elements from back
	vtr.pop_back();
	cout<<"Elements in Vector after popping of last elements are: "<<endl;
	for(it = vtr.begin(); it != vtr.end(); it++)
	{
		cout<<*it<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	//Deleting elements using erase
	vtr.erase(vtr.begin() + 3);

	cout<<"Elements in Vector after deleting element using erase are: "<<endl;
	for(it = vtr.begin(); it != vtr.end(); it++)
	{
		cout<<*it<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	

	
	
	// Inserting elements into vector using Insert()
	vtr1 = {10,20,30};
	vtr1.insert(vtr1.begin() + 2, 40);
	vtr1.insert(vtr1.begin() +4, 50);
	vtr1.insert(vtr1.begin() +5, 60);
	vtr1.insert(vtr1.begin() +1, 70);
	vtr1.insert(vtr1.begin() +6, 80);
	vtr1.insert(vtr1.begin() +4, 90);
	cout<<"\n---------------------------"<<endl;
	// Modify the existing data with operator[], at()
	vtr1[1] = 100;
	vtr1.at(4) = 200;

	// Traversing Vector with for each
	
	cout<<"Elements in the vector are: \n"<<endl;
	for(int v : vtr1)
	{
		cout<<v<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	// popping up elements	
	vtr1.pop_back();
	cout<<"Elements after popping elements from back are: "<<endl;
	for(int num : vtr1)
	{
		cout<<num<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	//Deleting elements using erase function
	vtr1.erase(vtr1.begin() + 2);
	vtr1.erase(vtr1.begin() + 1);
	vtr1.erase(vtr1.begin() + 3);
	cout<<"Elements after popping elements from back are: "<<endl;
	for(int num : vtr1)
	{
		cout<<num<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	// printing values of vectors using front and back
	cout<<"printing values of vectors using front and back and at operator: "<<endl;
	cout<<"Element at first is : "<<vtr1.front()<<endl;
	cout<<"Element at first is : "<<vtr1.back()<<endl;
	cout<<"Element at first is : "<<vtr1.at(3)<<endl;
	cout<<"\n---------------------------"<<endl;


}
