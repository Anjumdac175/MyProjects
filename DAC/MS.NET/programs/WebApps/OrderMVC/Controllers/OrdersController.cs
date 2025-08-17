using Microsoft.AspNetCore.Mvc;
using OrderMVC.Models;

namespace OrderMVC.Controllers
{
    public class OrdersController : Controller
    {
        private readonly OrderDAL _orderDAL;
        public OrdersController(IConfiguration configuration) { 
            _orderDAL = new OrderDAL(configuration);
        }
        public IActionResult Index()
        {
            return View();
        }

        //get order
        public IActionResult AddOrder() { 
            return View();
        }

        //post order
        [HttpPost]
        public async Task<IActionResult> AddOrder(OrderModel order) {
            if (ModelState.IsValid)
            {
                int orderId = await _orderDAL.AddOrdersAsync(order);
                ViewBag.Message = $"Order Placed Successfully. OrderId:{orderId}";
                ModelState.Clear();
                return View();
            }
            return View(order);
        }
        public IActionResult ShowOrders() {
            return View();
        }

        [HttpPost]
        public async Task<IActionResult> ShowOrders(int? orderId, string? CustomerName) {

          var orders = await _orderDAL.SearchOrdersAsync(orderId, CustomerName);
            return View("ViewOrders", orders);
        }
    }
}
