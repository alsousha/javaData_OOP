    package data.stack2;

    import java.util.Stack;

    public class hw20 {
        public static double tast_20(Stack<Double> s){
            double max = s.peek();

            while (!s.isEmpty()){
                max = (s.peek()>max) ? s.pop() : max;
            }


            return max;
        }

        public static void main(String[] args) {
            Stack<Double> s = new Stack<Double>();
            double[]arr = {99.43,77.67,65.8,45.23};
            int i;
            for(i=0;i<arr.length; i++){
                s.push(arr[i]);
            }
            System.out.println(tast_20(s));
        }
    }
