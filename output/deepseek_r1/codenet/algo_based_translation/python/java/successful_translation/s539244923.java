
import java.util.Scanner;

public class s539244923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int remainder = k % n;
        int result = (remainder == 0) ? n + k : k - n;
        System.out.println(result);
    }
}

