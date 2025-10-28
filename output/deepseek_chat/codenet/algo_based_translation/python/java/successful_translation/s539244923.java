import java.util.Scanner;

public class s539244923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result;
        if (k % n == 0) {
            result = n + k;
        } else {
            result = k - n;
        }
        System.out.println(result);
    }
}
