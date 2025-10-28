
import java.util.*;
import java.io.*;

public class codeforces_637_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String str : s) {
            w.put(str, w.getOrDefault(str, 0) + 1);
        }
        Collections.reverse(Arrays.asList(s));
        int c = -1;
        String a = "";
        int maxFreq = Collections.max(w.values());
        for (String i : w.keySet()) {
            if (w.get(i) == maxFreq) {
                int index = Arrays.asList(s).indexOf(i);
                if (index > c) {
                    a = i;
                    c = index;
                }
            }
        }
        System.out.println(a);
    }
}

