package data.stack2;

import java.util.Stack;

public class hw13 {
    public static Stack<Integer> task13(Stack<Integer> s1) {

        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();

        while (!s1.isEmpty()) {
            int x = s1.pop();
            s2.push(x);
            s3.push(x);
        }
        while (!s2.isEmpty()) {
            int x = s2.pop();
            s1.push(x);
        }


        return s3;
    }

    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<Integer>();
        int[]arr = {45,32,76,98,12};
        int i;
        for(i=0;i<arr.length; i++)
            s1.push(arr[i]);
        System.out.println("origin stack:" + s1);
        System.out.println("reverse stack: " + task13(s1));
    }
}