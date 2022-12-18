package data.stack3;

import java.util.Stack;

public class hw20 {
    //O(n) checking this stack one time
    public static double tast_20(Stack<Double> s) {
        Stack<Double> tmp = new Stack<Double>();
        double max = s.peek();
        double num;

        while (!s.isEmpty()) {
            tmp.push(s.peek());
            num=s.pop();
            max = (num > max) ? num : max;
        }
        while(!tmp.empty()){
            if(tmp.peek()!=max)
                s.push(tmp.pop());
            else tmp.pop();
        }
        return max;
    }

    //Task 21 -> O(n^2) because loop nested
    public static Stack<Double> task21(Stack<Double> s) {
        Stack<Double> res = new Stack<Double>();
        while (!s.empty()) {
            res.push(tast_20(s));
        }
        return res;
    }

    public static void main(String[] args) {
        Stack<Double> s = new Stack<Double>();
        double[] arr = {99.43, 177.67, 65.8, 345.23};
        int i;
        for (i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }
       System.out.println(task21(s));
    }
}

