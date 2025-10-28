import java.util.*;

public class atcoder_ABC110_C {
    public static String run(String s, String t) {
        List<Integer> ss = new ArrayList<>(new HashMap<>(getCharacterCounts(s)).values());
        List<Integer> tt = new ArrayList<>(new HashMap<>(getCharacterCounts(t)).values());
        Collections.sort(ss);
        Collections.sort(tt);
        return ss.equals(tt) ? "Yes" : "No";
    }

    private static Map<Character, Integer> getCharacterCounts(String str) {
        Map<Character, Integer> characterCounts = new HashMap<>();
        for (char c : str.toCharArray()) {
            characterCounts.put(c, characterCounts.getOrDefault(c, 0) + 1);
        }
        return characterCounts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(run(s, t));
    }
}
