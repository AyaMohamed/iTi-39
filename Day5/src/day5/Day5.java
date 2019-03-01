/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 *
 * @author AyaMohamed
 */
public class Day5 {

    /**
     * @param args the command line arguments
     */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int y=0;
        for(int i=0;i<10;i++)
        {
            y=i+1;
            System.out.println(n+" x "+y+" = "+n*y);
        }
        scanner.close();
    }
    
}
