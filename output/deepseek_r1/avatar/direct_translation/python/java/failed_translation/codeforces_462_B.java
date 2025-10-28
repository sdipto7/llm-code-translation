
import java.util.*;

public class codeforces_462_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }
        Arrays.sort(count);
        for (int i = 0; i < 13; i++) {
            int temp = count[i];
            count[i] = count[25 - i];
            count[25 - i] = temp;
        }
        long res = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += (long) k * k;
                System.out.println(res);
                return;
            }
            k -= count[i];
            res += (long) count[i] * count[i];
        }
        System.out.println(res);
    }
}

