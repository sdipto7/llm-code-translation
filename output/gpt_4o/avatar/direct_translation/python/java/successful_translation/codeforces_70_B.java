
import java.util.Scanner;
import java.util.regex.Pattern;

public class codeforces_70_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int ans = 1, sumL = 0;
        String[] sentences = Pattern.compile("[.?!]").split(scanner.nextLine());
        for (String sentence : sentences) {
            sentence = sentence.trim() + '.';
            int L = sentence.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    return;
                }
                if (sumL + L + (sumL > 0 ? 1 : 0) > n) {
                    ans += 1;
                    sumL = L;
                } else {
                    sumL = sumL + L + (sumL > 0 ? 1 : 0);
                }
            }
        }
        System.out.println(ans);
    }
}

