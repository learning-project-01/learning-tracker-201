public class BubbleSort
{
    public static void bubbleSort(int[] arr)
    {
        //traverse array
        for(int i=0;i<arr.length-1;i++)
        {
            // if 1st index element is greater then swap
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

    public static void main(String[]args)
    {
        int arr[] = {5,2,1,0,3,6};
        bubbleSort(arr);
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
