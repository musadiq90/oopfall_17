package LabTasks;

public class A1 {



    A1(){
      //  System.out.println("constructing A");
    }
    A1(int num){
       final int i =num;
    }

    public static void main(String[] args) {
        A1 a = new A1();

       B1 b = new B1(10);
        C1 c = new C1(20);
    }
}
