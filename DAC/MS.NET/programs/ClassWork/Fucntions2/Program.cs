using System;

// creating value types structures and Enums

//Enums can only take values
class Program {
    public enum TimeOfDay { 
        Morning = 10,
        Afetrnoon = 20,
        Evening,
        Night
    }

    static void Display(TimeOfDay t) {
        if (t == TimeOfDay.Morning)
        {
            Console.WriteLine("Good Morning");
        }
        else if(t == TimeOfDay.Night) {

            Console.WriteLine("Good Night");
        }
    }
    static void Main() { 
        Display(TimeOfDay.Morning);
    }

}