
import java.io.*;
import java.util.*;

public class s344468705 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Integer> dp = new ArrayList<>();
        dp.add(Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            int num = -Integer.parseInt(reader.readLine().trim());
            if (num >= dp.get(dp.size() - 1)) {
                dp.add(num);
            } else {
                int idx = bisectRight(dp, num);
                dp.set(idx, num);
            }
        }
        System.out.println(dp.size() - 1);
    }

    private static int bisectRight(List<Integer> list, int num) {
        int low = 0;
        int high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (num < list.get(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

