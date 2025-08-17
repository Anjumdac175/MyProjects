using System;
using System.Reflection.Metadata.Ecma335;

namespace EmployeeArray 
{
    class Employee 
    { 
        public int empId { get; set; }
        public string? empName { get; set; }
        public decimal salary { get; set; }

        //public Employee(int empId, string? empName, decimal salary)
        //{
        //    this.empId = empId;
        //    this.empName = empName;
        //    this.salary = salary;
        //}
        public void AcceptDetails() {

            Console.WriteLine("Enter the Employee Id: ");
            empId = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter the Employee Name: ");
            empName = Console.ReadLine()!;

            Console.WriteLine("Enter the Employee Salary: ");
            salary = Convert.ToDecimal(Console.ReadLine());

        }

        public void display() 
        {
            Console.WriteLine($"Employee Id: {empId}, Employee Name: {empName}, Employee Salary: {salary}");
        }

        public static Employee findHighestSalary(Employee[] employees)
        {

            Employee max = employees[0];

            foreach (Employee sal in employees)
            {
                if (sal.salary > max.salary)
                {
                    max = sal;
                }
            }
            return max;
        }

        public static Employee searchByEmpId(int id, Employee[] employees) {

            foreach (Employee emp in employees)
            {
                if (emp.empId.Equals(id)) {
                    return emp;
                }
            }

            return null;
        }
    }

    internal class Program 
    {
        static void Main() 
        {
            Console.WriteLine("Enter the No. of Employees");
            int emps = Convert.ToInt32(Console.ReadLine());
            
            Employee[] employees = new Employee[emps];

            // Accepting details of Employees
            for (int i = 0; i < emps; i++) {

                employees[i] = new Employee();
                employees[i].AcceptDetails();
            }

            // Finding an Employee with highest salary
            Console.WriteLine("********************************************");
            Console.WriteLine("Finding then Highest Salary in Employees");
            Employee maxSal = Employee.findHighestSalary(employees);
            Console.WriteLine("Highest salary of Employee is: ");
            maxSal.display();

            // Searching an employee with empid
            Console.WriteLine("********************************************");
            Console.WriteLine("Emter the Employee Id to Search");
            int searchemp = Convert.ToInt32(Console.ReadLine());
            Employee empSearch = Employee.searchByEmpId(searchemp, employees);
            if (empSearch == null)
            {
                Console.WriteLine("Employee not found in the list of Employees");
            }
            else {
                Console.WriteLine("Employee found with give Employee id: " + searchemp);
                empSearch.display();
            }
            Console.WriteLine("********************************************");
            // for Displaying all the details of Employees
            foreach (Employee emp in employees)
             {
                emp.display();
             }
        }
    }
}
