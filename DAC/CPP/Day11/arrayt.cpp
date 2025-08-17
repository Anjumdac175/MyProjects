#include<iostream>
using namespace std;

template<class T>
class Array
{
	private:
		int size;
		T *arr;

	public:
		Array():size(0)
		{

		}

		Array(int size):size(size)
		{
			this->size = size;
			this->arr = new T[this->size];
		}
	void Accept()
	{
		//cout<<"Enter the Array Elements:"<<endl;
		for(int i=0;i<size;i++)
		{
			cin>>arr[i];
		}
	}

	void Display()
	{
		//cout<<"Array is:"<<endl;
		for(int i=0;i<size;i++)
		{
			cout<<arr[i]<<" ";
		}
		cout<<endl;
	}
	~Array()
	{
		delete[]arr;
	}
};

int main()
{
	int n;
	cout<<"Enter the size of array"<<endl;
	cin>>n;
	Array<int> a(n);
	cout<<"Enter the Integer type values into the array\n"<<endl;
	a.Accept();
	cout<<"Integer type values in the array are:\n"<<endl;
	a.Display();

	Array<float> b(n);
	cout<<"Enter the Float type values into the array\n"<<endl;
	b.Accept();
	cout<<"Float type values in the array are:\n"<<endl;
	b.Display();

	Array<char> c(n);
	cout<<"Enter the Character type values into the array\n"<<endl;
	c.Accept();
	cout<<"Character type values are\n"<<endl;
	c.Display();
	return 0;
}


//output
/*Enter the size of array
5
Enter the Integer type values into the array

45
56
89
78
26
Integer type values in the array are:

45 56 89 78 26 
Enter the Float type values into the array

12.54
10.56
32.87
45.25
78.45
Float type values in the array are:

12.54 10.56 32.87 45.25 78.45 
Enter the Character type values into the array

A
N
J
U
M
Character type values are

A N J U M 
*/
