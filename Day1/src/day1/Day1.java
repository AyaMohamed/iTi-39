/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;
import java.util.Scanner;
/**
 *
 * @author AyaMohamed
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=4;
        double d = 4.0;
        String s ="HackerRank";
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double j = scan.nextDouble();
        scan.nextLine();
        String str=scan.nextLine();
        
        System.out.println(i+num);
        System.out.println((double)j+d);
        System.out.println(s+str);
        
    }
    
}
