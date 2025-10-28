import java.util.Scanner;

public class s826716211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] S_d = scanner.nextLine().toCharArray();
        char[] T = scanner.nextLine().toCharArray();

        int end = S_d.length - 1;
        int first = end - T.length + 1;
        while (first >= 0) {
            int t_i = 0;
            for (int s_i = first; s_i <= end; s_i++) {
                if (T[t_i] != S_d[s_i] && S_d[s_i] != '?') {
                    break;
                }
                t_i++;
            }
            if (t_i == T.length) {
                break;
            }

            first--;
            end--;
        }

        if (first < 0) {
            System.out.println("UNRESTORABLE");
            return;
        }

        char[] ans = S_d.clone();
        int t_i = 0;
        for (int i = first; i <= end; i++) {
            ans[i] = T[t_i];
            t_i++;
        }

        StringBuilder result = new StringBuilder();
        for (char c : ans) {
            result.append(c == '?' ? 'a' : c);
        }
        System.out.println(result.toString());
    }
}
