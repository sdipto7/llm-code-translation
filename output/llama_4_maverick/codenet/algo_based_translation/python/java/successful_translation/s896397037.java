
import java.util.Arrays;
import java.util.Scanner;

public class s896397037 {
    public static void main(String[] args) {
        System.out.println(checkString());
    }

    public static String checkString() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        if (charArray.length >= 4 && charArray[0] == charArray[1] && charArray[0] != charArray[2] && charArray[2] == charArray[3]) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

