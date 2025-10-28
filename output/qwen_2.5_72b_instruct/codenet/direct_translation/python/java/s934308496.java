import java.util.Scanner;
import java.util.Arrays;

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
        System.out.println(n + (x - Arrays.stream(m).sum()) / m[0]);
    }
}
