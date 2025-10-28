import java.util.*;
import java.io.*;

public class codeforces_131_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Map<Integer, Integer> w = new HashMap<>();
        for (String s : input) {
            int num = Integer.parseInt(s);
            w.put(num, w.getOrDefault(num, 0) + 1);
        }
        int c = 0;
        for (Map.Entry<Integer, Integer> entry : w.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (key == 0) {
                c += value * (value - 1);
            } else {
                if (w.containsKey(-key)) {
                    c += value * w.get(-key);
                }
            }
        }
        System.out.println(c / 2);
    }
}
