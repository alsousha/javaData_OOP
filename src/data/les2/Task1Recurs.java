package data.les2;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245

//o(n)
// IN THE FUNCTION EVERY CHECK IS O(1)
//AND WE CALL THE FUNCTION N TIMES

//return sum of even numbers of array
public class Task1Recurs {
    public static void main(String[] args) {
        int[] arr = {2, 5, 88, 1, 4, 0, 21};
        System.out.println(sumEven(arr, 7));
    }

    public static int sumEven(int[] arr, int size) {
        if (size == 0) return 0; //stop condition
        return ((arr[size - 1] % 2 == 0) ? arr[size - 1] : 0) + sumEven(arr, size - 1);//CALLING THE FUNCTION
    }
}
