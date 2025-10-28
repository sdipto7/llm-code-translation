
import java.util.Scanner;

public class codeforces_86_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        System.out.println(calculateMaxProduct(l, r));
        scanner.close();
    }

    public static long calculateMaxProduct(long l, long r) {
        long curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        
        long first = 1;
        for (int i = 0; i < s; i++) {
            first *= 10;
        }
        long second = first / 2;
        long ans = -1;
        long[] candidates = {l, r, first, second};

        for (long i : candidates) {
            if (i >= l && i <= r) {
                String numStr = Long.toString(i);
                StringBuilder revBuilder = new StringBuilder();
                for (char k : numStr.toCharArray()) {
                    int digit = Character.getNumericValue(k);
                    revBuilder.append(9 - digit);
                }
                long reversed = Long.parseLong(revBuilder.toString());
                ans = Math.max(ans, reversed * i);
            }
        }
        return ans;
    }
}

