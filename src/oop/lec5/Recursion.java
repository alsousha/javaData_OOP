package oop.lec5;

public class Recursion {
    public static void printSpase(int count){
        if(count==0|| count == -1){
            System.out.print("");
        }
        else if (count == 1 ) {
            System.out.print("1");
        } else {
            printSpase(count - 1);
            System.out.print("1");
        }
    }
    public static void printChar(char c, int num, int count) {
        if (num == 1) {
            System.out.print(c);


        } else {
            printChar(c, num - 1, count);
            System.out.print(c);
        }
    }

    public static void bottle(char ch, int num, int count) {
        if (num == 1){
            printSpase((count - num)/2);
            System.out.println(ch);
        }
        else {
            printSpase((count - num)/2);
            printChar(ch, num, count);
            System.out.println();

            bottle(ch, num - 2, count);
            printSpase((count - num)/2);
            printChar(ch, num, count);
            System.out.println();
        }
    }
    public static void printReverseStr(String str){
        if(str.length()==1) System.out.print(str);
        else {
            printReverseStr(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    public static void main(String[] args) {
        //bottle('@', 5,  5);
        printReverseStr("wert");
    }
}
