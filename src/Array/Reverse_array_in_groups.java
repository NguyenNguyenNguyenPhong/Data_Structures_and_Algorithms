package Array;

//https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1
public class Reverse_array_in_groups {

    public static void reverse(int[] arr, int size, int k){

        for(int i = 0; i < size; i+= k){
            int left = i;
            int right = Math.min(i + k -1, size -1);
            int temp;

            while (left < right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }


    public static void main(String[] args)
    {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        int n = arr.length;

        reverse(arr, n, k);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
