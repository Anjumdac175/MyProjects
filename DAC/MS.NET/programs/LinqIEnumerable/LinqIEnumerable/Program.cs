using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LinqIEnumerable {

    internal class Program {

        static void Main() {
            List<Student> students = GetStudents();
            // LINQ using IEnumerable

            /*IEnumerable<Student> topStudents = students.
                                               Where(s => s.Marks > 80)
                                               .OrderByDescending(s => s.Marks);

            Console.WriteLine("IEnumerable Result is :");
            foreach (var s in topStudents)
            {
                Console.WriteLine($"{s.Name}: {s.Marks}");
            }
            */
            // 1.Where Clause
            Console.WriteLine("1. Where clause find highest Marks:");
            var topStudents = students.Where(s => s.Marks > 80);
            foreach (var s in topStudents)
            {
                Console.WriteLine($"{s.Name} - {s.Marks}");
            }


            // 2. Select Clause 
            Console.WriteLine("2. Select Clause to select any field");
            var getName = students.Select(s => s.Name);
            foreach (var name in getName)
            {
                Console.WriteLine($"{name}");
            }

            //3. OrderBy (default - Asc)
            Console.WriteLine("3. Sort in Ascending Order");
            var orderMarks = students.OrderBy(s => s.Marks);
            foreach (var asc in orderMarks)
            {
                Console.WriteLine($"{asc.Name} - {asc.Marks}");
            }

            // 4. OrderByDesc already done above example
            // 5. Group By
            Console.WriteLine("5. GroupBy (Branch)");
            var group = students.GroupBy(s => s.Branch);
            foreach (var branch in group )
            {
                Console.WriteLine($"Branch :{ branch.Key}");
                foreach (var s in branch)
                {
                    Console.WriteLine($"{s.Name}  - {s.Marks}");
                }
            }

            // 6. Distinct
            Console.WriteLine("6. Distinct (Unique branchs)");
            var ubranch = students.Select(s => s.Branch).Distinct();
            foreach (var distinct in ubranch)
            {
                Console.WriteLine(distinct);
            }


            // 7. Take(), Skip()
            Console.WriteLine("7. Take(3) - take top 3 values,");
            var top3 = students.Take(3);
            foreach (var s in top3)
            {
                Console.WriteLine($"{s.Name} - {s.Marks}");
            }

            Console.WriteLine("Skip(2) - skip top 2 rows");
            var skip2 = students.Skip(2);

            foreach (var s in skip2)
            {
                Console.WriteLine($"{s.Name} - {s.Marks}");
            }


            // 8. Any(), All()
            Console.WriteLine("8. Any() any one value - All() all rows");
            bool anytopper = students.Any(s => s.Marks > 80);
            Console.WriteLine($"Topper: {(anytopper ? "yes" : "No")}");
            bool alltopper = students.All(s => s.Marks > 35);
            Console.WriteLine($"All Toppers: {(alltopper ? "yes": "No")}");

            // 9. First(), FirstOrDefault()

            // 10. Aggregations(count, sum, average, max)
            Console.WriteLine("Count the no of students in CSE Branch: ");
            int studentcount = students.Count(s => s.Branch == "CSE");
            Console.WriteLine($"CSE: {studentcount}");

            Console.WriteLine("Sum of Marks of All students in EEE branch");
            int summarks = students.Where(s => s.Branch == "EEE").Sum(s => s.Marks);
            Console.WriteLine($"Total Marks of EEE students are : {summarks}");

            Console.WriteLine("Average Marks of Students in All Branches");
            double avg = students.Average(s => s.Marks);
            Console.WriteLine($"Average: {avg}");

            Console.WriteLine("Max Score of all students in CSE Branch");
            int maxMarks = students.Where(s => s.Branch == "CSE").Max(s => s.Marks);
            Console.WriteLine($"Maximum Marks of CSE Branch are: {maxMarks}");
        }

        static List<Student> GetStudents() {

            return new List<Student> {
                new Student { Id = 1, Name = "Alice", Marks = 85, Branch = "CSE" },
                new Student { Id = 2, Name = "Bob", Marks = 92, Branch = "ECE" },
                new Student { Id = 3, Name = "Charlie", Marks = 78, Branch = "CSE" },
                new Student { Id = 4, Name = "David", Marks = 91, Branch = "EEE" },
                new Student { Id = 5, Name = "Eve", Marks = 85, Branch = "CSE" },
                new Student { Id = 6, Name = "Frank", Marks = 72, Branch = "ECE" }
            };
            
        }
    }



}
