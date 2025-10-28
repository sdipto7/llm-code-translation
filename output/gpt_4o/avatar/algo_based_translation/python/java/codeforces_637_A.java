
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class codeforces_637_A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine().trim());
        String[] s = reader.readLine().trim().split(" ");
        Map<String, Integer> w = new HashMap<>();

        for (String word : s) {
            w.put(word, w.getOrDefault(word, 0) + 1);
        }

        String[] reversedS = new String[n];
        for (int i = 0; i < n; i++) {
            reversedS[i] = s[n - 1 - i];
        }

        int c = -1;
        String a = "";

        for (String i : w.keySet()) {
            int maxCount = w.values().stream().max(Integer::compareTo).orElse(0);
            if (w.get(i) == maxCount) {
                int index = -1;
                for (int j = 0; j < reversedS.length; j++) {
                    if (reversedS[j].equals(i)) {
                        index = j;
                        break;
                    }
                }
                if (index > c) {
                    a = i;
                    c = index;
                }
            }
        }

        System.out.println(a);
    }
}

