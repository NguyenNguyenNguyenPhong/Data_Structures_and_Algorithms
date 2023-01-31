package String;

//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
public class Reverse_words_in_a_given_string {
    public static void main(String[] args) {
        String s[] = "i like this program very much".split(" ");

        String ans = "";
        int n = s.length;
        for (int i = n-1; i >= 0; i--){
            ans += s[i] + " ";
        }
        System.out.println("Reversed String:");
        System.out.println(ans.substring(0, ans.length() - 1));
    }
}
