package String;



public class Check_if_string_is_rotated_by_two_places {

    public static void main (String[] args) {
        String str1 = "geeks";
        String str2 = "eksge";

        System.out.println(isRotated(str1, str2) ? "Yes"
                : "No");
    }

    private static boolean isRotated(String str1, String str2) {

        int n = str1.length(), m = str2.length();
        if (n != m) return false;

        boolean clockwise = true;
        boolean anticlockwise = true;

        for (int i = 0; i < n; i++){
            if(str1.charAt(i) != (str2.charAt((i+2) % n))){
               clockwise = false;
               break;

            }
        }


        for (int i = 0; i < n; i++){
            if(str2.charAt(i) != (str1.charAt((i+2) % n))){
                anticlockwise= false;
                break;
            }
        }

        return (clockwise || anticlockwise);
    }
}
