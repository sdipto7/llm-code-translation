
import java.util.Scanner;

public class s025428739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = A + B;
        int difference = A - B;
        int product = A * B;
        int max = Math.max(sum, Math.max(difference, product));
        System.out.println(max);
    }
}

