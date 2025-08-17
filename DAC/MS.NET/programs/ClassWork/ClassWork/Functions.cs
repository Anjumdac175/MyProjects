using System;
namespace ClassWork {

    // In Fucntions we to pass by references we use 'ref' Keyword in main() and in function too

    // in case of ref we need a initial value is to be given
    // in case of 'out' if we have given initial values at main they will discard that values and init method initial values will be assigned
    // with the help of 'out' key work we can pass uninitialized values to the function and must be initialized in that given function
    class Functions
    {
        static void Swap(ref int i, ref int j) {
            int temp = i;
            i = j;
            j = temp;
        }

        static void Init(out int i, out int j) {
            i = 100;
            j = 200;
        }
        static void Main1()
        {
            int a, b;
            Init(out a, out b);
            Swap(ref a, ref b);
            //Console.WriteLine("After Swapping a:" + a);
            //Console.WriteLine("After Swapping b:" + b);
            //Print(in a);
            //print(b);

        }

        private static void Print(in int a)
        {
            throw new NotImplementedException();
        }
    }
 

}