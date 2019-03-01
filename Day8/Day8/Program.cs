using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day8
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<String, String> names = new Dictionary<string, string>();
            int num = 0;
            string name="", code="";
            num = Convert.ToInt32(Console.ReadLine());
            for(int i=0;i<num;i++)
            {
                string input = Console.ReadLine();
                string [] arr = input.Split(' ');
                name = arr[0];
                code = arr[1];
                names.Add(name, code);
            }

            string query = "";
            for(int i=0;i<num;i++)
            {
                query = Console.ReadLine();
                if(names.ContainsKey(query))
                {
                    string outputCode = names[query];
                    Console.WriteLine(query + "=" + outputCode);
                }
                else
                {
                    Console.WriteLine("Not found");
                }
            }
            


        }
    }
}
