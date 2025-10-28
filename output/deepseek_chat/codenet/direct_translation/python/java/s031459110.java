
import java.util.Scanner;

public class s031459110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String c = scanner.next();
        int numW = (int) c.chars().filter(ch -> ch == 'W').count();
        int numR = N - numW;
        String comp = "R".repeat(numR) + "W".repeat(numW);
        int ans = 0;
        for (int i = 0; i < numR; i++) {
            if (c.charAt(i) != comp.charAt(i)) {
                ans++;
            }
        }
        ans = Math.min(Math.min(numW, numR), ans);
        System.out.println(ans);
    }
}

