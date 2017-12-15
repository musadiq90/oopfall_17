package InputOutput;

import java.io.*;

public class A {
    String name;
    A(String name){
        this.name = name;
    }
}

class B extends A implements Serializable{
    int id;

    B(String name, int id) {
        super(name);
        this.id= id;
    }
}

class Main{
    public static void main(String[] args) {
     B obj = new B("musadiq",12979);

        ObjectOutputStream objectOut = null;
        try {
            objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\Musadiq Hussain\\Documents\\in.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectOut.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectOut.close( );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
