
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_462_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();
        int[] count = new int[26];
        
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }
        
        Arrays.sort(count);
        for (int i = 0; i < count.length / 2; i++) {
            int temp = count[i];
            count[i] = count[count.length - 1 - i];
            count[count.length - 1 - i] = temp;
        }
        
        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                System.exit(0);
            }
            k -= count[i];
            res += count[i] * count[i];
        }
        System.out.println(res);
    }
}

