using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YouTubeEgitim
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int sayi1 = 10;
            int sayi2 = 20;
            sayi1 = sayi2;
            sayi2 = 100;

            int[] sayılar1 = { 1, 2, 3 };
            int[] sayılar2 = { 10, 20, 3 };
            sayılar1 = sayılar2;
            sayılar2[0] = 1000; 


            Console.WriteLine(sayi1);
            Console.WriteLine(sayılar1[0]);
            Console.ReadLine();

        }
    }

}
