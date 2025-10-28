
import java.util.Scanner;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String a = scanner.nextLine().trim();
        String[] parts = a.replaceAll("^0+|0+$", "").split("1");
        long result = 1;
        boolean hasOne = false;
        for (String part : parts) {
            if (part.length() > 0) {
                hasOne = true;
                result *= (part.length() + 1);
            }
        }
        System.out.println(hasOne ? result : 0);
    }
}

