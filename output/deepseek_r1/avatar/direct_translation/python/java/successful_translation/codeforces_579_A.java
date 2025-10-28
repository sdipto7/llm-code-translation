import java.util.Scanner;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (true) {
            double log2 = Math.log(n) / Math.log(2);
            int power = (int) log2;
            if ((1 << power) == n) break;
            x++;
            n -= (1 << power);
        }
        System.out.println(x);
    }
}
