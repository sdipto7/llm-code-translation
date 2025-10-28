
import java.util.Scanner;

public class s031459110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String c = scanner.next();
        int numW = 0;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == 'W') {
                numW++;
            }
        }
        int numR = N - numW;
        int ans = 0;
        for (int i = 0; i < numR; i++) {
            if (c.charAt(i) != 'R') {
                ans++;
            }
        }
        ans = Math.min(ans, Math.min(numW, numR));
        System.out.println(ans);
    }
}

