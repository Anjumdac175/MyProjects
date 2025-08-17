using System;
using System.IO;

namespace FileSystemexample
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            //Directory, FileInFo
            DirectoryInfo dir = new DirectoryInfo("C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\FileSystem");
            if (!dir.Exists) {
                dir.Create();
            }
            FileInfo file = new FileInfo(Path.Combine(dir.FullName, "info.txt"));

            using (StreamWriter sw = file.CreateText()) {
                sw.WriteLine("FileInfo + DirectoryInfo Demo");
            }
            Console.WriteLine($"FileCreated: {file.FullName}");
            Console.WriteLine($"FileCreated Time: {file.CreationTime}");

           // file.Delete();
            //dir.Delete();
        }
    }
}
