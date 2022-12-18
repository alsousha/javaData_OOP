package data.les2;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245

//o(n)
// IN THE FUNCTION EVERY CHECK IS O(1)
//AND WE CALL THE FUNCTION N TIMES

//True if neighboring elements of array dividing by 10 or return false
public class Task3 {
    public static void main(String[] args) {
        int[] arr = {259,3, 52, 7, 20, 109};
        System.out.println(task3(arr, 6));
    }

    public static boolean task3(int[] arr, int size) {
        if ((arr[size - 1] + arr[size - 2]) % 10 == 0) return true;
        else if (size == 2) return false;
        else return task3(arr, size - 1);
    }
}

