using System;
using System.IO;
using System.Text.Json;

namespace SerializationExample { 


    public class Student { 
        public int RollNo { get; set; }
        public string Name { get; set; }
        public string City { get; set; }
    }
    internal class JsonExample
    {
        static void Main() {

            string file = "jsonSample.json";
            Student student = new Student {RollNo = 175, Name="Anjum", City="AP" };

            // Serializing an object or write into file
            string jsonString = JsonSerializer.Serialize(student);
            File.WriteAllText(file, jsonString);
            Console.WriteLine($"FileWritten Successfully" + jsonString);

            //Deserializing or reading object form file
            string jsonRead = File.ReadAllText(file);
             Student newstudent = JsonSerializer.Deserialize<Student>(jsonRead);
            Console.WriteLine($"Student: {newstudent.RollNo},{newstudent.Name},{newstudent.City}");
        }
    }
}
