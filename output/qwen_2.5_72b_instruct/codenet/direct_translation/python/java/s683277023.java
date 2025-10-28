import java.util.Scanner;
import java.util.Arrays;

public class s683277023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] li = new int[n];
        for (int i = 0; i < n; i++) {
            li[i] = scanner.nextInt();
        }
        Arrays.sort(li);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += li[i];
        }
        System.out.println(sum);
    }
}
