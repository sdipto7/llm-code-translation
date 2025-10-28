import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int count = (a == 5 ? 1 : 0) + (b == 5 ? 1 : 0) + (c == 5 ? 1 : 0);
        if (count == 2) {
            System.out.println((a + b + c) == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}
