using System;
class Employee
{
    // static empcounter to auto generate empNo
    private static int empcount = 1;
    private int empNo;
    private String? name;
    private decimal basic;
    private short deptNo;


    // generating empno default we use auto-property
    public int EmpNo { get; }

    //Name Property
    public String Name
    {
        get { return name; }
        set
        {

            if (value != null)
            {
                name = value;
            }
            else
            {
                Console.WriteLine("Employee Name should not be Blank");
            }
        }
    }

    //Employee Basic Salary Property
    public decimal Basic
    {
        get { return basic; }
        set
        {
            if (value > 10000 && value < 200000)
            {
                basic = value;
            }
            else
            {
                Console.WriteLine("Salary should be in the range of 10000 - 200000");
            }

        }
    }

    // Employee DeptNo
    public short DeptNo
    {
        get { return deptNo; }
        set
        {
            if (value > 0)
            {
                deptNo = value;
            }
            else
            {

                Console.WriteLine("Dept No should not be Zero");
            }
        }
    }

    public Employee(string name = "default", decimal basic = 10000, short deptNo = 1)
    {
        EmpNo = empcount++;
        Name = name;
        Basic = basic;
        DeptNo = deptNo;
       
    } 

    public decimal GetNetSalary()
    {
        decimal hra = Basic * 0.40M;
        decimal da = Basic * 0.12M;
        decimal tax = Basic * 0.10M;

        return Basic + hra + da - tax;
    }

}

namespace Employee2
{
    class Program
    {
        static void Main()
        {

            Employee o1 = new Employee("Amol",12345,10);
            Employee o2 = new Employee("Amol", 12345);
            Employee o3 = new Employee("Amol");
            Employee o4 = new Employee();


            Console.WriteLine("Details of a Employees in Ascending order are: ");
            Console.WriteLine("*************************************");
            Console.WriteLine("Employee No of Object1 is :" + o1.EmpNo);
            Console.WriteLine("Employee No of Object2 is :" + o2.EmpNo);
            Console.WriteLine("Employee No of Object3 is :" + o3.EmpNo);
            Console.WriteLine("Employee No of Object3 is :" + o4.EmpNo);
            Console.WriteLine("*************************************");

            Console.WriteLine("Details of a Employees in Reverse order are: ");
            Console.WriteLine("*************************************");
            Console.WriteLine("Employee No of Object4 is :" + o4.EmpNo);
            Console.WriteLine("Employee No of Object3 is :" + o3.EmpNo);
            Console.WriteLine("Employee No of Object2 is :" + o2.EmpNo);
            Console.WriteLine("Employee No of Object1 is :" + o1.EmpNo);
            Console.WriteLine("*************************************");
        }
    }

}