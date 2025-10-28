
import java.util.Scanner;

public class codeforces_32_B {

    public static String decodeString(String s) {
        String result = "";
        int i = 0;
        
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result += '0';
            } else {
                i += 1;
                if (s.charAt(i) == '.') {
                    result += '1';
                } else {
                    result += '2';
                }
            }
            i += 1;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = decodeString(s);
        System.out.println(result);
        scanner.close();
    }
}

