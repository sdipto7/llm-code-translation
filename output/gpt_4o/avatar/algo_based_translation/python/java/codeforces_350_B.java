
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] t = new int[n + 1];
        String[] tInput = scanner.nextLine().split(" ");
        for (int i = 1; i <= n; i++) {
            t[i] = Integer.parseInt(tInput[i - 1]);
        }

        int[] a = new int[n + 1];
        String[] aInput = scanner.nextLine().split(" ");
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(aInput[i - 1]);
        }

        List<Integer> ans = new ArrayList<>();
        int[] cnt = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            cnt[a[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (t[i] == 1) {
                List<Integer> crt = new ArrayList<>();
                crt.add(i);
                int x = a[i];
                while (cnt[x] == 1) {
                    crt.add(x);
                    x = a[x];
                }
                if (crt.size() > ans.size()) {
                    ans = new ArrayList<>(crt);
                }
            }
        }

        java.util.Collections.reverse(ans);

        System.out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
            if (i < ans.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

