//using System.Runtime.Serialization.Formatters.Binary;

//namespace SerializationExample
//{
//    [Serializable]
//    public class Student {
//        public int RollNo;
//        public string Name;
//        public string City;

//        public void show() {
//            Console.WriteLine($"Student[ {RollNo}, {Name}, {City}]");
//        }
//    }
//    internal class BinarySerializationExample
//    {
//        static void Main1()
//        {
//            string file = "student.dat";
//            Student student = new Student { RollNo = 175, Name = "Anjum", City = "AP" };

//            using (FileStream fs = new FileStream(filePath, FileMode.Create))
//            {
//                BinaryFormatter formatter = new BinaryFormatter();
//                formatter.Serialize(fs, s1);
//                Console.WriteLine("✅ Object serialized to file.");
//            }

//            // 3️⃣ Deserialize object from file
//            using (FileStream fs = new FileStream(filePath, FileMode.Open))
//            {
//                BinaryFormatter formatter = new BinaryFormatter();
//                Student s2 = (Student)formatter.Deserialize(fs);
//                Console.WriteLine("✅ Object deserialized from file:");
//                s2.Show();
//            }
//        }
//    }
//}
