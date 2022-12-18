package data.stack2;

import java.util.Stack;

public class hw15 {
    public static void task15(Stack<Integer> s1) {

        Stack<Integer> s2 = new Stack<Integer>();
        int x = s1.pop();
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty())
            s1.push(s2.pop());


    }
    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<Integer>();
        int[]arr = {45,32,76,98,12};
        int i;
        for(i=0;i<arr.length; i++)
            s1.push(arr[i]);
        System.out.println("origin stack:" + s1);
        task15(s1);
        System.out.println("stack after task15: " + s1 );
    }
}
