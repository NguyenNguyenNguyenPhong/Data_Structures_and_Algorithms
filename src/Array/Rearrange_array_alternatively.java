package Array;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1
public class Rearrange_array_alternatively {

    public static void rearrange(int[] arr, int length) {
        int[] temp = arr.clone();
        int left = 0, right = length-1;
        boolean flag = true;

        for(int i = 0; i < length; i++){
            if(flag){
                arr[i] = temp[right--];
            }
            else {
                arr[i] = temp[left++];
            }
            flag = !flag;
        }
    }

    public static void main(String[] args)
    {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };

        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));

        rearrange(arr, arr.length);

        System.out.println("Modified Array ");
        System.out.println(Arrays.toString(arr));
    }


}
