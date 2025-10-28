import java.util.*;
import java.io.*;

public class codeforces_637_A {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String[] s = input.readLine().substring(0, input.readLine().length() - 1).split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String str : s) {
            w.put(str, w.getOrDefault(str, 0) + 1);
        }
        List<String> reversedS = Arrays.asList(s);
        Collections.reverse(reversedS);
        int c = -1;
        String a = "";
        int maxValue = Collections.max(w.values());
        for (String i : w.keySet()) {
            if (w.get(i) == maxValue) {
                int index = reversedS.indexOf(i);
                if (index > c) {
                    a = i;
                    c = index;
                }
            }
        }
        System.out.println(a);
    }
}
