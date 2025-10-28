
import java.util.Scanner;

public class s676839884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(checkStrings(s, t));
        scanner.close();
    }

    public static String checkStrings(String s, String t) {
        if (t.substring(0, t.length() - 1).equals(s)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

