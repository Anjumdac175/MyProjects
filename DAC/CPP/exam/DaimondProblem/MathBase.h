// implement header file
#ifndef MATH___H_
#define MATH___H_
class MathBase
{
	public:
		virtual void CalArea();
};

class Math1 : virtual public MathBase
{
	public:
		void Add(int a, int b);
		void Sub(int a, int b);
		void CalArea();
};

class Math2 : virtual public MathBase
{
	public:
		void Mul(int a,int b);
		void Div(int a,int b);
		void CalArea();
};

class Calculator : public Math1, public Math2
{
	public:
		void CalArea();
		void CallCalArea();
};

#endif
