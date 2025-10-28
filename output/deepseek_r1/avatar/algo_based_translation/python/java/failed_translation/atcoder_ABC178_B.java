
import java.util.Scanner;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int maxProduct = Math.max(Math.max(a * c, b * d), Math.max(a * d, b * c));
        System.out.println(maxProduct);
    }
}

