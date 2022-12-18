package data.stack2;

import java.util.Stack;

public class hw16 {
    public static void task16(Stack<Integer> s1) {

        Stack<Integer> s2 = new Stack<Integer>();

        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int x = s2.pop();

        while (!s2.isEmpty())
            s1.push(s2.pop());
        s1.push(x);

    }
    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<Integer>();
        int[]arr = {45,32,76,98,12};
        int i;
        for(i=0;i<arr.length; i++)
            s1.push(arr[i]);
        System.out.println("origin stack:" + s1);
        task16(s1);
        System.out.println("stack after task16: " + s1 );
    }
}
