
import java.util.Scanner;

public class codeforces_70_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] parts = input.split("[.?!]");
        int ans = 1;
        int sumL = 0;

        for (String part : parts) {
            String s = part.trim() + ".";
            int L = s.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    return;
                }
                if (sumL == 0) {
                    sumL = L;
                } else {
                    int required = sumL + L + 1;
                    if (required > n) {
                        ans++;
                        sumL = L;
                    } else {
                        sumL = required;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}

