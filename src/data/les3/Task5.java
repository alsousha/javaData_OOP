package data.les3;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245
//print nums that has positive num after and negative num before

//o(n)
// IN THE FUNCTION EVERY CHECK IS O(1)
//AND WE CALL THE FUNCTION N TIMES

public class Task5 {
    public static void task5(int[] arr, int size) {
        if (size == 2) System.out.println(); //stop recursion
        else {
            if (arr[size - 1]  > 0 && arr[size - 3] < 0) System.out.println(arr[size - 2]); //check neighbours
            task5(arr, size - 1); //call function
        }
    }

    public static void main(String[] args) {
        int[] arr = {-3, 5, 7, -2, 11, -8, -5, 3, 5, 3, -8, -4, 54, 0, 5, -5};
        task5(arr, arr.length);

    }
}
