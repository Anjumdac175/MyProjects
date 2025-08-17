// Implementing Stack using Iterators for travesal

#include<iostream>
#include<stack>
using namespace std;

int main()
{
	stack<int> st;
	int n,element;
	cout<<"Enter the no of elements into the Stack"<<endl;
	cin>>n;

	cout<<"\nEnter elements into Stack"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>element;
		st.push(element);
	}
	cout<<"\n---------------------------"<<endl;

	cout<<"Elements in the stack are: \n"<<endl;
	while(!st.empty())
	{
		cout<<st.top()<<" ";
		st.pop();
	}
	cout<<endl;
	cout<<"\n---------------------------"<<endl;

}
