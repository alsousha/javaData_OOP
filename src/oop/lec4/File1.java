package oop.lec4;

import java.io.File;
import java.util.Scanner;

public class File1 {

    public static void main(String args[])
    {

        // try-catch block to handle exceptions
        try {

            // Create a file object
            File f = new File("c:\\tmp\\test.txt");
            Scanner s = new Scanner(f);

            int numOfElems = s.nextInt();
            System.out.println(numOfElems);


        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
