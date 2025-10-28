
import java.util.*;

public class s934308496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        Arrays.sort(m);
        int sum = 0;
        for (int num : m) {
            sum += num;
        }
        System.out.println(n + (x - sum) / m[0]);
    }
}

