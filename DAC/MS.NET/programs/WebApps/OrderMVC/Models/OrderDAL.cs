using Microsoft.Data.SqlClient;

namespace OrderMVC.Models
{
    public class OrderDAL
    {
        private readonly string? _connection;
        public OrderDAL(IConfiguration configuration)
        {
            _connection = configuration.GetConnectionString("DefaultConnection");
        }

        public async Task<int> AddOrdersAsync(OrderModel order) {

            using (SqlConnection conn = new SqlConnection(_connection)) {
                string addQuery = "INSERT INTO Orders(CustomerName, ItemName, ItemPrice, ItemQuantity)" +
                    "OUTPUT INSERTED.OrderId VALUES(@CustomerName, @ItemName, @ItemPrice, @ItemQuantity)";
                SqlCommand cmd = new SqlCommand(addQuery, conn);
                cmd.Parameters.AddWithValue("@CustomerName", order.CustomerName);
                cmd.Parameters.AddWithValue("@ItemName",order.ItemName);
                cmd.Parameters.AddWithValue("@ItemPrice",order.ItemPrice);
                cmd.Parameters.AddWithValue("@ItemQuantity",order.ItemQuantity);

                await conn.OpenAsync();
                int orderId = (int)await cmd.ExecuteScalarAsync();
                return orderId;
            }
        
        }

        public async Task<List<OrderModel>> SearchOrdersAsync(int? orderId, string? customerName) { 
        
            List<OrderModel> orderModels = new List<OrderModel>();
            using (SqlConnection conn = new SqlConnection(_connection)) {
                string searchQuery = "SELECT * FROM Orders WHERE (OrderId = @OrderId OR @OrderId IS NULL)" +
                    "AND (CustomerName LIKE @CustomerName OR @CustomerName IS NULL)";
                SqlCommand cmd = new SqlCommand(searchQuery, conn);
                cmd.Parameters.AddWithValue("@OrderId", orderId.HasValue ? (object)orderId.Value : DBNull.Value);
                cmd.Parameters.AddWithValue("@CustomerName",string.IsNullOrEmpty(customerName) ? (object)DBNull.Value : "%" + customerName + "%");


                await conn.OpenAsync();
                SqlDataReader reader = await cmd.ExecuteReaderAsync();
                while (await reader.ReadAsync()) {
                    OrderModel model = new OrderModel
                    {
                        OrderId = (int)reader["OrderId"],
                        CustomerName = reader["CustomerName"].ToString(),
                        ItemName = reader["ItemName"].ToString(),
                        ItemPrice = Convert.ToDecimal(reader["ItemPrice"]),
                        ItemQuantity = (int)reader["ItemQuantity"]
                    };
                   orderModels.Add(model);
                }
                return orderModels;
            }
        }

    }
}
