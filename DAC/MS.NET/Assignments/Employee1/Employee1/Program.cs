using System;
class Employee {

    private String ? name;
    private int empNo;
    private decimal basic;
    private short deptNo;

    //Name Property
    public String Name
    {
        get { return name; }
        set {

            if (value != null)
            {
               name = value;
            }
            else {
                Console.WriteLine("Employee Name should not be Blank");
            }
        }
    }

    //Employee Id property
    public int EmpNo
    {
        get { return empNo; }
        set {
            if (value > 0)
            {
                empNo = value;
            }
            else {
                Console.WriteLine("EmpNo must be Greater than Zero");
            }
        }
    }
     //Employee Basic Salary Property
     public decimal Basic {
        get { return basic; }
        set {
            if (value > 0)
            {
               basic = value;
            }
            else {
                Console.WriteLine("Enter some Range of Salary");
            }
            
        }
    }

    // Employee DeptNo
    public short DeptNo
    {
        get { return deptNo; }
        set {
            if (value > 0)
            {
                deptNo = value;
            }
            else {

                Console.WriteLine("Dept No should not be Zero");
            }
        }
    }


    public decimal GetNetSalary() {
        decimal hra = Basic * 0.40M;
        decimal da = Basic * 0.12M;
        decimal tax = Basic * 0.10M;

        return Basic + hra + da - tax;
    }

}

namespace Employee1 {
    class Program {
        static void Main() {

            Employee emp = new Employee
            {
                Name = "Prabha",
                EmpNo = 175,
                Basic = 75000,
                DeptNo = 2
            };

            Console.WriteLine("Details of a Employee are: ");
            Console.WriteLine("*************************************");
            Console.WriteLine("Name of Employee is :" + emp.Name);
            Console.WriteLine("Employee No is: " + emp.EmpNo);
            Console.WriteLine("Employee Basic Salary is: " + emp.Basic);
            Console.WriteLine("Employee Dept No is: " + emp.DeptNo);
            Console.WriteLine("*************************************");
        }
    }

}