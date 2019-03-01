using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day10
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            int sum = 0;
            int max = 0;
            
            while(n>0)
            {
                if(n%2==1)
                {
                    sum++;
                    if(sum>max)
                    {
                        max = sum;
                    }
                }
                else
                {
                    sum = 0;

                }
                n /= 2;
            }
            Console.WriteLine(max);
        }
    }
}
