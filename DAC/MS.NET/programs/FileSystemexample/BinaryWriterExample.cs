using System;
using System.IO;

namespace FileSystemexample
{
    internal class BinaryWriterExample
    {
        static void Main() {
            string file = "bstream.txt";
            WriteToFile(file);
            ReadFromFile(file);
        }
        public static void WriteToFile(string file) {
            using (BinaryWriter bw = new BinaryWriter(File.Open(file, FileMode.Create))) {
                bw.Write("John");
                bw.Write(25);
                bw.Write("Pune");
            }
        }
        public static void ReadFromFile(string file) {
            using (BinaryReader br = new BinaryReader(File.Open(file, FileMode.OpenOrCreate))) {
                string name = br.ReadString();
                int age = br.ReadInt32();
                string city = br.ReadString();

                Console.WriteLine($"BinaryReader object: {name}, {age}, {city}");
            }


            
        }
    }
}
