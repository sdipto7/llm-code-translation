
import java.util.*;

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
        int sumM = 0;
        for (int i = 0; i < n; i++) {
            sumM += m[i];
        }
        System.out.println(n + (x - sumM) / m[0]);
    }
}

