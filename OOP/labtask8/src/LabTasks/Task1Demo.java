package LabTasks;

public class Task1Demo {
    public static void main(String[] args) {
        try {
            Queue<Integer> q1 = new Queue<Integer>(2);
            q1.put(1);
            q1.put(4);
            System.out.println("Queue 1: "+q1);

            Queue q2 = new Queue(q1);
            System.out.println("Queue 2: "+q2);

            Character[] chArr = new Character[5];
            chArr[0]='a';
            chArr[1]='*';
            chArr[2]=41;
            chArr[3]='+';
            chArr[4]='\u2601';
            Queue<Character> q3 = new Queue<Character>(chArr);
            System.out.println("Queue 3: "+q3);

            q3.put('f');
            System.out.println(q3.getLast());

        }

        catch (QueueEmptyException e) {
            e.printStackTrace();
        }
        catch (QueueFullException e) {
            e.printStackTrace();
        }

    }
}