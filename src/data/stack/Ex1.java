package data.stack;

import java.util.Stack;

public class Ex1 {
    public static boolean checkOpenBracket(char ch) {
        return ch == '{' || ch == '[' || ch == '(';
    }

    public static boolean checkCloseBracket(char ch) {
        return ch == '}' || ch == ']' || ch == ')';
    }

    public static boolean ifPair(char ch1, char ch2) {
        return (ch1 == '(' && ch2 == ')') || (ch1 == '[' && ch2 == ']') || (ch1 == '{' && ch2 == '}');
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        String str = "{(a+b)+c}*[2*{5-a}]][";
        //String str = "{(})";
        char ch, ch1;
        boolean flag = true;
        for (int i = 0; i < str.length() && flag; i++) {
            ch1 = str.charAt(i);
            if (checkOpenBracket(ch1)) s.push(ch1);
            else if (checkCloseBracket(ch1)) {
                if (!s.isEmpty()) {
                    ch = s.pop();
                    flag = ifPair(ch, ch1);
                } else flag = false;
            }

        }
        //System.out.println (s.isEmpty() ? "it is correct formula" : "it isn't correct formula");
        if (s.isEmpty()) System.out.println("it is correct formula");
        else System.out.println("it isn't correct formula");
    }
}
