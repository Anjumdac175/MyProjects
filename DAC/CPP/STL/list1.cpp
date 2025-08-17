// Implementing List and using Iterators for travesal

#include<iostream>
#include<list>
#include<algorithm>
using namespace std;

int main()
{
	list<int> ls,ls1,ls2;
	int n,element;
	cout<<"Enter the no of elements into the List"<<endl;
	cin>>n;

	// inserting elements using push_back
	cout<<"\nEnter elements into List using push_back"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>element;
		ls.push_back(element);
	}
	cout<<"\n---------------------------"<<endl;

	
	// Traversing list using iterators
	list<int>::iterator it;
	cout<<"Elements in the List are: \n"<<endl;
	for(it = ls.begin(); it != ls.end(); it++)
	{
		cout<<*it<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	

	// Search in list
	auto it3 = find(ls.begin(), ls.end(), 35);
	if(it3 != ls.end())
	{
		cout<<"Element found"<<endl;
	}
	else
	{

		cout<<"Element not found"<<endl;
	}
	
	
	// sorting of list
	ls.sort();
	cout<<"\nAfter sorting elements in list are "<<endl;
	for(int num : ls)
	{
		cout<<num<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	// inserting elements using push_front
	int element1;
	cout<<"\nEnter elements into List using push_front"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>element1;
		ls1.push_front(element1);
	}
	cout<<"\n---------------------------"<<endl;

	// Traversing using for each
	cout<<"Elements in the List after adding front are: \n"<<endl;
	for(int num : ls1)
	{
		cout<<num<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
		
	
	// extracting first and last elements
	cout<<"First element in list:"<<ls1.front()<<endl;
	cout<<"First element in list:"<<ls1.back()<<endl;
	cout<<"\n---------------------------"<<endl;
	
	// printing elements in reverse order
	ls1.reverse();
	cout<<"Elements in the List after reversing list are: \n"<<endl;
	for(int num : ls1)
	{
		cout<<num<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	// merging of two list
	ls.merge(ls1);
	cout<<"Elements in the List after merging list are: \n"<<endl;
	for(int num : ls)
	{
		cout<<num<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;

	
	


	// initializing normal list
	ls2 = {10,30,50,70,100};

	// inserting element in location
	cout<<"inserting elements using insert: \n"<<endl;
	auto it1 = ls2.begin();
	advance(it1, 1);
	ls2.insert(it1, 20);

	advance(it1,3);
	ls2.insert(it1,40);
	
	advance(it1,5);
	ls2.insert(it1,60);
	
	advance(it1,4);
	ls2.insert(it1,80);
	
	advance(it1,6);
	ls2.insert(it1,90);

	//Traversing with for each
	cout<<"Elements in the List are: \n"<<endl;
	for(int num : ls2)
	{
		cout<<num<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	// Deleting elements in list
	//Deleting elements in list using pop_back
	ls2.pop_back();
	ls2.pop_back();

	cout<<"Elements in the List after Deleting from pop_back: \n"<<endl;
	for(int num : ls2)
	{
		cout<<num<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	
	//Deleting elements in list using pop_front
	ls2.pop_front();
	ls2.pop_front();
	cout<<"Elements in the List after Deleting from pop_front: \n"<<endl;
	for(int num : ls2)
	{
		cout<<num<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
	
	
	//Deleting elements in list using erase and remove
	auto it2 = ls2.begin();
	advance(it2,4);
	ls2.erase(it2);
	ls2.remove(50);
	cout<<"Elements in the List after deleting using erase and remove are: \n"<<endl;
	for(int num : ls2)
	{
		cout<<num<<" ";
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;
}
