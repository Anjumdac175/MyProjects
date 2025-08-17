// Creating a Header file for Mobile Phone class

class MobilePhone
{
	private:
		int serialNo;
		char modelNo[20];
		char brandName[20];
		int price;
	public:
		MobilePhone();
		MobilePhone(int serialNo,char modelNo,char brandName,int price);
		void Accept();
		void Display();
		static void sortByPrice(MobilePhone arr[],int n);

};
