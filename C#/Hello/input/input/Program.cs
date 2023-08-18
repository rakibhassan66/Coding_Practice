using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace input
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Insert your text here ");
            String name = Console.ReadLine();
            Console.WriteLine("Welcome " +name);
            String ty = Console.ReadLine();
            Console.WriteLine(ty);
            Console.ReadLine();
        }
    }
}
