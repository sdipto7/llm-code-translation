
import java.util.*;

public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (new HashSet<Character>(getCharList(s)).size() == 1) {
            System.out.println(0);
            System.exit(0);
        }
        Map<Character, Integer> counter = getCharCount(s);
        int min = Collections.min(counter.values());
        int ans = min * 2;
        System.out.println(ans);
    }

    private static List<Character> getCharList(String s) {
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        return list;
    }

    private static Map<Character, Integer> getCharCount(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        return counter;
    }
}

