package data.stack2.hw23;

import java.util.Stack;

public class hw23 {
    public static int lastAndRemove(Stack<Integer> st) {
        Stack<Integer> tmp = new Stack<Integer>();
        while (!st.isEmpty()) {
            tmp.push(st.pop());
        }
        int res = tmp.pop();
        while (!tmp.isEmpty())
            st.push(tmp.pop());

        return res;
    }
    public static Stack<TwoItems> stackTwoItems (Stack<Integer> stk1){
        Stack<TwoItems> res = new Stack<TwoItems>();
        while (!stk1.isEmpty()){
            res.push(new TwoItems(lastAndRemove(stk1),stk1.pop()));
        }
        return res;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        int[] arr = {8, 3, 4, 2,5,2,6,4,1,7};
        int i;
        for (i = 0; i < arr.length; i++)
            s1.push(arr[i]);
        System.out.println(stackTwoItems(s1));
    }
}
