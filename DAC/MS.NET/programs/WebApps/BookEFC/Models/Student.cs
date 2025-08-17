using System;
using System.Collections.Generic;

namespace BookEFC.Models;

public partial class Student
{
    public int RollNo { get; set; }

    public string Name { get; set; } = null!;

    public int Age { get; set; }

    public string Email { get; set; } = null!;
}
