using BookManagement.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;

namespace BookManagement.Controllers
{
    public class BooksController : Controller
    {
        private readonly BookRepository _repo;
        public BooksController(IConfiguration configuration) {
            _repo = new BookRepository(configuration); 
        }
        public IActionResult Index()
        {
            // My default Index page will display
            return View();
        }

        public IActionResult BookDetails() {

            var books = _repo.GetBooks();
            ViewData["Message"] = "Book List";
            return View(books);
        }

        //Get method to create
        public IActionResult CreateBook() {

            ViewBag.Publishers = new SelectList(_repo.GetPublishers(), "PublisherId","PublisherName");
            return View();
        }

        //Post method to Create
        [HttpPost]
        public IActionResult CreateBook(Book book) { 
           
            if (ModelState.IsValid) {
                _repo.AddBook(book);
                TempData["Message"] = "Book Saved Successfully";
                return RedirectToAction("Index");
            }
            ViewBag.Publishers = new SelectList(_repo.GetPublishers(), "PublisherId", "PublisherName");
            return View(book);
        }

        //Get method to edit
        public IActionResult EditBook(int id) {

            var books = _repo.GetBookById(id);
            ViewBag.Publishers = new SelectList(_repo.GetPublishers(), "PublisherId", "PublisherName", books.PublisherId);
            return View(books);
        }

        //post method to edit
        [HttpPost]
        public IActionResult EditBook(int id, Book book) {
            if (ModelState.IsValid) {
                _repo.EditBook(book);
                TempData["Message"] = "Book Updated Successfully";
                return RedirectToAction("BookDetails");
            }
            ViewBag.Publishers = new SelectList(_repo.GetPublishers(), "PublisherId", "PublisherName");
            return View(book);
        }

        //Get method to delete
        public IActionResult DeleteBook(int id) {

            var books = _repo.GetBookById(id);
            return View(books);
        }

        // post method to delete
        [HttpPost]
        [ActionName("DeleteBook")]
        public IActionResult DeleteConfirmed(int id) { 

            _repo.RemoveBook(id);
            TempData["Message"] = "Book Deleted Successfully";
            return RedirectToAction("Index");
        }
    }
}
