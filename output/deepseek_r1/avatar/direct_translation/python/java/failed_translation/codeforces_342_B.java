import java.util.*;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();
        int d = s < f ? 1 : -1;
        char c = s < f ? 'R' : 'L';
        StringBuilder res = new StringBuilder();
        int i = 1;
        int j = s;
        List<int[]> events = new ArrayList<>();
        for (int k = 0; k < m; k++) {
            events.add(new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()});
        }
        sc.close();
        int k = 0;
        int t = 0, l = 0, r = 0;
        if (m > 0) {
            t = events.get(0)[0];
            l = events.get(0)[1];
            r = events.get(0)[2];
        }
        while (j != f) {
            if (i > t && k < m - 1) {
                k++;
                t = events.get(k)[0];
                l = events.get(k)[1];
                r = events.get(k)[2];
            }
            if (m > 0 && i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res.append('X');
            } else {
                res.append(c);
                j += d;
            }
            i++;
        }
        System.out.println(res);
    }
}
