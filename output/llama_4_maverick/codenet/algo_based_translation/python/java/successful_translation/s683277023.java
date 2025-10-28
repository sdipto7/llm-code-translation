
import java.util.Arrays;
import java.util.Scanner;

public class s683277023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        String[] liStr = scanner.nextLine().split(" ");
        int[] li = new int[n];
        for (int i = 0; i < n; i++) {
            li[i] = Integer.parseInt(liStr[i]);
        }
        Arrays.sort(li);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += li[i];
        }
        System.out.println(sum);
        scanner.close();
    }
}

