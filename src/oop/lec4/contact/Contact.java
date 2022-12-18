package oop.lec4.contact;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Contact {
    private String phoneNumber;
    private String owner;
    private Group group;


    public Contact(String phoneNumber, String owner, Group group) {
        this.phoneNumber = phoneNumber;
        this.owner = owner;
        this.group = group;
    }

    //
    public Contact(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner s = new Scanner(f);
        phoneNumber = s.nextLine();
        owner = s.nextLine();
        //group = (Group) s.nextLine();
        group = Group.getEnum(s.nextLine());
        s.close();
    }

    public Contact(Scanner s) {
        phoneNumber = s.nextLine();
        owner = s.nextLine();
        group = Group.getEnum(s.nextLine());
    }


    public void save(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        PrintWriter pw = new PrintWriter(f);
        pw.println(phoneNumber + "\n" + owner + "\n" + group);

        pw.close();

    }
    public void save(PrintWriter pw) throws FileNotFoundException{
        pw.println(phoneNumber + "\n" + owner + "\n" + group);
    }

    public String toString() {
        return phoneNumber + " " + owner + " " + group;
    }
}
