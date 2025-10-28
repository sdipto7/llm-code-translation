
import java.util.Scanner;

public class s592421258 {

    public static String isSubstringDouble(String s1, String s2) {
        String s = s1 + s1;
        if (s.contains(s2)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String result = isSubstringDouble(s1, s2);
        System.out.println(result);
        scanner.close();
    }
}

