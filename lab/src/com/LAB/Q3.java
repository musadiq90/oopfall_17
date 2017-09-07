package com.LAB;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter an integer");
        int a = in.nextInt();
        int prod =1;
        int mod =1;
        for (int i=1; i<=12; i++){
            System.out.print("  "+i);
        }
        System.out.println();
        for (int i=1;i<=12;i++){
            System.out.print(i+"=> ");
            for (int j=1; j<=12; j++){
                prod = i*j;
                mod = prod %a;
                System.out.print(mod+"  ");
            }
            System.out.println();
        }
    }
}
