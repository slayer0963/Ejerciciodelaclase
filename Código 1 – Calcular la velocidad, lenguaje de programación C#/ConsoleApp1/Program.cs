using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            double d=0;
            int t=0;
            Console.WriteLine("Ingrese la distancia");
            d = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Ingrese la tiempo");
            t = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("La velocidad es " + (d / t) +"k/h");
            Console.ReadKey();

        }
    }
}
