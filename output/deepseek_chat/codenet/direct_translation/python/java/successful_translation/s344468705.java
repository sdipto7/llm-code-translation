
import java.util.*;
import java.io.*;

public class s344468705 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static int getN() throws IOException {
        return Integer.parseInt(input.readLine());
    }
    static List<Integer> getList() throws IOException {
        String[] s = input.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String str : s) {
            list.add(Integer.parseInt(str));
        }
        return list;
    }
    static int[] getZList() throws IOException {
        String[] s = input.readLine().split(" ");
        int[] list = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            list[i] = Integer.parseInt(s[i]) - 1;
        }
        return list;
    }
    static void solve() throws IOException {
        int n = getN();
        List<Integer> dp = new ArrayList<>();
        dp.add(Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            int num = getN();
            num = -num;
            if (num >= dp.get(dp.size() - 1)) {
                dp.add(num);
            } else {
                int idx = bisectRight(dp, num);
                dp.set(idx, num);
            }
        }
        System.out.println(dp.size() - 1);
    }
    static int bisectRight(List<Integer> dp, int num) {
        int left = 0;
        int right = dp.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if (dp.get(mid) <= num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) throws IOException {
        solve();
    }
}

