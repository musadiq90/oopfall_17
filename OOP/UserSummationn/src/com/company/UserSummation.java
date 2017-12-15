package com.company;

import java.util.Scanner;

public class UserSummation {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int start,end;
        System.out.println("Enter a number: ");
        start= scanner.nextInt();
        System.out.println("Enter another number greater than the previous one: ");
        end= scanner.nextInt();
        if (end<start ){
            System.out.println("ERROR!! You entered a number lesser than before ");
            System.exit(0);}

        Summation summation = new Summation(start,end);

        System.out.println("The sum of all numbers between "+start+" and "+end+" is: "+summation.total(start,end));
    }
}
