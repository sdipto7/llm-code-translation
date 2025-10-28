import java.util.*;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] tStr = sc.nextLine().split(" ");
        String[] aStr = sc.nextLine().split(" ");

        int[] t = new int[n + 1];
        int[] a = new int[n + 1];
        t[0] = 0;
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            t[i] = Integer.parseInt(tStr[i - 1]);
            a[i] = Integer.parseInt(aStr[i - 1]);
        }

        int[] cnt = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            cnt[a[i]]++;
        }

        List<Integer> ans = new ArrayList<>();
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

        Collections.reverse(ans);

        System.out.println(ans.size());
        List<String> ansStr = new ArrayList<>();
        for (int num : ans) {
            ansStr.add(Integer.toString(num));
        }
        System.out.println(String.join(" ", ansStr));
    }
}
