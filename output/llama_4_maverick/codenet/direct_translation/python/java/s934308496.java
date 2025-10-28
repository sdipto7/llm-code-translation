
import java.util.Arrays;
import java.util.Scanner;

public class s934308496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        Arrays.sort(m);
        int sum = 0;
        for (int i : m) {
            sum += i;
        }
        System.out.println(n + (x - sum) / m[0]);
    }
}

