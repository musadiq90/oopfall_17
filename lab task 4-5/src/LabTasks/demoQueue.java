package LabTasks;

import java.util.Scanner;

public class demoQueue {
    public static void main(String[] args) {
        Queue1 y = new Queue1(10);

        System.out.println("enter your character ");
        Scanner inp = new Scanner(System.in);

        for (int i = 0 ; i<10 ; i++) {
            char z = inp.next().charAt(0);
            y.put(z);
        }
        Queue1 y1 = new Queue1(y);
        y1.get();
    }
}
