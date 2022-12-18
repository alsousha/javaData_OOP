package oop.lec4.contact;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ContactTest {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\tmp\\contacts.txt";
        Contact c1 = new Contact("12345", "Ben", Group.OTHER);
        Contact c2 = new Contact("23456", "Dan", Group.FAMILY);
//        c1.save(fileName);
//        c2.save(fileName);

        //4
        File f = new File(fileName);
        PrintWriter pw = new PrintWriter(f);
//        c1.save(pw);
//        c2.save(pw);
//        pw.close();

        //5
//        File f = new File(fileName);
//        PrintWriter pw = new PrintWriter(f);
//        Contact c3 = new Contact(fileName);
//        Contact c4 = new Contact(fileName);
//        System.out.println(c3);
//        System.out.println(c4);

        //6
        Scanner s = new Scanner(f);
        Contact c3 = new Contact(s);
        Contact c4 = new Contact(s);
        System.out.println(c3);
        System.out.println(c4);

    }

}
