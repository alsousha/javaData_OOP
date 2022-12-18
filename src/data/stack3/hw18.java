package data.stack3;

import java.util.Scanner;
import java.util.Stack;


//Write an external function that receives a stack of sorted integers, so that the smallest number appears at the top of the stack. A function accepts as a parameter an additional integer. The function adds the number to the stack so that it remains sorted.
public class hw18 {
    public static void task_18(Stack<Integer> s, int num) {
        boolean flag = true;
        Stack<Integer> tmp = new Stack<Integer>();
        while (!s.isEmpty() && flag) {
            if (s.peek() < num) {
                tmp.push(s.pop());
            } else {
                s.push(num);
                flag = false;
            }
        }
        if (flag) s.push(num);
        while (!tmp.isEmpty())
            s.push(tmp.pop());
    }

    public static Stack<Integer> task_19() {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
        int num;
        do {
            System.out.print("Enter num: ");
            num = scan.nextInt();
            task_18(s, num);
        } while (num != -999);
        s.pop(); //take out -999

        return s;
    }

    public static void main(String[] args) {
        //Check task 18
        Stack<Integer> s = new Stack<Integer>();
        int[]arr = {99,77,65,45};
        int i;
        for(i=0;i<arr.length; i++){
            s.push(arr[i]);
        }
        System.out.println(s);
        task_18(s,70 );
        System.out.println(s);
        //end check task 18


        //System.out.println(task_19());
    }
}

