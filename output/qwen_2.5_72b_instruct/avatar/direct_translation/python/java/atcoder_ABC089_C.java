
import java.util.*;

public class atcoder_ABC089_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextLine();
        }
        String[] march = {"M", "A", "R", "C", "H"};
        int[] marchLis = new int[5];
        for (String s : S) {
            char firstChar = Character.toUpperCase(s.charAt(0));
            for (int j = 0; j < 5; j++) {
                if (firstChar == march[j].charAt(0)) {
                    marchLis[j]++;
                    break;
                }
            }
        }
        int ans = 0;
        for (int x = 0; x < 5; x++) {
            for (int y = x + 1; y < 5; y++) {
                for (int z = y + 1; z < 5; z++) {
                    ans += marchLis[x] * marchLis[y] * marchLis[z];
                }
            }
        }
        System.out.println(ans);
    }
}

