package String;

import java.util.LinkedHashSet;

public class Remove_Duplicates {

    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        Remove_Duplicates r = new Remove_Duplicates();
        r.removeDuplicates(str);
    }

    void removeDuplicates(String str) {
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        int n = str.length();
        for (int i = 0; i < n; i++){
            linkedHashSet.add(str.charAt(i));
        }

        for (Character ch : linkedHashSet){
            System.out.print(ch);
        }
    }
}
