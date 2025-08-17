using System;
using System.Data;
using Microsoft.Data.SqlClient;

namespace DatabaseApp
{
    public class Employee1
    {
        public int EmpNo { get; set; }
        public string? EmpName { get; set; }
        public double Basic { get; set; }

        public int DeptNo { get; set; }

    }
    internal class databaseCRUD
    {
        static string connectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=ACTSJUNE25;Integrated Security=True;";
        static void Main() {
            Employee1 emp1 = new Employee1 {EmpNo = 10, EmpName = "Karthik", Basic = 120000, DeptNo = 30 };
            InsertEmployee(emp1);
            ReadEmployees();
            Employee1 updatequery = new Employee1 { EmpNo = 9, EmpName = "Suhail", Basic = 150000, DeptNo = 20 };
            UpdateEmployees(updatequery);
            Console.WriteLine("Enter the Record Id to Delete");
            int empId = Convert.ToInt32(Console.ReadLine());
            DeleteEmployees(empId);
        }
        public static void InsertEmployee(Employee1 emp1) {

            using (SqlConnection conn = new SqlConnection(connectionString)) {

                conn.Open();
                SqlCommand cmd = new SqlCommand("InsertEmployee",conn);
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.Parameters.AddWithValue("@EmpNo", emp1.EmpNo);
                cmd.Parameters.AddWithValue("@EmpName", emp1.EmpName);
                cmd.Parameters.AddWithValue("@Basic", emp1.Basic);
                cmd.Parameters.AddWithValue("@DeptNo", emp1.DeptNo);
                cmd.ExecuteNonQuery();
                Console.WriteLine("Data Inserted into table");
         
            }
        }
        public static void ReadEmployees() {

            using (SqlConnection conn = new SqlConnection(connectionString)) {

                conn.Open();
                SqlCommand cmd = new SqlCommand("ReadEmployee", conn);
                cmd.CommandType = CommandType.StoredProcedure;
                SqlDataReader reader = cmd.ExecuteReader();
                Console.WriteLine("Employee List");

                while (reader.Read()) {

                    Console.WriteLine($"Employee[EmpNo: {reader["EmpNo"]},EmpName: {reader["EmpName"]}, Basic:{reader["Basic"]}, DeptNo: {reader["DeptNo"]}]");
                }
            }
        }

        public static void UpdateEmployees(Employee1 empl1) {
            using (SqlConnection conn = new SqlConnection(connectionString)) {

                conn.Open();
                SqlCommand cmd = new SqlCommand("UpdateEmployee", conn);
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.Parameters.AddWithValue("@EmpNo", empl1.EmpNo);
                cmd.Parameters.AddWithValue("@EmpName", empl1.EmpName);
                cmd.Parameters.AddWithValue("@Basic", empl1.Basic);
                cmd.Parameters.AddWithValue("@DeptNo", empl1.DeptNo);
                cmd.ExecuteNonQuery();
                Console.WriteLine("Updated Table Successfully");
            }
        }

        public static void DeleteEmployees(int empId) {
            using (SqlConnection conn = new SqlConnection(connectionString)) {
                conn.Open();
                SqlCommand cmd = new SqlCommand("DeleteEmployee", conn);
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.Parameters.AddWithValue("@EmpNo", empId);
                cmd.ExecuteNonQuery();
                Console.WriteLine("Delete Record Successfully");
            }
        
        
        }
    }
}
