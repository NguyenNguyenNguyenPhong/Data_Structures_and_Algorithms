package Array;

import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
public class LeadersInArray {

    public static void printLeaders(int arr[], int size){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[size-1]);

        for(int i = size-2; i >= 0; i--){
            if(arr[i] > stack.peek()){
                stack.push(arr[i]);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }


    public static void main(String[] args)
    {
        LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
}
