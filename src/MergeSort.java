public class MergeSort {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    // Recursive merge sort function
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2; // Find the middle point

            // Recursively sort the left and right halves
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    // Merge function to combine two sorted subarrays
    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1; // Size of left subarray
        int n2 = right - middle;   // Size of right subarray

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = array[middle + 1 + j];

        // Merge the temp arrays back into the original array
        int i = 0, j = 0;
        int k = left; // Initial index of merged subarray
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray (if any)
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray (if any)
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Utility function to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
