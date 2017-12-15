package Concurrency;

public class Drink {
    public static void main(String[] args) {
        System.out.println("i am main");
        Coffee t1 = new Coffee("wawa coffee");

        Tea t2 = new Tea("study time tea");
        t1.start();
        t2.start();
        System.out.println("main is done");
    }
}
class Coffee extends Thread {
    Coffee(String name){
        super(name);
    }
    public void run(){
        for(int i=1; i<=3; i++){
            System.out.println("i like coffee");
            yield();
            System.out.println(this.getName());
            yield();
        }
    }
}
class Tea extends Thread {
    Tea(String name){
        super(name);

    }
    public void run(){
        for (int i=1; i<=3; i++){
            System.out.println("i like tea");
            yield();
            System.out.println(this.getName());
            yield();
        }
    }
}
