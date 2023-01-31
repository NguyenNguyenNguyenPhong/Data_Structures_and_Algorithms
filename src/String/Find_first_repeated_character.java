package String;

import java.util.HashSet;

//https://www.geeksforgeeks.org/find-the-first-repeated-character-in-a-string/
public class Find_first_repeated_character {


    // Driver method to test above method
    public static void main (String[] args)
    {
        String str = "geeksforgeeks";
        char[] arr = str.toCharArray();
        System.out.println(firstRepeating(arr));
    }

    public static char firstRepeating(char[] str) {
        // Creates an empty hashset
        HashSet<Character> hashSet = new HashSet<>();

        // Traverse the input array from left to right

        int n = str.length;
        for (int i = 0; i < n; i++){
            char c = str[i];

            // If element is already in hash set, update x
            // and then break

            if (hashSet.contains(c))
                return c;
            else  // Else add element to hash set
                hashSet.add(c);

        }
        return '\0';

    }
}
