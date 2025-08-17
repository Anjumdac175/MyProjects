using Microsoft.Data.SqlClient;
namespace BookManagement.Models
{
    public class BookRepository
    {
        private readonly string? _connection;
        public BookRepository(IConfiguration configuration) {
            _connection = configuration.GetConnectionString("DefaultConnection");
        }

        public void AddBook(Book book) {

            //List<Book> bookList = new List<Book>();
            using (SqlConnection conn = new SqlConnection(_connection)) {
                string addQuery = "INSERT INTO Books(Title, Author, Price, PublisherId) values(@Title, @Author, @Price, @PublisherId)";
                SqlCommand cmd = new SqlCommand(addQuery, conn);
                cmd.Parameters.AddWithValue("@Title", book.Title);
                cmd.Parameters.AddWithValue("@Author",book.Author);
                cmd.Parameters.AddWithValue("@Price",book.Price);
                cmd.Parameters.AddWithValue("@PublisherId",book.PublisherId);
                
                conn.Open();
                cmd.ExecuteNonQuery();
            }
        }
        public List<Book> GetBooks() {
            List<Book> booksList = new List<Book>();

            using (SqlConnection conn = new SqlConnection(_connection)) {
                string selectQuery = @"SELECT b.BookId, b.Title, b.Author, b.Price, p.PublisherName FROM Books b JOIN Publishers p ON b.PublisherId = p.PublisherId"; ;
                SqlCommand cmd = new SqlCommand(selectQuery, conn);
                conn.Open();
                SqlDataReader dr = cmd.ExecuteReader();
                while (dr.Read()) {

                    Book book = new Book
                    {
                        BookId = Convert.ToInt32(dr["BookId"]),
                        Title = dr["Title"].ToString(),
                        Author = dr["Author"].ToString(),
                        Price = Convert.ToDecimal(dr["Price"]),
                        PublisherName = dr["PublisherName"].ToString()
                    };

                    booksList.Add(book);
                }
             
            }
                return booksList;
        }

        public void EditBook(Book book) {
            using (SqlConnection conn = new SqlConnection(_connection))
            {
                string editQuery = "UPDATE Books SET Title = @Title, Author = @Author, Price = @Price, PublisherId = @PublisherId WHERE BookId = @BookId";
                SqlCommand cmd = new SqlCommand(editQuery, conn);
                cmd.Parameters.AddWithValue("@BookId", book.BookId);
                cmd.Parameters.AddWithValue("@Title",book.Title);
                cmd.Parameters.AddWithValue("@Author", book.Author);
                cmd.Parameters.AddWithValue("@Price", book.Price);
                cmd.Parameters.AddWithValue("@PublisherId", book.PublisherId);
                conn.Open();
                cmd.ExecuteNonQuery();
            }
        }
        public void RemoveBook(int bookid)
        {
            using (SqlConnection conn = new SqlConnection(_connection))
            {
                string delQuery = "DELETE FROM Books WHERE BookId = @BookId";
                SqlCommand cmd = new SqlCommand(delQuery, conn);
                cmd.Parameters.AddWithValue("@BookId", bookid);
                conn.Open();
                cmd.ExecuteNonQuery();
            }
        }

        public Book GetBookById(int bookid) {
            Book book = null!;
            using (SqlConnection conn = new SqlConnection(_connection)) {
                string idQuery = "SELECT * FROM Books WHERE BookId = @BookId";
                SqlCommand cmd = new SqlCommand(idQuery, conn);
                cmd.Parameters.AddWithValue("@BookId", bookid);
                conn.Open();
                SqlDataReader dr = cmd.ExecuteReader();
                if (dr.Read()) {

                    book = new Book()
                    {
                        BookId = Convert.ToInt32(dr["BookId"]),
                        Title = dr["Title"].ToString(),
                        Author = dr["Author"].ToString(),
                        Price = Convert.ToDecimal(dr["Price"]),
                        PublisherId = Convert.ToInt32(dr["PublisherId"])
                    };
                }
            }

                return book!;
        }

        public List<Publisher> GetPublishers() {
            List<Publisher> publisherList = new List<Publisher>();
            using (SqlConnection conn = new SqlConnection(_connection)) {
                string getQuery = "SELECT * FROM Publishers";
                SqlCommand cmd = new SqlCommand(getQuery, conn);
                conn.Open();
                SqlDataReader dr = cmd.ExecuteReader();
                while (dr.Read()) {
                    Publisher publisher = new Publisher
                    {
                        PublisherId = Convert.ToInt32(dr["PublisherId"]),
                        PublisherName = dr["PublisherName"].ToString(),
                    };
                    publisherList.Add(publisher);
                }
            }
          return publisherList;  
        }
    }
}
