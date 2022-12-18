package data.stack3;

import java.util.Stack;

public class hw22 {
    public static boolean isAllNumExistsInStack(Stack<Integer> st, int num, Stack<Integer>tmp){
        boolean flag = true;
        while(num>0 && flag && !st.isEmpty()){
            flag = st.peek() == num%10;
            tmp.push(st.pop());
            num /= 10;
        }
        return flag && num==0; //check that we checked all digits in num
    }
    public static void returnElemToOriginStack(Stack<Integer> st, Stack<Integer> tmp){
        while (!tmp.isEmpty()){
            st.push(tmp.pop());
        }
    }
    public static boolean checkStackOneDirection(Stack<Integer> st, int num, Stack<Integer> tmp){
        while (!st.isEmpty()){
            if(st.peek()==num%10){
                if(isAllNumExistsInStack(st, num, tmp)){
                    returnElemToOriginStack(st,tmp);
                    return true; //found num
                }
            }else {
                tmp.push(st.pop());
            }
        }
        return false; //not found num in this direction
    }
    public static boolean hw22(Stack<Integer> st, int num){
        Stack<Integer> tmp = new Stack<Integer>();
        //check two direction of stack
        return checkStackOneDirection(st,num,tmp) || checkStackOneDirection(tmp,num,st) ;

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        int[]arr = {3,5,2,4};
        int i;
        for(i=0;i<arr.length; i++){
            s.push(arr[i]);
        }
        System.out.println(hw22(s, 24));
    }
}
