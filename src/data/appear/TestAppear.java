package data.appear;

import java.util.Stack;

public class TestAppear {
    public static Appear maxAppearInStack(Stack<Appear> st){
        Stack<Appear> tmp = new Stack<>();
       int max = st.peek().getCount();
       Appear maxElem = st.peek();

        while(!st.isEmpty()){
            if(st.peek().getCount()>max){
                max = st.peek().getCount();
                maxElem=st.pop();
            }else tmp.push(st.pop());
        }
        while (!tmp.isEmpty()){
            if(tmp.peek().equals(maxElem))
                tmp.pop(); //last elem
            else
                st.push(tmp.pop());
        }
        return maxElem;
    }
    public static Stack<Appear> sortStack(Stack<Appear> st){
        Stack<Appear> res = new Stack<>();
            while (!st.isEmpty()){
            res.push(maxAppearInStack(st));
            //st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        Stack<Appear> st = new Stack<>();
        st.push(new Appear("is", 5));
        st.push(new Appear("a", 1));
        st.push(new Appear("what", 6));
        st.push(new Appear("yes", 6));
        st.push(new Appear("no", 2));
        System.out.println(sortStack(st));
    }
}
