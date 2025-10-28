
import java.util.Scanner;

public class s826716211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] S_d = scanner.next().toCharArray();
        char[] T = scanner.next().toCharArray();
        scanner.close();

        int end = S_d.length - 1;
        int first = end - T.length + 1;
        boolean found = false;

        while (first >= 0) {
            boolean match = true;
            int t_i = 0;
            for (int s_i = first; s_i <= end; s_i++) {
                if (S_d[s_i] != '?' && S_d[s_i] != T[t_i]) {
                    match = false;
                    break;
                }
                t_i++;
            }
            if (match) {
                found = true;
                break;
            }
            first--;
            end--;
        }

        if (!found) {
            System.out.println("UNRESTORABLE");
            return;
        }

        char[] ans = S_d.clone();
        for (int i = 0; i < T.length; i++) {
            ans[first + i] = T[i];
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == '?') {
                ans[i] = 'a';
            }
        }

        System.out.println(new String(ans));
    }
}

