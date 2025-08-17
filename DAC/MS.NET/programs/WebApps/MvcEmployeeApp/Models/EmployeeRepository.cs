using System;
using Microsoft.Data.SqlClient;

namespace MvcEmployeeApp.Models
{
    public class EmployeeRepository
    {
        string connectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=ACTSJUNE25;Integrated Security=True;";
        public List<Employee> GetAllEmployees()
        {
            List<Employee> emplist = new List<Employee>();
            using (SqlConnection conn = new SqlConnection(connectionString)) { 
               
                conn.Open();
                SqlCommand cmd = new SqlCommand("ReadEmployee",conn);
                cmd.CommandType = System.Data.CommandType.StoredProcedure;

                SqlDataReader rd = cmd.ExecuteReader();
                while (rd.Read()) {

                    Employee emp = new Employee
                    {
                        EmpNo = (int)rd["empNo"],
                        EmpName = rd["empName"].ToString(),
                        Basic = (decimal)rd["Basic"],
                        DeptNo = (int)rd["DeptNo"]
                    };
                    emplist.Add(emp);
                }
            
            }
            return emplist;
        }
    }
}

