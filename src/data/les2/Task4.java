package data.les2;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245

//o(n)
// IN THE FUNCTION EVERY CHECK IS O(1)
//AND WE CALL THE FUNCTION N TIMES

//return sum of all items of array that dividing by 10
public class Task4 {
    public static void main(String[] args) {
        int[] arr = {20, 5, 50, 8, 20, 10};
        System.out.println(task3(arr, 6));
    }

    public static int task3(int[] arr, int size) {
        if (size == 0) return 0; //stop condition
        else return arr[size - 1] % 10 == 0 ? arr[size - 1] + task3(arr, size - 1) : task3(arr, size - 1);
    }
}