using System.ComponentModel.DataAnnotations;

namespace BookManagement.Models
{
    public class Book
    {
        public int BookId { get; set; }
        [Required(ErrorMessage ="Title is Required")]
        
        public string? Title { get; set; }
        [Required(ErrorMessage = "Author Name is Required")]
        public string? Author { get; set; }
        [Range(1, 1000, ErrorMessage ="price must be between 1 to 1000")]
        public decimal Price { get; set; }
        [Required(ErrorMessage = "Author Name is Required")]
        public int PublisherId { get; set; }

        public string ?PublisherName { get; set; } 
    }
}
