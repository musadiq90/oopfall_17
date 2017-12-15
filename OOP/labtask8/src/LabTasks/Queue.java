package LabTasks;

public class Queue<T> {

    private T[] q;
    private int putLoc;
    private int getLoc;


    public Queue(int size){
        q=(T[])new Object[size];
        putLoc=0;
        getLoc=-1;
    }


    public Queue(Queue<T> o){
        q=(T[])new Object[o.q.length];
        for(int i=0;i<o.q.length;i++)
            q[i]=o.q[i];
        putLoc=o.q.length;
        getLoc=o.q.length-1;
    }


    public Queue(T[] arr){
        q=(T[])new Object[arr.length];
        for(int i=0;i<arr.length;i++)
            q[i]=arr[i];
        putLoc=arr.length;
        getLoc=arr.length-1;
    }

    public T getLast() throws QueueEmptyException{
        if(getLoc==-1){
            throw new QueueEmptyException("Task1.Queue is empty.");
        }
        else
            return q[getLoc];
    }


    public void put(T ch) throws QueueFullException{
        if(putLoc<q.length) {
            q[putLoc] = ch;
            getLoc++;
            putLoc++;
        }
        else
            throw new QueueFullException("Task1.Queue is full.");
    }


    public String toString(){
        String str="";
        if(getLoc==-1)
            return str;
        for(int i=0;i<=getLoc;i++){
            str+=q[i]+" ";
        }
        return str;
    }

}