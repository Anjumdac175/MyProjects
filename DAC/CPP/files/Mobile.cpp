// Read and write Details of a Mobile Phone into a File

#include<iostream>
#include<fstream>
#include<cstring>
using namespace std;

class MobilePhone
{
	private:
		int serialNo;
		char modelNo[20];
		char brandName[20];
		int price;
	public:
		MobilePhone():serialNo(0),modelNo(""),brandName(""),price(0)
		{}

		MobilePhone(int serialNo,char model,char brand,int price)
		{
			this->serialNo = serialNo;
			strcpy(modelNo,modelNo);
			strcpy(brandName,brandName);
			this->price = price;
		}
		void Accept()
		{
			cout<<"Enter the Details of the Mobile Phone\n"<<endl;
			cout<<"Enter the Serial No : "<<endl;
			cin>>serialNo;
			cout<<"Enter the Model No : "<<endl;
			cin.ignore();
			cin.getline(modelNo,20);
			cout<<"Enter the brand Name : "<<endl;	
			//cin.ignore();
			cin.getline(brandName,20);
		
			cout<<"Enter the Price : "<<endl;
			cin>>price;
			cout<<"______________________________"<<endl;
		}

		void Display()
		{
			cout<<"Mobile Phone Features are: \n"<<endl;
			cout<<"Serial No: "<<serialNo<<endl;
			cout<<"Model No: "<<modelNo<<endl;
			cout<<"Brand Name: "<<brandName<<endl;
			cout<<"Price : "<<price<<endl;
			cout<<"_______________________"<<endl;	
		}
		static void sortByPrice(MobilePhone arr[],int n)
		{
			int temp;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<=i;j++)
				{
					if(arr[i].price<=arr[j].price)
					{
						temp = arr[i].price;
						arr[i].price = arr[j].price;
						arr[j].price = temp;
					}
				}
			}
			cout<<"Sorted array is: "<<endl;
			for(int i=0;i<n;i++)
			{
				arr[i].Display();
			}
		}

};


int main()
{

	string filename;
	cout<<"Enter the file name: "<<endl;
	cin>>filename;

	int num;
	cout<<"Enter the no of records to be done: "<<endl;
	cin>>num;
	MobilePhone mp[num];
	ofstream fout(filename,ios::out|ios::binary);
	for(int i=0;i<num;i++)
	{
		mp[i].Accept();
		fout.write((char*)&mp[i],sizeof(mp[i]));
	}
	fout.close();
	cout<<"Data stored......"<<endl;
	
	ifstream fin(filename,ios::in|ios::binary);
	for(int i=0;i<num;i++)
	{
		//mp[i]->Display();
		fin.read((char*)&mp[i],sizeof(mp[i]));
		mp[i].Display();
	}
	fin.close();
	
	MobilePhone::sortByPrice(mp,num);


	return 0;
}
