using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LinqIEnumerable
{
    internal class IQueryableSample
    {
        static void Main2() {
            IQueryable<Student> students = GetStudents().AsQueryable();

            IQueryable<Student> topStudents = students
                                               .Where(s => s.Marks > 80)
                                               .OrderByDescending(s => s.Marks);
            Console.WriteLine("Students list : ");
            foreach (var s in topStudents)
            {
                Console.WriteLine($"{s.Name} - {s.Marks}");
            }

        }
        static List<Student> GetStudents() {

            return new List<Student> {
                new Student {Id = 175, Name = "Alice", Marks = 75 },
                new Student { Id = 121, Name= "Bob", Marks = 87},
                new Student {Id = 156, Name = "Meera", Marks = 65 }

            };
        }
    }
}
