using System;
using System.IO;
using System.Text;
namespace FileSystemexample
{
    internal class ByteStreamExample
    {
        static void Main2()
        {
            string file = "fileStream.txt";
            string message = "This is raw FileStream data.";
            using (FileStream fs = new FileStream(file, FileMode.Create))
            {
                byte[] bytes =Encoding.UTF8.GetBytes(message);
                fs.Write(bytes, 0, bytes.Length);
            }
            using (FileStream fs = new FileStream(file, FileMode.OpenOrCreate)) 
            {
                byte[] read = new byte[fs.Length];
                fs.Read(read, 0, read.Length);
                Console.WriteLine("Read from fileStream: " + Encoding.UTF8.GetString(read));
            }

        }
    }
}
