package Searching_and_Sorting;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
public class K_th_smallest_element {

    public static void main(String[] args) {
        int[] arr = { 12, 3, 5, 7, 19 };
        int N = arr.length;
        int K = 4;

        // since counting starts from 0 so to find kth
        // element we need to reduce K by 1
        K--;

        // for storing elements in sorted form
        // in set we will use TreeSet
        Set<Integer> s = new TreeSet<Integer>();

        for(int i = 0; i < N; i++){
            s.add(arr[i]);
        }

        // Use iterator method of Iterator
        // for the traversal
        Iterator<Integer> itr = s.iterator();

        while (K > 0){
            itr.next();
            K--;
        }
        System.out.println(itr.next());


    }
}
