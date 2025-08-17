using System;
using System.Collections.Generic;
using System.Runtime.InteropServices.Marshalling;
namespace CollectionsOfEmployees 
{
    public class Employee {
        public int empNo { get; set; }
        public String? empName { get; set; }
        public decimal salary { get; set; }

        // to Accept details of Employees
        public void AcceptDetails() {
            Console.WriteLine("Enter the Employee id: ");
            empNo = Convert.ToInt32(Console.ReadLine());
            
            Console.WriteLine("Enter the Employee Name: ");
            empName = Console.ReadLine();
            
            Console.WriteLine("Enter the Employee Salary: ");
            salary = Convert.ToDecimal(Console.ReadLine());
        }

        public void display() { 
            Console.WriteLine($"EmpNo: {empNo}, EmpName: {empName}, EmpSalary: {salary}");
        }

        // to find highest salary

        public static Employee findHighestSalary(List<Employee> employee) { 
            
            Employee max = employee[0];
            foreach (Employee emp in employee)
            {
                if (emp.salary > max.salary) {
                    max = emp;
                }
            }
            return max;
        }

        // to search an employee

        public static Employee searchByEmpId(int id, List<Employee> employee) {

            foreach (Employee emp in employee)
            {
                if (emp.empNo.Equals(id)) {
                    return emp;
                }
            }

            return null;
        }

        // to find the Nth Employee

        public static Employee findNthEmployee (int n, List<Employee> employee){

            if (n > 0 && n <= employee.Count) { 
                return employee[n - 1];
            }

            return null;
        }

    }

    internal class Program 
    
    {
        static void Main() 
        {
            List<Employee> employeeList = new List<Employee>();
            string? choice = "";

            // to accept employee details by asking users untill to stop
            do {
               
                Employee employee = new Employee();
                Console.WriteLine("**Enter the Employee Details**");
                employee.AcceptDetails();
                employeeList.Add(employee);

                Console.WriteLine("Do you want to Add more Employees (yes/no)?");
                choice = Console.ReadLine()!.ToLower();

            } while (choice == "yes");

            // find max salary

            Employee maxemp = Employee.findHighestSalary(employeeList);
            Console.WriteLine("*************************************");
            Console.WriteLine("Highest Salary Employee is: ");
            maxemp.display();

            //search by id
            Console.WriteLine("*************************************");
            Console.WriteLine("Enter the id to be searched: ");
            int searchemp = Convert.ToInt32(Console.ReadLine());

            Employee empSearch = Employee.searchByEmpId(searchemp, employeeList);
            Console.WriteLine("Employee Details based on Emp Id is :");
            empSearch.display();

            // nth employee
            Console.WriteLine("*************************************");
            Console.WriteLine("Enter the number to display Nth Employee: ");
            int number = Convert.ToInt32(Console.ReadLine());  
            Employee Nthemp = Employee.findNthEmployee(number,employeeList);
            Nthemp.display();

            // display all details of Employee
            Console.WriteLine("*************************************");
            Console.WriteLine("Employee details are: ");
            foreach (Employee list in employeeList)
            {
                list.display();
            }





            // 3. Create a List<Employee>. Convert it to an array. Display all the array elements.
            Console.WriteLine("\n*************************************");
            Employee[] ArrayFromList = employeeList.ToArray();

            Console.WriteLine("Employee details in Array are: ");

            foreach (Employee arr in ArrayFromList)
            {
                arr.display();
            }


            // 2. Create an array of Employee objects. Convert it to a List<Employee>.  Display all the Employees in the list.
            Console.WriteLine("\n*************************************");
            Console.WriteLine("Employee details in List are: ");
            List<Employee> ListFromArray = new List<Employee>(ArrayFromList);

            foreach (Employee emplist in ListFromArray)
            {
                emplist.display();
            }

        }
    }
}