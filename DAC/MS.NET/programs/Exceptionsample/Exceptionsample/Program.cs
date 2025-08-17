using System;

public class AgeTooSmallException : Exception { 
    public AgeTooSmallException(String message) : base(message) {}

    internal class Program {
        static void Main() {

            string name = null;
            string age = "Twenty";
            String[] subject = { "Maths", "Science" };
            object score = "100";

            try
            {

                // 1. NullReferenceException
                Console.WriteLine($"Name Length: {name.Length}");

                // 2. FormatException
                int years = int.Parse(age);

                // 3. custom Exception
                if (years < 18)
                {
                    throw new AgeTooSmallException("Age must be more than 18");
                }

                // 4. IndexOutofRangeException

                Console.WriteLine($"Subjects: {subject[2]}");

                // 5. InvalidCastException
                int marks = (int)score;

                // 6. DivideByZeroException
                int a = 100;
                int b = 0;
                int res = a / b;
                Console.WriteLine($"Result: {res}");
            }
            catch (NullReferenceException ex)
            {
                Console.WriteLine("Null Reference Exception: " + ex.Message);
            }
            catch (FormatException ex)
            {
                Console.WriteLine("Format Exception: " + ex.Message);
            }
            catch (AgeTooSmallException ex)
            {
                Console.WriteLine("Custom exception: " + ex.Message);
            }
            catch (IndexOutOfRangeException ex)
            {

                Console.WriteLine("Index out of Bound Exception " + ex.Message);
            }
            catch (InvalidCastException ex)
            {
                Console.WriteLine("TypeCast Exception: " + ex.Message);
            }

            catch (DivideByZeroException ex)
            {
                Console.WriteLine("DivideByZeroException: " + ex.Message);
            }
            finally { 
                Console.WriteLine("Student exceptions are Completed");
            }
            
        }
        
    }
}
