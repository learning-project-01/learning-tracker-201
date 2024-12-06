### Insertion sorting
- The array is divided into two parts:
  
   **Sorted part:** Initially contains only the first element.
  
   **Unsorted part:** The rest of the elements that need to be sorted.
  
- The algorithm picks each element from the unsorted part and compares it with elements in the sorted part to find its correct position.
- It shifts elements of the sorted part as needed to make space for the element being inserted.
- The process is repeated until all elements are sorted.

**example**
```java
public class InsertionSort
{
    public static void insertionSort(int[] arr)
    {
        int n = arr.length;
        // traverse array
        for (int i = 1; i < n; i++)
        {
            int sorted_part = arr[i]; // store 1st index to the sorted_part variable
            int j = i - 1; // initalize j index brfore i index

           // check if jth index value is greater than sorted_part variable
            while (j >= 0 && arr[j] > sorted_part)
            { 
                arr[j + 1] = arr[j]; // if yes the swap index 
                j--; 
            }

            arr[j + 1] = sorted_part;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {38, 27, 43, 3, 9, 82, 10}; 
        insertionSort(arr); 
        for (int num : arr)
        { 
            System.out.print(num + " "); 
        }
    }
}
```
### Bubble sort
**example**
```java
public class BubbleSort
{
    public static void bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int j=0;
            while(j<arr.length-1-i)
            {
               if(arr[j] > arr[j+1])
               {

                 int store_swap_value = arr[j];
                 arr[j]= arr[j+1];
                 arr[j+1] = store_swap_value ;
               }
              j++;
            }
        } 

    }
 
   public static void main(string[]args)
   {
     int arr[] = {5,2,1,0,3,6}
     bubbleSort(arr);
      for (int num : arr)
      {
            System.out.print(num + " ");
      }
   }
}
```
### Selection Sort

**Divide the Array:**
- The array is conceptually divided into two parts:
- Sorted portion: Initially empty.
- Unsorted portion: Contains all the elements.
  
**Find the Minimum:**
- In each iteration, find the smallest element in the unsorted portion.
  
**Swap:**
- Swap the smallest element with the first element of the unsorted portion.
- This moves the smallest element to the end of the sorted portion.
  
**Repeat:**
- Repeat the process for the remaining unsorted portion until the array is completely sorted.
  
  **example**
  ```java
  public class SelectionSort
  {
     public static void main(String[] args)
     {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("unsorted array :");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
     }

     // Selection Sort function
      public static void selectionSort(int[] arr)
      {
         int n = arr.length;

          // Traverse through the entire array
          for (int i = 0; i < n - 1; i++)
          {
             // Find the minimum element in the unsorted part
              int minIndex = i;
             for (int j = i + 1; j < n; j++)
             {
                  if (arr[j] < arr[minIndex])
                  {
                     minIndex = j; // Update the index of the smallest element
                  }
             }

              // Swap the found minimum element
              int temp = arr[minIndex];
              arr[minIndex] = arr[i];
              arr[i] = temp;
           }
       }
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
        if (left < right) {
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
        int num1 = mid - left + 1;
        int num2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[num1];
        int[] rightArray = new int[num2];

        // Copy data to temporary arrays
        for (int i = 0; i < num1; i++)
        {
          leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < num2; j++)
        {
          rightArray[j] = arr[mid + 1 + j];
        }
        // Merge the temporary arrays

        int i = 0, j = 0; // Initial indices of subarrays
        int k = left;     // Initial index of merged array

        while (i < num1 && j < num2)
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
        while (i < num1)
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


  
