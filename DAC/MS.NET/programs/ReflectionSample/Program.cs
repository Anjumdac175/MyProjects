using System.Reflection;

namespace ReflectionSample
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Assembly assm1 = Assembly.GetExecutingAssembly();
            //Assembly assm2 = Assembly.GetEntryAssembly();
            //Assembly assm3 = Assembly.GetCallingAssembly();
            //Assembly assm4 = Assembly.GetAssembly(typeof(int));
            Assembly assm5 = Assembly.LoadFile("C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\Ms.NET\\programs\\Delegates\\Delegates\\bin\\Debug\\net9.0\\Delegates.dll");
            Console.WriteLine(assm5.FullName);
            Console.WriteLine(assm5.GetName().Name);
            Type[] arrTypes = assm5.GetTypes();
            foreach (Type type in arrTypes)
            {
                Console.WriteLine(" "+type.Name);
                MethodInfo[] arrMethods = type.GetMethods();
                foreach (MethodInfo m in arrMethods)
                {
                    Console.Write(" "+m.Name);
                }
                
            }
        }
    }
}
