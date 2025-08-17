using System;

namespace AsynExample {

    internal class Program
    {
        static void Main()
        {
            Thread t1 = new Thread(new ThreadStart(Funct1));
            Thread t2 = new Thread(new ThreadStart(Funct2));
            t1.Priority = ThreadPriority.BelowNormal;
            t2.Priority = ThreadPriority.Highest;
            t1.IsBackground = true; 
            t2.IsBackground = true;
            
            t1.Start();
            t2.Start();

            
            for (int i = 0; i < 20; i++)
            {
                Console.WriteLine("Main " + i);
            }
            t1.Join(); //waiting vall = waits for t1 to complete
            Console.WriteLine("This line should run after func1 is over");

        }

        static void Funct1()
        {
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("managed threadid " + Thread.CurrentThread.ManagedThreadId);
                Console.WriteLine("First " + i);
            }
        }
        static void Funct2()
        {
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("managed threadid " + Thread.CurrentThread.ManagedThreadId);
                Console.WriteLine("Second " + i);
            }
        }

    }
}