using System;
delegate void sampleDel();
delegate void sampleDel2(String name);
internal class Program
{
    static void Main1() {

       // this is single delegate with void Method
        sampleDel obj = new sampleDel(Display);
        obj();

        // multipleDelegate calling
        // we can use multiDelegates only incase of void method implementations not for value return types

        sampleDel obj2 = Display;
        obj2 += Method2;
        obj2();
    
    }
    static void Display() {
        Console.WriteLine("Display is Called");
    }
    static void Method2() {
        Console.WriteLine("Method 2 is called");
    }

    static void Main2()
    {
        sampleDel2 samdel = Greet;
        samdel("Anjum");
        samdel += Welcome;
        samdel("MS.net");
    }

    static void Greet(string name) {
        Console.WriteLine("Hello " + name);
    }
    static void Welcome(string name) {
        Console.WriteLine("Welcome to " + name);
    }
}