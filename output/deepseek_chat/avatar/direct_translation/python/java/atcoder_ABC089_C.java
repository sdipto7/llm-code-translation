itumport java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class atcoder_ABC089_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextLine();
        }
        String[] march = {"M", "A", "R", "C", "H"};
        int[] marchCount = new int[5];
        for (String s : S) {
            char firstChar = s.charAt(0);
            String firstCharStr = String.valueOf(firstChar).toUpperCase();
            if (Arrays.asList(march).contains(firstCharStr)) {
                marchCount[Arrays.asList(march).indexOf(firstCharStr)]++;
            }
        }
        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += (long) marchCount[i] * marchCount[j] * marchCount[k];
                }
            }
        }
        System.out.println(ans);
    }
}
