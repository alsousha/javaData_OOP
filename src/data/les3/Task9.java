package data.les3;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245
//סיבוחיות O(nlogn)
//  every time we get 2 subarrays till we get only array with 1 length.

// Merges two subarrays of arr[] with recursion.
// First subarray with index from left to mid, second - from mid+1 to right
class Task9 {

    public static void merge(int arr[], int l, int m, int r) {
        // size of two subarrays
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int left[] = new int[n1];
        int right[] = new int[n2];

        //Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            right[j] = arr[m + 1 + j];


        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // sort arr
    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Origin Array");
        printArray(arr);

        sort(arr, 0, arr.length - 1);

        System.out.println();
        System.out.println("Sorted array");
        printArray(arr);
    }
}

