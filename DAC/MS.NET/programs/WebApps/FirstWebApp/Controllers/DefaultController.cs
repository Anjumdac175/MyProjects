using Microsoft.AspNetCore.Mvc;

namespace FirstWebApp.Controllers
{
    public class DefaultController : Controller
    {
        public IActionResult Index(int? id)
        {
            //if (id == null) { 
            //return NotFound();
            //}
            return View();
        }
    }
}
