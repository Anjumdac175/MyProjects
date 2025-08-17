using System;

namespace ThreadingExample
{
    class Program
    {

        static void Main()
        {
            Task<int> t1 = Task.Factory.StartNew<int>(Func1);
            t1.Start();

        }
        static int Func1()
        {
            int i;
            for (i = 0; i < 10; i++)
            {
                Console.WriteLine(i);
            }
            return i;
        }
        static int Func2(String s)
        {
            int i;
            for (i = 0; i < 10; i++)
            {
                Console.WriteLine(i);
            }
            return i;
        }
    }
}
        
