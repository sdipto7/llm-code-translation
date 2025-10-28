
import java.util.Scanner;

public class s997947249 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(N % K == 0 ? 0 : 1);
    }
}

