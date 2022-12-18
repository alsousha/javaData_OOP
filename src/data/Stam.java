package data;

import java.util.Stack;

public class Stam {
    public static int[] getUnicEllInArr(int[] arr1, int[]arr2){
        int[] tmp = new int[arr1.length+ arr2.length];
        int counter=0;
        boolean flag = true;
        int i,l;
        int k=0;
        tmp[0]=arr1[0];
        for (i=1; i< arr1.length;i++){
            for(int j=0; j<=k && flag;j++){
                if(arr1[i] == tmp[j])
                    flag = false;
            }
            //k++;
            if(flag){
                tmp[++k] = arr1[i];
               // k++;
            }
            flag=true;

        }
        flag=true;
        for (l=0; l< arr2.length;l++){
            for(int j=0; j<=k && flag;j++){
                if(arr2[l] == tmp[j])
                    flag = false;
            }
            if(flag){
                tmp[++k] = arr2[l];
            }
            flag=true;

        }
        return tmp;


    }

    public static void printArr(int[]arr){
        int i;
        for (i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean secret1(int num, int digit){
        if(num<10)
            return (num%2==digit%2);
        if(num%2!=digit%2)
            return false;
        return secret1(num/10, digit);
    }
    public static boolean secret2(Stack<Integer> s){
        boolean ok;
        int x;
        if(s.isEmpty())
            ok=true;
        else{
            x=s.pop();
            if(!(secret1(x,x%10))) ok = false;
            else ok=secret2(s);
        }
        return ok;
    }
    public static void main(String[] args) {
//        int[]arr1 = {1,5,1,4};
//        int[] arr2 = {2,4,3,5,7,1,9};
//
//        printArr(getUnicEllInArr(arr1,arr2));
        Stack<Integer> s1 = new Stack<Integer>();
        int[] arr = {426, 15,531,246};
        int i;
        for (i = 0; i < arr.length; i++)
            s1.push(arr[i]);
        System.out.println(secret2(s1));
    }
}
