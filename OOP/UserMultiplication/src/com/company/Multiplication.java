package com.company;

public class Multiplication {

    int i, j;

    public Multiplication(int start, int end) {

        this.i = start;
        this.j = end;
    }

    public int product(int start, int end) {
        int add;
        int sum = start;
        for (i = 1; i <= (end - start); i++) {

            add = start + i;
            sum = sum * add;
        }
        return sum;
    }
}
