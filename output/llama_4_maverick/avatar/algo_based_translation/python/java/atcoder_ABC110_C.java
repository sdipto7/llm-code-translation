
import java.util.*;

public class atcoder_ABC110_C {
    public static String run(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for (char c : s.toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }
        List<Integer> ss = new ArrayList<>(mapS.values());
        List<Integer> tt = new ArrayList<>(mapT.values());
        Collections.sort(ss);
        Collections.sort(tt);
        return ss.equals(tt) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        System.out.println(run(s, t));
    }
}

