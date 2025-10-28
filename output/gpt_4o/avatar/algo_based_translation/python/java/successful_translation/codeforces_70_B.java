
import java.util.Scanner;
import java.util.regex.Pattern;

public class codeforces_70_B {

    public static int calculateParagraphs(int n, String text) {
        int ans = 1;
        int sumL = 0;
        String[] sentences = text.split("[.?!]");

        for (String s : sentences) {
            s = s.trim() + ".";
            int L = s.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    System.exit(0);
                }
                if (sumL + L + (sumL > 0 ? 1 : 0) > n) {
                    ans++;
                    sumL = L;
                } else {
                    sumL = sumL + L + (sumL > 0 ? 1 : 0);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        int result = calculateParagraphs(n, text);
        System.out.println(result);
        scanner.close();
    }
}

