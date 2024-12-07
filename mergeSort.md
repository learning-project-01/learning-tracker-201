 ### MergeSort
  
  **example**
  ```java
  public class MergeSort
  {
     public static void main(String[] args)
     {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
      }

       // Merge Sort function
       public static void mergeSort(int[] arr, int left, int right)
       {
           if (left < right)
           {
              // Find the middle point
              int mid = (left + right) / 2;
  
              // Recursively sort the two halves
              mergeSort(arr, left, mid);
              mergeSort(arr, mid + 1, right);
  
              // Merge the sorted halves
              merge(arr, left, mid, right);
           }
       }

        // Merge function to combine two sorted subarrays
        public static void merge(int[] arr, int left, int mid, int right)
        {
          // Sizes of the two subarrays
          int n1 = mid - left + 1;
          int n2 = right - mid;
  
          // Temporary arrays
          int[] leftArray = new int[n1];
          int[] rightArray = new int[n2];
  
          // Copy data to temporary arrays
          for (int i = 0; i < n1; i++) leftArray[i] = arr[left + i];
          for (int j = 0; j < n2; j++) rightArray[j] = arr[mid + 1 + j];
  
          // Merge the temporary arrays
  
          int i = 0, j = 0; // Initial indices of subarrays
          int k = left;     // Initial index of merged array
  
          while (i < n1 && j < n2)
          {
              if (leftArray[i] <= rightArray[j])
              {
                  arr[k] = leftArray[i];
                  i++;
              }
             else
             {
                  arr[k] = rightArray[j];
                  j++;
              }
              k++;
          }

          // Copy remaining elements of leftArray
           while (i < n1)
           {
              arr[k] = leftArray[i];
              i++;
              k++;
           }

        // Copy remaining elements of rightArray
        while (j < n2)
        {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
     }

      // Utility function to print an array
      public static void printArray(int[] arr)
      {
         for (int num : arr)
         {
            System.out.print(num + " ");
         }
         System.out.println();
     }
}
```
