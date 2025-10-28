
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_462_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        String s = scanner.nextLine();

        System.out.println(calculateMaxValue(n, k, s));
    }

    public static int calculateMaxValue(int n, int k, String s) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

        Arrays.sort(count);

        int res = 0;
        for (int i = 25; i >= 0; i--) {
            if (count[i] >= k) {
                res += k * k;
                return res;
            }
            k -= count[i];
            res += count[i] * count[i];
        }
        
        return res;
    }
}

