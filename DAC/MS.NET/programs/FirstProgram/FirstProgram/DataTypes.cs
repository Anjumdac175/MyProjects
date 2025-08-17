using System;

namespace FirstProgram
{
    internal class DataTypes
    {
        static void Main1() 
        {
            // Integer Input
            Console.WriteLine("Enter the Integer Value: ");
            int intValue = Convert.ToInt32(Console.ReadLine());

            // Float Input
            Console.WriteLine("Enter the Float Value");
            float fvalue = Convert.ToSingle(Console.ReadLine());

            // Double Input
            Console.WriteLine("Enter the Double Value");
            double dvalue = Convert.ToDouble(Console.ReadLine());

            // Char Input
            Console.WriteLine("Enter the Character Value");
            char cvalue = Convert.ToChar(Console.ReadLine()!);

            // Boolean Input
            Console.WriteLine("Enter the Boolean Value");
            bool bvalue = Convert.ToBoolean(Console.ReadLine());

            // String Input
            Console.WriteLine("Enter the String Value");
            String name = Console.ReadLine()!;

            Console.WriteLine("You Entered Values are: ");
            Console.WriteLine("Integer Value : " + intValue);
            Console.WriteLine("Float Value: "+ fvalue);
            Console.WriteLine("Double Value: " + dvalue); 
            Console.WriteLine("Char Value: " + cvalue);
            Console.WriteLine("Boolean Value: " + bvalue);
            Console.WriteLine("String Value: " + name);

        }
    }
}
