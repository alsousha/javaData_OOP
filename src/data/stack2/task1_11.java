package data.stack2;

import java.util.Stack;

public class task1_11 {
    public static void sod(Stack<Integer> s1){
        Stack<Integer> s2 = new Stack<Integer>();
        while(!s1.isEmpty()){
            int x = s1.pop();
            if (!s1.isEmpty()){
                int y = s1.pop();
                s2.push(y);
            }else s2.push(x);
            s2.push(x);
        }
        while(!s2.isEmpty())
            System.out.print(s2.pop() + " ");
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        //int[]arr = {10,54,8,24,65,2};
        int[]arr = {45,32,76,98,12};
        int i;
        for(i=0;i<arr.length; i++)
            s.push(arr[i]);

        //System.out.println(s);
        sod(s);

    }

}


