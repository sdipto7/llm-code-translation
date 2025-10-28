import java.util.*;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(run(s, t));
    }

    private static String run(String s, String t) {
        List<Integer> sCounts = getSortedCounts(s);
        List<Integer> tCounts = getSortedCounts(t);
        return sCounts.equals(tCounts) ? "Yes" : "No";
    }

    private static List<Integer> getSortedCounts(String str) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : str.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        List<Integer> counts = new ArrayList<>(counter.values());
        Collections.sort(counts);
        return counts;
    }
}
