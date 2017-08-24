package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        //First-name Middle-initial. Last-name
        String first; // Person’s first name
        String last; // Person’s last name
        String middle; // Person’s middle initial
        String firstLast; // Name in first-last format
        String lastFirst; // Name in last-first format
        String firstmidlast;
        BufferedReader in; // Input stream for strings
        in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first name: "); // Prompt for first name
        first = in.readLine(); // Get first name
        System.out.print("Enter last name: "); // Prompt for last name
        last = in.readLine(); // Get last name
        System.out.print("Enter middle initial: "); // Prompt for middle initial
        middle = in.readLine(); // Get middle initial
        firstLast = first + " " + last; // Generate first format
        System.out.println("Name in first-last format is " + firstLast);
        lastFirst = last + ", " + first + ", "; // Generate second format
        System.out.println("Name in last-first-initial format is " +
                lastFirst + middle + ".");
        Main printname = new Main();

        firstmidlast =  printname.name(first, middle, last);
        System.out.println("First-name Middle-initial. Last-name format is " + firstmidlast );
    }

    public static String name(String a,String b,String c) {
        String d = a +" "+ b+". "+c;
        return d;
    }


}
