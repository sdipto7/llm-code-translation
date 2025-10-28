
import java.util.Scanner;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        int total = 0;
        for (int element : a) {
            total ^= element;
        }
        StringBuilder result = new StringBuilder();
        for (int element : a) {
            result.append((element ^ total)).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}

