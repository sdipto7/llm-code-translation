
import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int mod = (y - x) % 3;
        if (mod < 0) {
            mod += 3;
        }
        int term = mod > 0 ? 1 : 0;
        int result = Math.max(x + y - 3 + term, 0);
        System.out.println(result);
    }
}

