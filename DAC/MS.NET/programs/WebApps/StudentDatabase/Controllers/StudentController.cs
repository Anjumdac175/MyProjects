using Microsoft.AspNetCore.Mvc;
using StudentDatabase.Models;
using System.Data;

namespace StudentDatabase.Controllers
{
    public class StudentController : Controller
    {
        private readonly StudentRepository _repo;

        public StudentController(IConfiguration configuration)
        {
            _repo = new StudentRepository(configuration);
        }
        //StudentRepository repo = new StudentRepository();

        // To Display List on Dashboard
        public IActionResult Index()
        {
            return View();            
        }

        public IActionResult ShowStudent() {
            HttpContext.Session.SetString("UserName", "Anjum");
            ViewBag.User = HttpContext.Session.GetString("UserName");

            DataSet ds = new DataSet();
            ds = _repo.GetAllStudents();
            List<Student> studentList = new List<Student>();
            foreach (System.Data.DataRow student in ds.Tables[0].Rows)
            {

                studentList.Add(new Student
                {
                    RollNo = Convert.ToInt32(student["RollNo"]),
                    Name = student["Name"].ToString(),
                    Age = Convert.ToInt32(student["Age"]),
                    Email = student["Email"].ToString()
                });
            }
            return View(studentList);
        }

        // To show the Empty Form to the Users to Fill the Form
        // this is a Get Method
        public IActionResult CreateStudent() { 
            return View();
        }

        // This is to store the Data that entered by the USer into the DataBase
        // Post Method
        [HttpPost]
        public IActionResult Create(Student student) {
            if (ModelState.IsValid) {
                _repo.AddStudent(student);
                return RedirectToAction("ShowStudent");
            }
            return View(student);
        }

        // This is to Show the already Filled Information to the User in the Form Format
        // Get Method

        public IActionResult EditStudent(int id)
        {
            var row = _repo.GetStudent(id);
            if (row == null) return null;

            Student s = new Student() { 
                
                RollNo = Convert.ToInt32(row["RollNo"]),
                Name = row["Name"].ToString(),
                Age = Convert.ToInt32(row["Age"]),
                Email = row["Email"].ToString()
            };
            return View(s);
        }

        // this is a post method to update changes in table
        [HttpPost]
        public IActionResult Update(Student student) {

            if (ModelState.IsValid) { 
                _repo.UpdateStudent(student);
                return RedirectToAction("ShowStudent");
            }
            return View(student);
        }
        //get details to delete
        public IActionResult DeleteStudent(int id) {

            var row = _repo.GetStudent(id);
            if (row == null) return null;
            Student s = new Student()
            {

                RollNo = Convert.ToInt32(row["RollNo"]),
                Name = row["Name"].ToString(),
                Age = Convert.ToInt32(row["Age"]),
                Email = row["Email"].ToString()
            };
            return View(s);
        }


        [HttpPost]
        public IActionResult DeleteConfirmed(Student s) { 
            _repo.DeleteStudent(s.RollNo);
            return RedirectToAction("ShowStudent"); 
        }
    }
}
