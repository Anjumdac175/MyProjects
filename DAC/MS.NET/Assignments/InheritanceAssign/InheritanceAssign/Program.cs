using System;
using System.Security.Cryptography.X509Certificates;
namespace InheritanceAssign {

    // Interface 
    public interface IDBFunctions {
        void insert();
        void delete();
        void update();
    
    }
    abstract class Employee : IDBFunctions { 
        private static int emplNo = 101;
        private String empName;
        private short deptNo;

        public int EmpNo { get; }
        public String EmpName
        {
            get { return empName; }
            set {
                if (value != null)
                {
                    empName = value;
                }
                else { Console.WriteLine("Employee should not be balnk"); }
            }
        }

        public abstract decimal Basic { get; set; }
        

        public short DeptNo { 
        
            get { return deptNo; }
            set {
                if (value > 0) { 
                    deptNo = value;
                }
                else { Console.WriteLine("Deptno should be greater than Zero"); }
            }
        }

        public Employee(String empName = "default", short deptNo=1) { 
            this.EmpNo = emplNo++;
            this.empName = empName;
            this.deptNo = deptNo;
        }
        public abstract decimal CalcNetSalary(); // abstract method

        public void insert()
        {
            Console.WriteLine($"{EmpName} Inserted");
        }

        public void delete()
        {
            Console.WriteLine($"{EmpName} deleted");
        }

        public void update()
        {
            Console.WriteLine($"{EmpName} Updated");
        }
    }

    class Manager : Employee {
        private String designation;
        private decimal basic;

        public Manager(String empName, decimal basic, short deptNo, String designation) : base(empName, deptNo)
        {
            this.Basic = basic;
            this.designation = designation;
        }
        public String Designation { 
            get { return designation; }
            set {
                    if (value != null)
                    {
                        designation = value;
                    }
                    else { Console.WriteLine("Desgination should not be blank"); }
                }
        }

        // abstract property from Employee
        public override decimal Basic
        {
            get { return basic; }
            set
            {
                if (value > 5000 && value < 200000)
                {
                    basic = value;
                }
                else { Console.WriteLine("Salary range should be in between 5000 to 10000"); }
            }
        }
        
        // abstract method from Employee

        public override decimal CalcNetSalary()
        {
            decimal hra = Basic * 0.40M;
            decimal da = Basic * 0.12M;
            decimal salary = Basic + hra + da;
            return salary;
        }
    
    }

    class GeneralManager : Manager {
        public String Perks { get; set; }

        public GeneralManager(String empName, decimal basic, short deptNo, string designation, String perks) : base(empName, basic,deptNo,designation)
        {
            this.Perks = perks;
        }

        public override decimal CalcNetSalary()
        {
           // decimal salary = Basic * 0.09M;
            return base.CalcNetSalary() * 0.10M;
        }

       
        public void DisplayDetails()
        {
            Console.WriteLine("Employee Details are: ");
            Console.WriteLine("Employee Name: " + EmpName);
            Console.WriteLine("Employee Id: " + EmpNo);
            Console.WriteLine("Employee Department: " + DeptNo);
            Console.WriteLine("Employee Designation" + Designation);
            Console.WriteLine("Employee  Basic Salary: " + Basic);
            Console.WriteLine("Employee Perks: " + Perks);
            Console.WriteLine("****************************************");
        }
    }

    class CEO : Employee
    {
        private decimal basic;
        public CEO(String empName, decimal basic, short deptNo) : base(empName, deptNo) {
            this.Basic = basic;
        }

        public override decimal Basic {
            get { return basic; }
            set
            {
                if (value > 5000 && value < 200000)
                {
                    basic = value;
                }
                else { Console.WriteLine("Salary range should be in between 5000 to 10000"); }
            }
        }

        public sealed override decimal CalcNetSalary()
        {
            decimal festiveBonus = 5000.0M;
            return Basic + festiveBonus;
        }
    }



    internal class Program {
        static void Main() {
            Employee mng = new Manager("Alice", 12000, 5, "Team Lead");
            Employee gmng = new GeneralManager("John",75000,10,"Team Head","Car" );
            Employee ceo = new CEO("Meera", 150000, 15);
            Console.WriteLine($"{mng.EmpNo}: {mng.EmpName} - Salary:{mng.CalcNetSalary()}");
            Console.WriteLine($"{gmng.EmpNo} : {gmng.EmpName} - Salary:{gmng.CalcNetSalary()}");
            Console.WriteLine($"{ceo.EmpNo} : {ceo.EmpName} - Salary:{ceo.CalcNetSalary()}");


        }
    }
}
