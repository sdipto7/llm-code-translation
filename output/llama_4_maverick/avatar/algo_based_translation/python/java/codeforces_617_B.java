
import java.util.Scanner;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String a = scanner.nextLine().trim().replaceAll("^0+|0+$", "");
        String[] substrings = a.split("1");
        long result = 0;
        if (a.contains("1")) {
            result = 1;
            for (String s : substrings) {
                int count = 0;
                for (char c : s.toCharArray()) {
                    if (c == '0') count++;
                }
                result *= (count + 1);
            }
        }
        System.out.println(result);
    }
}

