using Microsoft.Data.SqlClient;
using System.Net;

namespace DatabaseApp
{
    public class Employee {
        public int EmpNo { get; set; }
        public string ? EmpName { get; set; }
        public double Basic { get; set; }

        public int DeptNo { get; set; }
        
    }

    internal class Program
    {
        static void Main()
        {
            Connect();
            //Employee emp = new Employee { EmpNo = 7, EmpName = "JayaSree", Basic = 70000, DeptNo = 20 };
            //Insert(emp);
           Employee emp = new Employee { EmpNo = 9, EmpName = "Pushpak", Basic = 120000, DeptNo = 30 };
            //InsertParameters(emp);
            InsertStoredProcedures(emp);
        }

        static void Connect() {
            //Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=ACTSJUNE25;Integrated Security=True;
            SqlConnection conn = new SqlConnection();
            conn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=ACTSJUNE25;Integrated Security=True;";
            try
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = "INSERT INTO Employees values(6,'Pranjal',75000,30)";
                cmd.ExecuteNonQuery();


                Console.WriteLine("Success");
            }
            catch (Exception ex) { 
                Console.WriteLine(ex.Message);
            }
            finally { conn.Close(); }
        }
        static void Insert(Employee emp)
        {
            SqlConnection conn = new SqlConnection();
            conn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=ACTSJUNE25;Integrated Security=True;";
            try
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = System.Data.CommandType.Text;
                //cmd.CommandText = "INSERT INTO Employees values(6,'Pranjal',75000,30)";
                cmd.CommandText = $"INSERT INTO Employees values({emp.EmpNo},'{emp.EmpName}', {emp.Basic}, {emp.DeptNo})";
                cmd.ExecuteNonQuery();


                Console.WriteLine("Success");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally { conn.Close(); }
        }
        static void InsertParameters(Employee emp)
        {
            SqlConnection conn = new SqlConnection();
            conn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=ACTSJUNE25;Integrated Security=True;";
            try
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = System.Data.CommandType.Text;
                //cmd.CommandText = "INSERT INTO Employees values(6,'Pranjal',75000,30)";
                cmd.CommandText = "INSERT INTO Employees values(@EmpNo,@EmpName, @Basic, @DeptNo)";
                cmd.Parameters.AddWithValue("@EmpNo",emp.EmpNo);
                cmd.Parameters.AddWithValue("@EmpName", emp.EmpName);
                cmd.Parameters.AddWithValue("@Basic", emp.Basic);
                cmd.Parameters.AddWithValue("@DeptNo", emp.DeptNo);
                cmd.ExecuteNonQuery();


                Console.WriteLine("Success");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally { conn.Close(); }
        }
        static void InsertStoredProcedures(Employee emp)
        {
            SqlConnection conn = new SqlConnection();
            conn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=ACTSJUNE25;Integrated Security=True;";
            try
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = System.Data.CommandType.StoredProcedure;
                cmd.CommandText = "InsertEmployee";
                cmd.Parameters.AddWithValue("@EmpNo", emp.EmpNo);
                cmd.Parameters.AddWithValue("@EmpName", emp.EmpName);
                cmd.Parameters.AddWithValue("@Basic", emp.Basic);
                cmd.Parameters.AddWithValue("@DeptNo", emp.DeptNo);
                cmd.ExecuteNonQuery();


                Console.WriteLine("Success");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally { conn.Close(); }
        }
    }
}
