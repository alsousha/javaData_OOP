package oop.anogramma;

public class Anogramma {
    public static void addCharsInTotalArr(int count, Character[] arrChars, Character[][] total, int j, int n) {
        int i = 0;
        int l;
        while (i < n) {
            for (l = 0; l < arrChars.length; l++) {
                for (int k = 0; k < count; k++) {
                    total[i++][j] = arrChars[l];
                }
            }
        }
    }
    public static void printChars(Character[] arrChars, int k, Character[][] total) {
        int n = (int) Math.pow(arrChars.length, k); // count of lines
        int count = n / arrChars.length; //count each char in first iteration
        int j = 0;  //first column
        while (count != 0) {
            addCharsInTotalArr(count, arrChars, total, j, n);
            count /= 2;
            j++;
        }
    }


    public static void ff2(Character[] arrChars, int k, Character[][] total, int j, int count){

    }
    public static void ff1(Character[] arrChars, int k, Character[][] total, int j, int count){


        if( count == (int) Math.pow(arrChars.length, k)/2){
            ff2(arrChars, k, total, j, count );
        }
        else{
           // ff2(arrChars, k, total,j);
        }
    }



    public static void f3chars(Character[] arrChars, int k, int count, int line,int numChar){
        if(numChar==0) System.out.println(arrChars[numChar]);
        else{
            f3chars(arrChars, k, count, line, numChar-1);
        }
    }
    public static void f2count(Character[] arrChars, int k, int count, int line){
        if(count==1) System.out.println();
        else{

        }
    }
    public static void f1line(Character[] arrChars, int k, int count, int line){


        if(k==1) System.out.println();
    }
    public static void printArr(Character[][] arr) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Character[] arrChars = {'a', 'b', 'c'};
        int k = 2;
        Character[][] total = new Character[(int) Math.pow(arrChars.length, k)][k];
        int n = (int) Math.pow(arrChars.length, k); // count of lines
        int count = n / arrChars.length; //count each char in first iteration
//        printChars(arrChars, k, total);
//        printArr(total);

    }
}
