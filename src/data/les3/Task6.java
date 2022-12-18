package data.les3;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245
//function return true if x and y are neighbours in array

//o(n)
// IN THE FUNCTION EVERY CHECK IS O(1)
//AND WE CALL THE FUNCTION N TIMES
public class Task6 {
    public static boolean task6(int[]arr, int size, int x, int y){
        if(size==1)return false; //stop recursion
        else if((arr[size-1]==y && arr[size-2]==x) || (arr[size-1]==x && arr[size-2]==y)) return true;
        else return task6(arr,size-1,x,y); //call function
    }

    public static void main(String[] args) {
        int[] arr = {-3, 5, 7, -2, 11, -8, -5, 3, 5, 3};
        System.out.println(task6(arr, arr.length, 7, -5));
    }
}
