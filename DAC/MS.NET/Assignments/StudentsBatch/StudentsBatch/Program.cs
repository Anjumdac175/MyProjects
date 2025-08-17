using System;
namespace StudentBatch 
{
    class Program 
    {
        static void Main() 
        {
            Console.WriteLine("Enter the No of Batchs:");
            int batch = Convert.ToInt32(Console.ReadLine());

            int[][] cdac = new int[batch][];

            for (int i = 0; i < batch; i++) {
                
                Console.WriteLine($"Enter the no of student for Batch {i+1} :");
                int studentcount = Convert.ToInt32(Console.ReadLine());
                
                cdac[i] = new int[studentcount];

                for (int j = 0; j < studentcount; j++) { 
                    
                    Console.WriteLine($"Enter the marks of Student {j+1} in Batch {i+1}:");
                    cdac[i][j] = Convert.ToInt32(Console.ReadLine());
                }
            }

            Console.WriteLine("************************Stundents Marks in Batchs are:**********************");
            for (int i = 0; i < cdac.Length; i++) {
                Console.WriteLine($"Batch {i+1}: ");
                for (int j = 0; j < cdac[i].Length; j++) {
                    Console.WriteLine($"Marks {j+1}: {cdac[i][j]}");
                }
            }
        
        }
    }
    
}
