package com.LAB;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter an integer");
        int a = in.nextInt();
        int sum=0;
        for (int i=0; i<=a; i++){
            sum =sum +i;
        }
        System.out.println(sum);
    }
}
