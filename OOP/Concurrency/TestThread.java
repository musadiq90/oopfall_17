package Concurrency;
public class TestThread{
    public static void main(String[] args) {
        RunnableDemo r1=new RunnableDemo("thread-1");
        r1.start();
        RunnableDemo r2 = new RunnableDemo("thread;2");
        r2.start();
    }

}

 class RunnableDemo implements Runnable {
    private Thread t;
    private String threadname;

    public RunnableDemo(String name) {
        this.threadname = name;
        System.out.println("creating :"+ threadname);
    }

    @Override
    public void run() {
        System.out.println("running :"+ threadname);
        try{
            for(int i=4;i>0;i--) {
                System.out.println("Thread: " + threadname + ",  " + i);
                Thread.sleep(50);
            }

        } catch (InterruptedException e) {
            System.out.println("thread "+threadname+" ; interrepted");
            //e.printStackTrace();
        }
        System.out.println("thread: "+threadname+" exiting");
    }
    public void start(){
        System.out.println("Starting "+threadname);
        if(t==null){
            t=new Thread(this, threadname);
            t.start();
        }
    }
}
