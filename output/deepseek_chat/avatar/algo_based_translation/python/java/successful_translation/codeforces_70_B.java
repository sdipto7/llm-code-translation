
import java.util.Scanner;
import java.util.regex.Pattern;

public class codeforces_70_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int ans = 1;
        int sumL = 0;
        String input = scanner.nextLine();
        String[] sentences = input.split("[.?!]");
        
        for (String s : sentences) {
            String processed = s.trim() + ".";
            int L = processed.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    return;
                }
                int spaceNeeded = (sumL > 0) ? L + 1 : L;
                if (sumL + spaceNeeded > n) {
                    ans++;
                    sumL = L;
                } else {
                    sumL += spaceNeeded;
                }
            }
        }
        System.out.println(ans);
    }
}

