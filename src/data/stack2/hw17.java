package data.stack2;

import java.util.Stack;

public class hw17 {
    public static boolean task_17(Stack<String> s1, Stack<String> s2) {
        boolean flag = true;
        Stack<String> tmp = new Stack<String>();
        while (!s1.isEmpty() && !s2.isEmpty() && flag) {
            if (s1.peek().equals(s2.peek())) {
                tmp.push(s1.pop());
                s2.pop();
            } else {
                flag = false;
            }
        }
        if(!s1.isEmpty() || !s2.isEmpty()) flag = false;
        while (!tmp.isEmpty()){
            s1.push(tmp.peek());
            s2.push(tmp.pop());
        }

        return flag;
    }

    public static void main(String[] args) {
        Stack<String> s1 = new Stack<String>();
        Stack<String> s2 = new Stack<String>();
        String[]arr = {"sd","ee","eew"};
        int i;
        //s2.push("sdf");
        for(i=0;i<arr.length; i++){
            s1.push(arr[i]);
        }
        String[]arr2 = {"sd","ee","eew"};
        for(i=0;i<arr.length; i++){
            s2.push(arr2[i]);
        }

        System.out.println(task_17(s1, s2));

    }
}
