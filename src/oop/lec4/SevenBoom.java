package oop.lec4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class SevenBoom {
    public static boolean checkDigitsInNum(int num){
        boolean flag = true;
        int i;
        while (num>0 && flag){
            flag = (num%10 == 7) ? false : flag;
            num /=10;
        }
        return !flag;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("c:\\tmp\\boomfile.txt");
        System.out.println(f.getPath());
        int num = 727;
        int i;

        PrintWriter pw = new PrintWriter(f);
        for (i = 0; i <= num; i++) {
            if(checkDigitsInNum(i) || i%7==0) pw.print("Boom \r\n");
            else pw.print(i+ "\r\n");
        }
        pw.close();
    }
}
