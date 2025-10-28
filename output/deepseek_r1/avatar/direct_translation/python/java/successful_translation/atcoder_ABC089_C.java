
import java.util.*;

public class atcoder_ABC089_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] counts = new int[5];
        String[] march = {"M", "A", "R", "C", "H"};
        for (int i = 0; i < N; i++) {
            String s = scanner.nextLine();
            if (s.isEmpty()) continue;
            char c = s.charAt(0);
            String first = String.valueOf(c).toUpperCase();
            for (int j = 0; j < 5; j++) {
                if (march[j].equals(first)) {
                    counts[j]++;
                    break;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += (long) counts[i] * counts[j] * counts[k];
                }
            }
        }
        System.out.println(ans);
    }
}

