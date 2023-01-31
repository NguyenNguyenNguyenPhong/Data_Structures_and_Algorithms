package String;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
public class Anagram {


    /* Driver code*/
    public static void main(String args[])
    {
        char str1[] = ("gram").toCharArray();
        char str2[] = ("arm").toCharArray();

        // Function call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }

    public static boolean areAnagram(char[] str1, char[] str2) {

        // Create 2 count arrays and initialize
        // all values as 0

        int count1[] = new int[256];
        Arrays.fill(count1, 0);
        int count2[] = new  int[256];
        Arrays.fill(count2, 0);

        int i ;

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        int n1 = str1.length, n2 = str2.length;
        if (n1 != n2 ) return false;
        for (i = 0; i < n1 ; i++){
            count1[str1[i]] ++;
            count2[str2[i]] ++;
        }

        for (i = 0; i < 256; i++){
            if (count1[i] != count2[i])
                return false;
        }
        return true;
    }
}
