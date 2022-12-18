package data.les3;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245

//function return the max num in array by 3 ways:
//a. linear search //o(n)
//b. divide by two search //o(n)
//c. thw separate halfs //o(n*logN) because we are searching halfs of array n times.

public class Task7 {
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    //a. linear search
    public static int task7_a(int[] arr, int size) {
        if (size == 2) return max(arr[0], arr[1]);
        else return max(arr[size - 1], task7_a(arr, size - 1));

    }
    //b. divide by two search
    public static  int task7_b(int[] arr, int size){
        if(size==arr.length/2) return arr[arr.length/2]; //odd number
        if(size==arr.length/2+1) return max(arr[arr.length -size], arr[size-1]); //even number
        else return max(max(arr[arr.length -size], arr[size-1]),task7_b(arr,size-1));
    }


    //c. thw separate halfs
    public static int task7_b2(int arr[], int i, int j) {
        //stop recursion
        if (i == j) {
            return arr[i];
        }

        //get middle array position
        int m = (i + j) / 2;

        //Call function with reduced size
        int left_max = task7_b2(arr, i, m);
        int right_max = task7_b2(arr, m + 1, j);

        //finding the max of two halfs
        if (left_max > right_max) {
            return left_max;
        } else {
            return right_max;
        }
    }


    public static void main(String[] args) {
        int[] arr = {45, 57, 70, 800, 110, 76, 609};
        System.out.println(task7_a(arr, arr.length));
        System.out.println(task7_b2(arr,0, arr.length-1));
        System.out.println(task7_b(arr, arr.length));
    }
}
