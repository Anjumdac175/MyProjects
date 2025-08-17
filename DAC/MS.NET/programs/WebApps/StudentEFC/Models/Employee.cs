using System;
using System.Collections.Generic;

namespace StudentEFC.Models;

public partial class Employee
{
    public int EmpNo { get; set; }

    public string EmpName { get; set; } = null!;

    public decimal Basic { get; set; }

    public int DeptNo { get; set; }

    public virtual Department DeptNoNavigation { get; set; } = null!;
}
