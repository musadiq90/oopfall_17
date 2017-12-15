package InnerClass;
/*
i have created an anonymous class which help me to print the val
 */
public class Phone {
    public void show() {
        System.out.println("call");
    }

    public static void main(String[] args) {
        Phone obj = new Phone(){
            public void show(){
                System.out.println("call, sms, camera, games");
            }
        };
        obj.show();

    }
}
  /*  class SmartPhone extends Phone {
     public void show(){
         System.out.println("call, sms, camera, games");
     }
    }

*/