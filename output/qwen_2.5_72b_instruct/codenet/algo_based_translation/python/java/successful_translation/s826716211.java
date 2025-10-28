
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class s826716211 {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        String inputSd = scanner.nextLine();
        String inputT = scanner.nextLine();

        List<Character> S_d = new ArrayList<>();
        for (char c : inputSd.toCharArray()) {
            S_d.add(c);
        }

        List<Character> T = new ArrayList<>();
        for (char c : inputT.toCharArray()) {
            T.add(c);
        }

        int end = S_d.size() - 1;
        int first = end - T.size() + 1;

        while (first >= 0) {
            int t_i = 0;
            boolean match = true;
            for (int s_i = first; s_i <= end; s_i++) {
                if (!T.get(t_i).equals(S_d.get(s_i)) && !S_d.get(s_i).equals('?')) {
                    match = false;
                    break;
                }
                t_i++;
            }
            if (match) {
                break;
            }
            first--;
            end--;
        }

        if (first < 0) {
            System.out.println("UNRESTORABLE");
            return;
        }

        List<Character> ans = new ArrayList<>(S_d);
        int t_i = 0;
        for (int i = first; i <= end; i++) {
            ans.set(i, T.get(t_i));
            t_i++;
        }

        StringBuilder result = new StringBuilder();
        for (char c : ans) {
            if (c == '?') {
                result.append('a');
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}

