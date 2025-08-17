using System;
namespace Generics {

    public class MyStack<T>
    {
        T[] arr;
        int top;
        public MyStack(int size)
        { 
            arr = new T[size];
            top = -1;
        }
        public void Push(T element) {
            if (top == arr.Length-1)
            {
                Console.WriteLine("Stack OVerFlow");
                return;
            }
            arr[++top] = element;
        }
        public T Pop() {
            if (top == -1) {
                Console.WriteLine("Stack UnderFlow");
            }
            //Console.WriteLine("Deleted element is: " + top);
            return arr[top--];
        
        }
             
    }
    internal class Program {
        static void Main() {
            MyStack<int> obj = new MyStack<int>(5);
            Console.WriteLine("Enter the ele into the stack");
            for (int i = 0; i < 5; i++) {
                int ele = Convert.ToInt32(Console.ReadLine());
                obj.Push(ele);
            }
          
            Console.WriteLine("Element deleted are: " + obj.Pop());

        }
    
    }

}
