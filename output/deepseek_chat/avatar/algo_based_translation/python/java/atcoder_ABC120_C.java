
import java.util.*;
import java.io.*;

public class atcoder_ABC120_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        
        if (set.size() == 1) {
            System.out.println(0);
            return;
        }
        
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        
        int minCount = Integer.MAX_VALUE;
        for (int count : counter.values()) {
            if (count < minCount) {
                minCount = count;
            }
        }
        
        int ans = minCount * 2;
        System.out.println(ans);
    }
}

