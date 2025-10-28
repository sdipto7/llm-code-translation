
import java.util.*;

public class s826716211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] S_d = scanner.nextLine().toCharArray();
        char[] T = scanner.nextLine().toCharArray();

        int end = S_d.length - 1;
        int first = end - T.length + 1;
        boolean found = false;

        while (first >= 0) {
            boolean match = true;
            int t_i = 0;
            for (int s_i = first; s_i <= end; s_i++) {
                if (T[t_i] != S_d[s_i] && S_d[s_i] != '?') {
                    match = false;
                    break;
                }
                t_i++;
            }
            if (match) {
                found = true;
                break;
            } else {
                first--;
                end--;
            }
        }

        if (!found) {
            System.out.println("UNRESTORABLE");
            return;
        }

        char[] ans = Arrays.copyOf(S_d, S_d.length);
        int t_i = 0;
        for (int i = first; i <= end; i++) {
            ans[i] = T[t_i++];
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == '?') {
                ans[i] = 'a';
            }
        }

        System.out.println(new String(ans));
    }
}

