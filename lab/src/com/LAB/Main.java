package com.LAB;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.println("enter an integer");
        int a = in.nextInt();
        int pro=1;
        if (a==0){
            System.out.println(1);
        }
        else for (int i=1; i<=a; i++){
            pro = pro *i;
        }
        System.out.println(pro);
    }
}
