package WrapperClass;

public class Wrapper2 {
    public static void main(String[] args) {
        Integer a =new Integer(3);
        int b = a.intValue();
        int c = b;
        System.out.println(a+"\n"+b+"\n"+c);
        //new code
        Integer x = 5;
        x = x+5;
        System.out.println(x);
    }
}
