
import java.util.Scanner;

public class s404600540 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] prices = scanner.nextLine().split(" ");
        int q = Integer.parseInt(prices[0]);
        int h = Integer.parseInt(prices[1]);
        int s = Integer.parseInt(prices[2]);
        int d = Integer.parseInt(prices[3]);
        int n = scanner.nextInt();
        int min1 = Math.min(Math.min(q * 4, h * 2), Math.min(q * 2 + h, s));
        int min2 = Math.min(min1 * 2, d);
        System.out.println((n % 2) * min1 + (n / 2) * min2);
    }
}

