using System;
namespace Delegates 
{
    //public delegate void Del1();
    class Program 
    {
        //static void Main1() 
        
        //{
        //    Del1 obj = new Del1(display);
        //    obj();
        //}

        static void Main() {

            //Func<int, int> o1 = MakeDouble;
            //o1(10);

            //Func<int, int> any = delegate (int a)
            //{
            //    return a * 2;
            //};
            Console.WriteLine("Makedouble function");
            Func<int, int> lam = (a) => a * 2;
            Console.WriteLine(lam(5));
            Console.WriteLine("make double 1 function");
            Func<int, int> lam1 = a => a * 2;
            Console.WriteLine(lam1(5));
            Console.WriteLine("Add function");
            Func<int, int ,int> add = (a, b) => a + b;
            Console.WriteLine(add(10,20));
            Console.WriteLine("Even check");
            Predicate<int> even = (a) => a % 2 == 0;
            Console.WriteLine(even(10));


        }
        //static void display() {
        //    Console.WriteLine("Display called");
        //}
        static int MakeDouble(int a)
        {
            return a * 2;
        }
        static int Add(int a, int b) { 
            return a + b;
        }

        static bool IsEven(int a) {
            if (a % 2 == 0) { 
                return true;
            }
            return false;
        }

    }
}
