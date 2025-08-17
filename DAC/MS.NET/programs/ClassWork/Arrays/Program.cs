using System;
using System.Runtime.ExceptionServices;

namespace Arrays 
{
    internal class Program
    {
        static void Main1() 
        {
            int[] arr = new int[5];

            for (int i = 0; i < arr.Length; i++) {
                //Console.WriteLine("Enter the values of Array here: ");
                //Console.WriteLine("Enter the value for arr[{0}]",i);// placeholders
                Console.WriteLine($"Enter the value for arr[{i}] :");// String intercollation
                
                //// one way of readline
                //arr[i] = int.Parse(Console.ReadLine()!);

                // another way of readline
                arr[i] =Convert.ToInt32(Console.ReadLine()!);

            }

            foreach (int i in arr) {
                Console.WriteLine($"the value at arr[{i}] are: " + i);
            }
        }
        static void Main2()
        {

            // 2 - dimensional array
            //int[,] arr = new int[44,5];
            //Console.WriteLine(arr.Rank);
            //Console.WriteLine(arr.Length);
            //Console.WriteLine(arr.GetLength(0)); // first dimension of the array
            //Console.WriteLine(arr.GetLength(1)); // first dimension of the array
            //Console.WriteLine(arr.GetUpperBound(0)); //length of the first dimension of the array means the length-1 sizeof 
            //Console.WriteLine(arr.GetLowerBound(0)); // length/ first index of the first dimension in array

            int[,] arr = new int[2, 3];
            for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    Console.WriteLine($"Array of elements in 2-dimension array is arr[{i}{j}] :");
                  arr[i,j] = Convert.ToInt32(Console.ReadLine());
                }

            }

            Console.WriteLine("***********************************************************");
            for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {

                    Console.WriteLine($"Array of elements in 2-dimension array is arr[{i}{j}] :" + arr[i, j]);
                }

            }
        }
        static void Main()
        {
            // jagged Array means so same square matrix with multiple rows and each row consists of multiple columns
            int[][] arr = new int[4][];
            arr[0] = new int[3];
            arr[1] = new int[4];
            arr[2] = new int[2];
            arr[3] = new int[3];
            for (int i = 0; i < arr.Length; i++) {
                for (int j = 0; j < arr[i].Length; i++) {
                    Console.WriteLine($"Enter the elements into arr[{i}{j}]: ");
                    arr[i][j] = Convert.ToInt32(Console.ReadLine());
                }
            }

            Console.WriteLine("******************************************");

            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr[i].Length; i++)
                {
                    Console.WriteLine($"Enter the elements into arr[{i}{j}]: " + arr[i][j]);
                }

            }

        }
    }
    
}