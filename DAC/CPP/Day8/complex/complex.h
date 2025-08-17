// Complex class header file

class Complex
{

	private:
		int real,img;// data members in private
	public:
		Complex(); // default constructor
		Complex(int real, int img); // parametrized constructor

		void Accept();
		void Display();
		Complex operator+(Complex temp);  // Addition Operator Overoloading
		Complex operator-(Complex temp); // Substraction Operator Overloading
		Complex operator*(Complex temp);  // Multiplication Operator Overloading
};
