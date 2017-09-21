package LabTasks;

import java.util.Scanner;

public class Queue {
    private char[] q;
    private int putloc= -1;

    public Queue(){
        q = new char[10];
    }

    public Queue(int a){
        q = new char[a];
    }
    public void put(char c){
        if (isFull()){
            System.out.println("queue is full");
        }
        else{
            putloc++;
            q[putloc] = c;
        }
    }

    public boolean isFull(){
        if(putloc == q.length-1)
            return true;
        else return false;
    }

    public void get(){
        if(putloc==-1){
            System.out.println("queue is empty");
        }
        else {
            System.out.println(q[putloc]);
        }
    }


}
