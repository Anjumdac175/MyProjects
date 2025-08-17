using System;

class Program {

    static void Main1() {
        int? i = 10;
        i = null;

        int j;

        // 1. type to check
        if (i != null)
            j =(int)i;
            else
                j = 0;

        // 2.another type

        if (i.HasValue)
            j = i.Value;
        else
            j = 0;


        // 3. another type
        // if i has value give it or else set to default
        j = i.GetValueOrDefault();
        j = i.GetValueOrDefault(100);


        //4. another type
        j = i ?? 0; // null coalasence operator

        Console.WriteLine(j);
    }
    static void Main() {
        String s; // nullable reference type
        s = null;
        s = Console.ReadLine(); // Console.ReadLine()!; this is called bang operator. is used to clear null warnings for this line only
        //Console.WriteLine(s);
    }
}