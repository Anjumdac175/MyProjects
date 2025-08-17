#include<iostream>
#include<fstream>
#include"MobilePhone.h"
using namespace std;

#define MAX_SIZE 100
int main()
{
	MobilePhone Marr[MAX_SIZE];
	int size=0;

	while(true)
	{
		cout<<"_____________________Menu_________________________"<<endl;
		cout<<"1. Write Mobile Phone Data into File"<<endl;
		cout<<"2. Read Mobile Phone Data into File"<<endl;
		cout<<"3. Read Mobile Phone Data and Sort them by Price"<<endl;
		cout<<"4. Exit"<<endl;
		cout<<"_______________________________________________"<<endl;

		int choice;
		cout<<"Enter your Choice"<<endl;
		cin>>choice;

		switch(choice)
		{
			case 1:
				{
					MobilePhone mp;
					mp.Accept();
					ofstream fout("phone.txt",ios::binary|ios::app);
					if(!fout)
					{
						cout<<"File not Found"<<endl;
						return 1;
					}
					fout.write((char*)&mp,sizeof(MobilePhone));
					fout.close();
					cout<<"data stored......"<<endl;

					break;
				}
			case 2:
				{
					ifstream fin("phone.txt",ios::binary);
					if(!fin)
					{
						cout<<"File not Found"<<endl;
						return 1;
					}
					size = 0;
					while(size<MAX_SIZE && fin.read((char*)&Marr[size],sizeof(MobilePhone)))
					{
						size++;
					}
					fin.close();

					for(int i=0;i<size;i++)
					{
						Marr[i].Display();
					}

					break;
				}
			case 3:
				{
					MobilePhone::sortByPrice(Marr,size);
					break;
				}
			case 4:
				{
					exit(0);
				}
		}
	}
}


//output
/*_____________________Menu_________________________
1. Write Mobile Phone Data into File
2. Read Mobile Phone Data into File
3. Read Mobile Phone Data and Sort them by Price
4. Exit
_______________________________________________
Enter your Choice
2
Mobile Phone Features are:

Serial No: 123
Model No: real2
Brand Name: realme
Price : 78654
_______________________
Mobile Phone Features are:

Serial No: 456
Model No: iphone2
Brand Name: Apple
Price : 6500
_______________________
Mobile Phone Features are:

Serial No: 256
Model No: oppo1
Brand Name: oppo
Price : 26457
_______________________
Mobile Phone Features are:

Serial No: 254
Model No: redmi2
Brand Name: redmi
Price : 35248
_______________________
_____________________Menu_________________________
1. Write Mobile Phone Data into File
2. Read Mobile Phone Data into File
3. Read Mobile Phone Data and Sort them by Price
4. Exit
_______________________________________________
Enter your Choice
1
Enter the Details of the Mobile Phone

Enter the Serial No :
523
Enter the Model No :
LAVA Z60
Enter the brand Name :
LAVA
Enter the Price :
12000
______________________________
data stored......
_____________________Menu_________________________
1. Write Mobile Phone Data into File
2. Read Mobile Phone Data into File
3. Read Mobile Phone Data and Sort them by Price
4. Exit
_______________________________________________
Enter your Choice
2
Mobile Phone Features are:

Serial No: 123
Model No: real2
Brand Name: realme
Price : 78654
_______________________
Mobile Phone Features are:

Serial No: 456
Model No: iphone2
Brand Name: Apple
Price : 6500
_______________________
Mobile Phone Features are:

Serial No: 256
Model No: oppo1
Brand Name: oppo
Price : 26457
_______________________
Mobile Phone Features are:

Serial No: 254
Model No: redmi2
Brand Name: redmi
Price : 35248
_______________________
Mobile Phone Features are:

Serial No: 523
Model No: LAVA Z60
Brand Name: LAVA
Price : 12000
_______________________
_____________________Menu_________________________
1. Write Mobile Phone Data into File
2. Read Mobile Phone Data into File
3. Read Mobile Phone Data and Sort them by Price
4. Exit
_______________________________________________
Enter your Choice
3
Sorted array is:
Mobile Phone Features are:

Serial No: 123
Model No: real2
Brand Name: realme
Price : 6500
_______________________
Mobile Phone Features are:

Serial No: 456
Model No: iphone2
Brand Name: Apple
Price : 12000
_______________________
Mobile Phone Features are:

Serial No: 256
Model No: oppo1
Brand Name: oppo
Price : 26457
_______________________
Mobile Phone Features are:

Serial No: 254
Model No: redmi2
Brand Name: redmi
Price : 35248
_______________________
Mobile Phone Features are:

Serial No: 523
Model No: LAVA Z60
Brand Name: LAVA
Price : 78654
_______________________
_____________________Menu_________________________
1. Write Mobile Phone Data into File
2. Read Mobile Phone Data into File
3. Read Mobile Phone Data and Sort them by Price
4. Exit
_______________________________________________
Enter your Choice
4*/
