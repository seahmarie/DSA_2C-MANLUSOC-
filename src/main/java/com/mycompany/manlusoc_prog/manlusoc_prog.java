/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manlusoc_prog;
import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class manlusoc_prog {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int x;
        int y;
        System.out.print("Enter a number");
        x = input.nextInt();
        System.out.print("Enter a number");
        y = input.nextInt();
        
        int sum;
        int sub;
        int mul;
        int div;
        
        sum = x + y;
        System.out.println("sum is" + sum);
        sub = x - y;
        System.out.println("sum is" + sub);
        mul = x * y;
        System.out.println("sum is" + mul);
        div = x / y;
        System.out.println("sum is" + div);
        
    }
}
