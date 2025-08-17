using System.Text.Json;

namespace Employee
{
    internal class Program
    {
        public class EmployeeList
        {
            public int EmpNo { get; set; }
            public string EmpName { get; set; }
            public double Salary { get; set; }
        }
        static void Main()
        {
            string file = "listemp.json";
            List<EmployeeList> emplist = new List<EmployeeList>() { 
                new EmployeeList{ EmpNo = 151, EmpName = "Pranjal", Salary = 100000},
                new EmployeeList{ EmpNo = 175, EmpName = "Anjum", Salary = 75000 },
                new EmployeeList{ EmpNo = 187, EmpName = "Shreya", Salary = 90000 }
            };

            string jsonString = JsonSerializer.Serialize(emplist);
            File.WriteAllText(file,jsonString);
            Console.WriteLine("List Written into File");

            string jsonRead = File.ReadAllText(file);
            List<EmployeeList> reademployees = JsonSerializer.Deserialize<List<EmployeeList>>(jsonRead);
            foreach (var emp in reademployees)
            {
                Console.WriteLine($"EmployeeList[{emp.EmpNo}, {emp.EmpName}, {emp.Salary}]");
            }
            
        }
    }
}
