package Array;
//https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
public class Equilibrium_point {

    static int findElement(int arr[], int size)
    {
        int right_sum = 0, left_sum = 0;

        // Computing right_sum
        for (int i = 1; i < size; i++)
            right_sum += arr[i];

        // Checking the point of partition
        // i.e. left_Sum == right_sum
        for (int i = 0, j = 1; j < size; i++, j++) {
            right_sum -= arr[j];
            left_sum += arr[i];

            if (left_sum == right_sum)
                return i+1;
        }

        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 1, 4, 5 };
        int size = arr.length;
        System.out.println(findElement(arr, size));
    }
}
