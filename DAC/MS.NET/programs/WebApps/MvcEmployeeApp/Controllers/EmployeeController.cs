using Microsoft.AspNetCore.Mvc;
using MvcEmployeeApp.Models;

namespace MvcEmployeeApp.Controllers
{
    public class EmployeeController : Controller
    {
        public IActionResult Index()
        {
            EmployeeRepository repo = new EmployeeRepository();
            var empList = repo.GetAllEmployees();
            return View(empList);
        }
    }
}
