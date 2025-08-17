// Creating Mobile Phone.cpp to implement
#include"MobilePhone.h"
#include<iostream>
#include<fstream>
#include<cstring>
using namespace std;

MobilePhone::MobilePhone():serialNo(0),modelNo(""),brandName(""),price(0)
{}

MobilePhone::MobilePhone(int serialNo,char model,char brand,int price)
{
	this->serialNo = serialNo;
	strcpy(modelNo,modelNo);
	strcpy(brandName,brandName);
	this->price = price;
}
void MobilePhone::Accept()
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

void MobilePhone::Display()
{
	cout<<"Mobile Phone Features are: \n"<<endl;
	cout<<"Serial No: "<<serialNo<<endl;
	cout<<"Model No: "<<modelNo<<endl;
	cout<<"Brand Name: "<<brandName<<endl;
	cout<<"Price : "<<price<<endl;
	cout<<"_______________________"<<endl;	
}
void MobilePhone::sortByPrice(MobilePhone arr[],int n)
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

