package Array;

//https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1
public class K_th_element_of_two_sorted_Arrays {



    public static int find(int[] a, int[] b, int size1, int size2, int k) {

        int curIndex = 0, i = 0, j = 0;
        while (i < size1 && j < size2){
            if(a[i] < b[j]){
                curIndex++;
                if (curIndex == k){
                    return a[i];
                }
                i++;
            }
            else {
                curIndex++;
                if (curIndex == k){
                    return b[j];
                }
                j++;
            }
        }
        while (i < size1){
            curIndex++;
            if (curIndex == k){
                return a[i];
            }
            i++;
        }
        while (j < size2){
            curIndex++;
            if (curIndex == k){
                return b[j];
            }
            j++;
        }

        return -1;
    }
    public static void main(String[] args)
    {
        int[] A = { 2, 3, 6, 7, 9 };
        int[] B = { 1, 4, 8, 10 };
        int k = 5;

        System.out.println(find(A, B, 5, 4, k));
    }


}
