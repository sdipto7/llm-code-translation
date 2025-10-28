import java.util.Scanner;

public class s197514717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        System.out.println(Math.max(Math.max(10 * A + B + C, 10 * B + C + A), 10 * C + A + B));
    }
}
