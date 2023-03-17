import java.util.Scanner;

public class Sonad {
    public static String coding(String gap, int n) {
        String output = "";
        for (int i = 0; i < gap.length(); i++) {
            char charAt = gap.charAt(i);
            if (charAt >= 65 && charAt <= 90) {
                output += (char) (((charAt - 65 + n) % 26) + 65);
            } else if (charAt >= 97 && charAt <= 122) {
                output += (char) (((charAt - 97 + n) % 26) + 97);
            }
        }
        return output;
    }
}