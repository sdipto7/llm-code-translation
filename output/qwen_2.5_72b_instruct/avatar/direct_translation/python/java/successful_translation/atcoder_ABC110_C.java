import java.util.*;

public class atcoder_ABC110_C {
    public static String run(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        List<Integer> sList = new ArrayList<>(sMap.values());
        List<Integer> tList = new ArrayList<>(tMap.values());

        Collections.sort(sList);
        Collections.sort(tList);

        return sList.equals(tList) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(run(s, t));
    }
}
