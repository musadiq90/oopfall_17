package LabTasks;

import java.util.ArrayList;
import java.util.List;


public class Task2Demo {
    public static void main(String[] args) {
        MyCollection myCollection= new MyCollection();
        List<Integer> intLst = new ArrayList<>();
        intLst.add(5);
        intLst.add(22);
        intLst.add(2);
        intLst.add(5);
        intLst.add(-4);
        intLst.add(0);
        System.out.println(myCollection.min(intLst,Integer::compareTo));
        System.out.println(myCollection.max(intLst,Integer::compareTo));
        Summer<Integer> intSum = new IntSummer();
        System.out.println(myCollection.sum(intLst,intSum));

        List<Double> doubleLst = new ArrayList<>();
        doubleLst.add(5.1);
        doubleLst.add(2.2);
        doubleLst.add(-5.0);
        doubleLst.add(5.12);

        System.out.println(myCollection.min(doubleLst,Double::compareTo));
        System.out.println(myCollection.max(doubleLst,Double::compareTo));
        Summer<Double> douSum = new DoubleSummer();
        System.out.println(myCollection.sum(doubleLst));

        List<String> strLst = new ArrayList<>();
        strLst.add("an");
        strLst.add("bat");
        strLst.add("can");
        strLst.add("a");
        strLst.add("zebra");
        strLst.add("good");
        System.out.println(myCollection.min(strLst,String::compareTo));
        System.out.println(myCollection.max(strLst,String::compareTo));
        Summer<String> strSum = new StringSummer();
        System.out.println(myCollection.sum(strLst,strSum));


    }
}
