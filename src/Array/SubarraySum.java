package Array;

public class SubarraySum {


    public static int subArraySum(int[] arr, int n, int sum) {

        int currentSum = arr[0], start = 0, i;

        for (i = 1; i <= n; i++) {

            while (currentSum > sum && start < i - 1) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == sum) {
                System.out.println("Sum found between indexes " + start
                        + " and " + (i - 1));
                return 1;
            } else if (i < n) {
                currentSum += arr[i];
            }
        }
        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args) {
        SubarraySum arraysum = new SubarraySum();
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;
        arraysum.subArraySum(arr, n, sum);
    }

}

