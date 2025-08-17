using Microsoft.AspNetCore.Mvc;

// For more information on enabling Web API for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace MyWebApi.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ValuesController : ControllerBase
    {
        // GET: api/<ValuesController>
        [HttpGet]
        //http://localhost:1234/api/Values
        public IEnumerable<string> Get()
        {
            return new string[] { "Hello","World" };
        }

        // GET api/<ValuesController>/5
        [HttpGet("{id}")]
        //http://localhost:1234/api/Values/123
        public string Get(int id)
        {
            return "value";
        }

        // POST api/<ValuesController>
        [HttpPost]
        //http://localhost:1234/api/Values/
        public void Post([FromBody] string value)
        {

        }
        //http:// localhost:1234/api/Values/123
        // PUT api/<ValuesController>/5
        [HttpPut("{id}")]
        public void Put(int id, [FromBody] string value)
        {
        }

        // DELETE api/<ValuesController>/5
        [HttpDelete("{id}")]
        //http:// localhost:1234/api/Values/4
        public void Delete(int id)
        {
        }
    }
}
