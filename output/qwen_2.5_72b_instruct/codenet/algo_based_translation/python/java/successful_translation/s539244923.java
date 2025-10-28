import java.util.Scanner;

public class s539244923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = calculateResult(n, k);
        System.out.println(result);
    }

    public static int calculateResult(int n, int k) {
        if (k % n == 0) {
            return n + k;
        } else {
            return k - n;
        }
    }
}
