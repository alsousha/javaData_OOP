package data.les2;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245

//Print item from array that bigger his neighbors
//o(n)
// IN THE FUNCTION EVERY CHECK IS O(1)
//AND WE CALL THE FUNCTION N TIMES
public class Task2Recurs {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 10, 202, 139};
        task2(arr, 6);

    }

    public static void task2(int[] arr, int size) {
        if (size == 2) System.out.print(""); //stop recursion
        else {
            System.out.print(arr[size - 1] < arr[size - 2] && arr[size - 2] > arr[size - 3] ? arr[size - 2] + " " : "");
            task2(arr, size - 1);
        }
    }
}
