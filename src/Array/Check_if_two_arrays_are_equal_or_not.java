package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1
public class Check_if_two_arrays_are_equal_or_not {

    public static boolean areEqual(int[] arr1, int[] arr2){
        int size1 = arr1.length;
        int size2 = arr2.length;

        if(size1 != size2) return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < size1; i++){
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };

        // Function call
        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
