using System;
namespace StudentManagement
{
    internal class Program
    {
        static void Main()
        {
            List<Student> students = new List<Student>();
            string? filepath = "student.txt";

            try
            {
                Console.WriteLine("Enter no. of Students");
                int n = Convert.ToInt32(Console.ReadLine());

                for (int i = 0; i < n; i++) { 
                    Student student = new Student();
                    
                    Console.WriteLine("Enter the Roll of Student");
                    student.RollNo = Convert.ToInt32(Console.ReadLine());
                    
                    Console.WriteLine("Enter the Name of Student");
                    student.Name = Console.ReadLine();
                    
                    Console.WriteLine("Enter Subject");
                    student.Subject = Console.ReadLine();
                    
                    Console.WriteLine("Enter Student Marks");
                    student.Marks = Convert.ToInt32(Console.ReadLine());
                    
                    students.Add(student);
                }

                //save into file

                using (StreamWriter sw = new StreamWriter(filepath)) {
                    foreach (var s in students)
                    {
                        sw.WriteLine($"[Student:RollNo : {s.RollNo}, Name : {s.Name}, Subject : {s.Subject}, Marks : {s.Marks}]");
                    }
                }
                Console.WriteLine("Data Saved successfully into File");

                //Read from file

                using (StreamReader sr = new StreamReader(filepath)) {
                    string line;
                    while ((line = sr.ReadLine()) != null)
                    {
                        string[] parts = line.Split(',');
                        Console.WriteLine($"Student[Roll No: {parts[0]}, Name: {parts[1]}, Subject: {parts[2]}, Marks: {parts[3]}]");
                    }
                }
            }
            catch (Exception ex) {
                Console.WriteLine("Fil Not Found" + ex.Message);
            }
            
        }
    }
}
