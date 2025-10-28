
import java.util.Scanner;

public class codeforces_546_A {
    public static int calculateShortage(int k, int n, int w) {
        int total = 0;
        for (int i = 1; i <= w; i++) {
            total += i * k;
        }
        if (total > n) {
            return total - n;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        int k = Integer.parseInt(values[0]);
        int n = Integer.parseInt(values[1]);
        int w = Integer.parseInt(values[2]);
        
        if (1 <= k && w <= 1000) {
            System.out.println(calculateShortage(k, n, w));
        }
        scanner.close();
    }
}

