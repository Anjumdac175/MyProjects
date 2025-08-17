using System;
using System.IO;
using System.Text.Json;

namespace Employee
{
    public class SingleEmployee { 
        public int EmpNo { get; set; }
        public string EmpName { get; set; }
        public double Salary { get; set; }
     }
    internal class Employee
    {
        static void Main1 () {
            string file = "employeesample.json";
            SingleEmployee emp = new SingleEmployee
            {
                EmpNo = 175,
                EmpName = "Anjum",
                Salary = 75000
            };

            string jsonString = JsonSerializer.Serialize(emp);
            File.WriteAllText(file, jsonString);
            Console.WriteLine("File written Successfully");

            string jsonRead = File.ReadAllText(file);
            SingleEmployee read = JsonSerializer.Deserialize<SingleEmployee>(jsonRead);
            Console.WriteLine($"Employee[{read.EmpNo}, {read.EmpName}, {read.Salary}]");
        }
    }
}
