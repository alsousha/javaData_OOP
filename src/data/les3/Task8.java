package data.les3;

//Bogdanov Alsu 333988939
//Barak Tsach 300096245

//function search key in array and return his index if num exist or -1 if it doesn't
//o(logn) because we are checking only half og array on each time
public class Task8 {
    static int BinarySearch_Rec(int[] array, int key, int left, int right)
    {
        int mid = left + (right - left) / 2;
        if (left >= right)
            return -1; //not exist num in array
        if (array[mid] == key)
            return mid; //find num and return his index
        else if (array[mid] > key)
            return BinarySearch_Rec(array, key, left, mid); //call fun with first half
        else
            return BinarySearch_Rec(array, key, mid + 1, right); //call fun with second half
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,10,34};
        System.out.println(BinarySearch_Rec(arr, 45, 0, arr.length));
    }





    }
