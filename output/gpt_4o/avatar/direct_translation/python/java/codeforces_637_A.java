
import java.util.*;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        String[] s = scanner.nextLine().trim().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String value : s) {
            w.put(value, w.getOrDefault(value, 0) + 1);
        }
        List<String> sList = Arrays.asList(s);
        Collections.reverse(sList);
        int c = -1;
        String a = "";
        int maxCount = Collections.max(w.values());
        for (String i : w.keySet()) {
            if (w.get(i) == maxCount) {
                int currentIndex = sList.indexOf(i);
                if (currentIndex > c) {
                    a = i;
                    c = currentIndex;
                }
            }
        }
        System.out.println(a);
    }
}

