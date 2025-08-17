using System;
namespace ExceptionHandling 
{
    class Class1 {
       public int p1 { get; set; }
    }

    class InvalidException : ApplicationException 
    {
        public InvalidException(String message) : base(message) { }
    }
    internal class Program 
    {
        static void Main() 
        {
            Class1 obj = new Class1();
            try
            {
                //obj = null;
                int x = Convert.ToInt32(Console.ReadLine());
                obj.p1 = 100 / x;
                Console.WriteLine(x);
                Console.WriteLine("No exception");
            }
            catch {
                Console.WriteLine("Exceptions occurs");
            }
        }
        
    }


}
