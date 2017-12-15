package com.company;

import java.util.Scanner;

public class UserMultiplication{

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int start,end;
        System.out.println("Enter a number: ");
        start= scanner.nextInt();
        System.out.println("Enter another number: ");
        end= scanner.nextInt();

        Multiplication multiplication= new Multiplication(start,end);
        System.out.println("The sum of all numbers between "+start+" and "+end+" is: "+multiplication.product(start,end));
    }
}

