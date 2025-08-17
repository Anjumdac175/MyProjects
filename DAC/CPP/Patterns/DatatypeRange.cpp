// Printing Data types and its size and ranges

#include<iostream>
#include<limits>
using namespace std;

int main()
{

	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"DATA TYPE		|	SIZE	|		RANGE	    	    |"<<endl;
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"char			|	"<<sizeof(char)<<"	|	"<<int(numeric_limits<char>::min())<<" to "<<int(numeric_limits<char>::max())<<"	    	    |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"unsigned char		|	"<<sizeof(unsigned char)<<"	|	"<<int(numeric_limits<unsigned char>::min())<<" to "<<int(numeric_limits<unsigned char>::max())<<"	    	    |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"short			|	"<<sizeof(short)<<"	|	"<<int(numeric_limits<short>::min())<<" to "<<int(numeric_limits<short>::max())<<"	    	    |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"unsigned short		|	"<<sizeof(unsigned short)<<"	|	"<<int(numeric_limits<unsigned short>::min())<<" to "<<int(numeric_limits<unsigned short>::max())<<"		    |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"int			|	"<<sizeof(int)<<"	|	"<<int(numeric_limits<int>::min())<<" to "<<int(numeric_limits<int>::max())<<"   |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"unsigned int		|	"<<sizeof(unsigned int)<<"	|	"<<int(numeric_limits<unsigned int>::min())<<" to "<<int(numeric_limits<unsigned int>::max())<<"	    	    	    |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"long			|	"<<sizeof(long)<<"	|	"<<int(numeric_limits<long>::min())<<" to "<<int(numeric_limits<long>::max())<<"	    		    |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"unsigned long		|	"<<sizeof(unsigned long)<<"	|	"<<int(numeric_limits<unsigned long>::min())<<" to "<<int(numeric_limits<unsigned long>::max())<<"	    	    	    |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"long long		|	"<<sizeof(long long)<<"	|	"<<int(numeric_limits<long long>::min())<<" to "<<int(numeric_limits<long long>::max())<<"	    		    |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"unsigned long long	|	"<<sizeof(unsigned long long)<<"	|	"<<int(numeric_limits<unsigned long long>::min())<<" to "<<int(numeric_limits<unsigned long long>::max())<<"	    		    |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"float			|	"<<sizeof(float)<<"	|	"<<int(numeric_limits<float>::min())<<" to "<<int(numeric_limits<float>::max())<<"	    |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"double			|	"<<sizeof(double)<<"	|	"<<int(numeric_limits<double>::min())<<" to "<<int(numeric_limits<double>::max())<<"	    |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
	cout<<"long double		|	"<<sizeof(long double)<<"	|	"<<int(numeric_limits<long double>::min())<<" to "<<int(numeric_limits<long double>::max())<<"	    |"<<endl;	
	cout<<"_____________________________________________________________________________"<<endl;
}


