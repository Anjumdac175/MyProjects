using System.ComponentModel.DataAnnotations;

namespace OrderMVC.Models
{
    public class OrderModel
    {
        public int OrderId { get; set; }
        [Required(ErrorMessage = "Customer name is required")]
        public string? CustomerName { get; set; }
        [Required(ErrorMessage = "Item name is required")]
        public string? ItemName { get; set; }
        [Range(1, 100000, ErrorMessage = "Enter valid item price")]
        public decimal  ItemPrice { get; set; }
        [Range(1, 100000, ErrorMessage = "Enter valid item Qunatity")]
        public int ItemQuantity { get; set; }
    }
}
