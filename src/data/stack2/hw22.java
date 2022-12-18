package data.stack2;

import java.util.Stack;

public class hw22 {
    public static boolean task22(Stack<Integer> st, int num) {
        Stack<Integer> tmp = new Stack<Integer>();
        boolean flag = true;
        boolean start;
        boolean stop = false;
        while (!st.isEmpty() && !stop) {
            if(num % 10 == st.peek()){
                start = true;
                while(start){

                }
                num /= 10;
            }
            tmp.push(st.pop());


        }
        while (!tmp.isEmpty())
            st.push(tmp.pop());
        return flag;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        int[] arr = {8, 3, 4, 2};
        int i;
        for (i = 0; i < arr.length; i++)
            s1.push(arr[i]);
        System.out.println(task22(s1, 34));
        //System.out.println(s1);
    }
}
