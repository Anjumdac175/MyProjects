using System;
using System.IO;

namespace FileSystemexample
{
    internal class StreamWriterExample
    {
        static void Main3() {
            String file = "Sample.txt";
            WriteToFile(file);
            ReadFromFile(file);
        }
        public static void WriteToFile(String  file) {
            using (StreamWriter sw = new StreamWriter(file)) {
                sw.WriteLine("Write into Stream Writer: Line1");
                sw.WriteLine("write into Stream Writer: Line2");
            }
        }
        public static void ReadFromFile(String file) {
            using (StreamReader sr = new StreamReader(file)) {
                String line;
                while ((line = sr.ReadLine()) != null) {
                    Console.WriteLine(line);
                }
            
            }
        }
    }
}
