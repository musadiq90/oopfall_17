package Concurrency;

class Q{
    int num;

    public void put(int num){
        this.num= num;
    }
    public int get(){
        return num;
    }
}
class Producer implements Runnable {
 Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread((Runnable) q,"Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            q.put(i++);
            try {Thread.sleep(1000);}
                catch(Exception e){

                }
        }
    }
}
class Consumer implements Runnable{
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread((Runnable) q,"Consumer");
        t.start();

    }

    @Override
    public void run() {
    while(true){
        q.get();

    }
    }
}
public class InterThread {
    public static void main(String[] args) {

    }
}
