using System;

delegate int DelAdd(int a, int b);
namespace DelegatesExamples
{
    internal class ReturnValueDelegates
    {
        static void Main1() {

            // for return type and paramaters in single Anonymous delegate
            DelAdd del = delegate (int a, int b)
            {
                return a + b;
            };

            Console.WriteLine($"Sum of Numbers is: {del(2,3)}");
        }
        static void Main() { 
            // Generic delegates
            // 1. Func<T1,T2,...,T16,TResult> Methods with Return Values can be implemented

            Func<int, int, int> add = (a,b) => a + b;
            Console.WriteLine("Addition of Numbers is: " + add(2,3));

            // 2. Action<T1,T2...,T16>  Methods with return void

            Action<string, int> Display = (name, age) =>
            {
                Console.WriteLine($"Name: {name}, Age: {age}");
            };

            Display("Nishad", 26);

            // 3. Predicate<T> Method that takes only one input and returns bool
            Predicate<int> IsEven = num => num % 2 == 0;
            Console.WriteLine(IsEven(10));
            Console.WriteLine(IsEven(7));
        }

    }
}
