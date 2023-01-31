package Searching_and_Sorting;

public class Binary_Search {

    public static int binary_Search(int arr[], int x){
        int left = 0, right = arr.length - 1;
        while (left <= right){
            int middle = left + (right-left)/2;
            if(arr[middle] == x) return middle;
            else if (arr[middle] < x) left = middle+1;
            else  right = middle-1;
        }
        return -1;
    }


    public static void main(String args[])
    {
        Binary_Search ob = new Binary_Search();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binary_Search(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
