//Calcuate the Areas of a Circle,Rectangle and Sqaure using Functions
                                                                                                                        #include<iostream>
using namespace std;

float AreaofCircle(float radius)
{
	return 3.14*radius*radius;
}

float AreaofSquare(float side)
{
	return side*side;
}

float AreaofRectangle(float len, float bth)
{
        return len*bth;
}


int main()
{
        float length,breadth,radius,side;
        cout<<"Enter the Length of the Rectangle:"<<endl;
        cin>>length;
        cout<<"Enter the breadth of the Rectangle:"<<endl;
	cin>>breadth;
        cout<<"Enter the side of the Square:"<<endl;
        cin>>side;
        cout<<"Enter the Radius of the Circle:"<<endl;
        cin>>radius;

        cout<<"Area of the Circle:"<<AreaofCircle(radius)<<endl;
        cout<<"Area of the Square:"<<AreaofSquare(side)<<endl;
        cout<<"Area of the Rectangle:"<<AreaofRectangle(length,breadth)<<endl;
        return 0;
}  



// OUTPUT OF THE PROGRAM
/*
Enter the Length of the Rectangle:
52.65
Enter the breadth of the Rectangle:
42.13
Enter the side of the Square:
16.89
Enter the Radius of the Circle:
35.24
Area of the Circle:3899.43
Area of the Square:285.272
Area of the Rectangle:2218.14 
 */


