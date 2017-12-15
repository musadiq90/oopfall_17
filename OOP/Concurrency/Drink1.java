package Concurrency;

public class Drink1 {
    public static void main(String[] args) {
        System.out.println("i am main");
        Coffee t1 = new Coffee("wawa coffee1");

        Tea t2 = new Tea("study time tea1");
        t1.start();
        t2.start();
        System.out.println("main is done");
    }
}
class Coffee1 extends Thread {
    Coffee1(String name){
        super(name);
    }
    public void run(){
        for(int i=1; i<=3; i++){
            System.out.println("i like coffee1");
            try{
                sleep(10000);
            }
            catch(InterruptedException e){

            }
            System.out.println(this.getName());

        }
    }
}
class Tea1 extends Thread {
    Tea1(String name){
        super(name);

    }
    public void run(){
        for (int i=1; i<=3; i++){
            System.out.println("i like tea");

            System.out.println(this.getName());


        }
    }
}
