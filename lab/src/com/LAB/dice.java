package com.LAB;
import java.util.Scanner;
public class dice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter an integer");
        int roll = in.nextInt();
        int die1;
        int die2;
        int sum;

        for (int i=1; i<=roll; i++){
            die1 = (int)(Math.random()*6)+1;
            die2 = (int)(Math.random()*6)+1;
            sum = die1+die2;

        }
    }
}
