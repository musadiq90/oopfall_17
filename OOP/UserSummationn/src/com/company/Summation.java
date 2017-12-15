package com.company;

public class Summation {


    int i, j;

    public Summation(int start, int end) {

     this.i=start;
     this.j=end;

    }
    public int total(int start, int end){
        int add=0;
        int sum=start;
        for (i =1; i<=(end-start);i++){

            add= start+i;
            sum=sum+add;
        }
        return sum;
    }
}
