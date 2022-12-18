package data.stack2;

import java.util.Stack;

public class hw14 {
    public static boolean task14(Stack<Integer> s1) {

        Stack<Integer> s2 = new Stack<Integer>();
        boolean flag = true;
        int x = s1.pop();
        while (!s1.isEmpty() && flag){
            flag = s1.peek()<x;
            x=s1.pop();
        }
        return flag;

    }
    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<Integer>();
        int[]arr = {45,52,76,98,122};
        int i;
        for(i=0;i<arr.length; i++)
            s1.push(arr[i]);
        System.out.println("origin stack:" + s1);
        ;
        System.out.println("stack after task14: " + task14(s1) );
    }
}
