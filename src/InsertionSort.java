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
