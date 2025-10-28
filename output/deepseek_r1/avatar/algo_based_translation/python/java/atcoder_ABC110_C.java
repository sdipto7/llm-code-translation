
import java.util.*;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(run(s, t));
    }

    public static String run(String s, String t) {
        List<Integer> ss = getSortedFrequency(s);
        List<Integer> tt = getSortedFrequency(t);
        return ss.equals(tt) ? "Yes" : "No";
    }

    private static List<Integer> getSortedFrequency(String str) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : str.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        List<Integer> frequencies = new ArrayList<>(count.values());
        Collections.sort(frequencies);
        return frequencies;
    }
}

