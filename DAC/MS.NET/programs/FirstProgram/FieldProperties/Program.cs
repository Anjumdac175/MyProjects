using System;

class Product
{
    public double fprice;

    public double Price
    {
        get { return fprice; }
        set
        {
            if (value >= 0)
            {
                fprice = value;
            }
            else
            {
                Console.WriteLine("Invalid Price");
            }
        }
    }

    public string Name { get; set; } 
}

    internal class FieldProperties
    {
        static void Main()
        {
            Product p = new Product();

            Console.WriteLine("Enter the Product Name: ");
            p.Name = Console.ReadLine()!;

            Console.WriteLine("Enter the Price of Product: ");
            double price = Convert.ToDouble(Console.ReadLine());
            p.Price = price;

            Console.WriteLine("Output:");
            Console.WriteLine("Name: " + p.Name);
            Console.WriteLine("Price: " + p.Price);
        }
}
