
import java.util.Scanner;

public class s167793578 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int result = calculatePairs(N, M);
        System.out.println(result);
    }

    private static int calculatePairs(int N, int M) {
        int a = (N * (N - 1)) / 2;
        int b = (M * (M - 1)) / 2;
        return a + b;
    }
}

