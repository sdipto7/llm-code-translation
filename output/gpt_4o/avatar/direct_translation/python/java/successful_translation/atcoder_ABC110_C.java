
import java.util.*;

public class atcoder_ABC110_C {
    public static String run(String s, String t) {
        List<Integer> ss = new ArrayList<>(getFrequencyValues(s));
        List<Integer> tt = new ArrayList<>(getFrequencyValues(t));
        Collections.sort(ss);
        Collections.sort(tt);
        if (ss.equals(tt)) {
            return "Yes";
        } else {
            return "No";
        }
    }
    
    private static Collection<Integer> getFrequencyValues(String str) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : str.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        return counter.values();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(run(s, t));
    }
}

