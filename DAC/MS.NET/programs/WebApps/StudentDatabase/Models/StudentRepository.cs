using Microsoft.Data.SqlClient;
using System.Data;

namespace StudentDatabase.Models
{
    public class StudentRepository
    {
        private readonly string _connectionString;
        public StudentRepository(IConfiguration configuration) {

            _connectionString = configuration.GetConnectionString("DefaultConnection");
        }

        public void AddStudent(Student student)
        {
            using (SqlConnection conn = new SqlConnection(_connectionString)) {
                SqlCommand cmd = new SqlCommand("InsertStudent", conn);
                cmd.CommandType = System.Data.CommandType.StoredProcedure;
                cmd.Parameters.AddWithValue("@RollNo", student.RollNo);
                cmd.Parameters.AddWithValue("@Name", student.Name);
                cmd.Parameters.AddWithValue("@Age", student.Age);
                cmd.Parameters.AddWithValue("@Email",student.Email);
                conn.Open();
                cmd.ExecuteNonQuery();
            }
        }

        public void UpdateStudent(Student student) {
            using (SqlConnection conn = new SqlConnection(_connectionString))
            {
                SqlCommand cmd = new SqlCommand("UpdateStudent", conn);
                cmd.CommandType = System.Data.CommandType.StoredProcedure;
                cmd.Parameters.AddWithValue("@RollNo", student.RollNo);
                cmd.Parameters.AddWithValue("@Name", student.Name);
                cmd.Parameters.AddWithValue("@Age", student.Age);
                cmd.Parameters.AddWithValue("@Email", student.Email);
                conn.Open();
                cmd.ExecuteNonQuery();
            }
        }

        public void DeleteStudent(int RollNo) {
            using (SqlConnection conn = new SqlConnection(_connectionString))
            {
                SqlCommand cmd = new SqlCommand("DeleteStudent", conn);
                cmd.CommandType = System.Data.CommandType.StoredProcedure;
                cmd.Parameters.AddWithValue("@RollNo", RollNo); 
                conn.Open();
                cmd.ExecuteNonQuery();
            }
        }
        public DataRow GetStudent(int RollNo) {
            using (SqlConnection conn = new SqlConnection(_connectionString))
            {
                SqlDataAdapter adapter = new SqlDataAdapter("GetStudentById", conn);
                adapter.SelectCommand.CommandType = System.Data.CommandType.StoredProcedure;
                adapter.SelectCommand.Parameters.AddWithValue("@RollNo", RollNo);
                DataSet ds = new DataSet();
                adapter.Fill(ds);
                if (ds.Tables[0].Rows.Count > 0)
                {
                    return ds.Tables[0].Rows[0];
                }
                else
                {
                    return null;
                }
            }
        }

        public DataSet GetAllStudents() {
            using (SqlConnection conn = new SqlConnection(_connectionString))
            {
                SqlDataAdapter adapter = new SqlDataAdapter("ReadStudent", conn);
                adapter.SelectCommand.CommandType = System.Data.CommandType.StoredProcedure;
                DataSet ds = new DataSet();
                adapter.Fill(ds);
                return ds;
            } 
        }
    }
}
