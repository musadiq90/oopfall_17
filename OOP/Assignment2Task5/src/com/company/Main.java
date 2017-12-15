package com.company;

import java.util.Scanner;

public class Main
{


    public Main(int numOfRolls){

    }
    public void implement(){
        Dice dice=new Dice();
        dice.roll();
        System.out.println(" The Sum is  "+dice.readResult());
        System.out.println();
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of dice rolls: ");
        int n = scanner.nextInt();

        Main main = new Main(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Rolling : " + (i+1));
            main.implement();


        }

    }
}
