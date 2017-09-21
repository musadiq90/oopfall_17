package LabTasks;

public class A {
    A(){
        System.out.println("constructing A");
}

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
    }
}
