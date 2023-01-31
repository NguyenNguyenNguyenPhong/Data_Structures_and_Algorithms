package String;

//https://www.geeksforgeeks.org/converting-roman-numerals-decimal-lying-1-3999/

public class Roman_Number_to_Integer {

    // This function returns
    // value of a Roman symbol
    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    // Finds decimal value of a
    // given roman numeral

    int romanToDecimal(String str)
    {
       int res = 0;
       int n = str.length();
       for (int i = 0;i < n;i++){

           // Getting value of symbol s[i]
           int s1 = value(str.charAt(i));

           // Getting value of symbol s[i+1]
           if (i + 1 < n){
               int s2 = value(str.charAt(i+1));

               if (s1 > s2){
                   // Value of current symbol
                   // is greater or equalto
                   // the next symbol
                   res = res + s1;
               }
               else {
                   // Value of current symbol is
                   // less than the next symbol
                   res = res + s2 - s1;
                   i++;
               }
           }
           else {
               res = res + s1;
           }
       }
       return res;
    }

    // Driver Code
    public static void main(String args[])
    {
        Roman_Number_to_Integer ob = new Roman_Number_to_Integer();

        // Considering inputs given are valid
        String str = "MCMIV";
        System.out.println("Integer form of Roman Numeral"
                + " is "
                + ob.romanToDecimal(str));
    }
}
