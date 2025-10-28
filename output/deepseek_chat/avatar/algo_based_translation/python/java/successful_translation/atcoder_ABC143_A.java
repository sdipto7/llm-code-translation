import java.util.Scanner;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int result = A - 2 * B;
        if (result < 0) {
            result = 0;
        }
        System.out.println(result);
    }
}
