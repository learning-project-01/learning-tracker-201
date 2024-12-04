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
