/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;
import java.io.*;
import java.util.*;
/**
 *
 * @author AyaMohamed
 */
public class Day6 {

    /**
     * @param args the command line arguments
     */
    
    public static void getEvenString(String s)
    {
        for(int i=0; i<s.length();i++)
        {
            if(i%2 ==0)
            {
                System.out.print(s.charAt(i));
            }
        }
    }
    public static void getOddString(String s)
    {
        for(int i=0; i<s.length();i++)
        {
            if(i%2 !=0)
            {
                System.out.print(s.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s ="";
        scanner.nextLine();
        ArrayList<String> arrList = new ArrayList<String>();
        for(int i=0;i<num;i++)
        {
             s = scanner.nextLine();
             arrList.add(s);
             
        }
        for(int i=0;i<arrList.size();i++)
        {
            getEvenString(arrList.get(i));
             System.out.print(" ");
             getOddString(arrList.get(i));
             System.out.println("");
        }
        
    }
    
}
