
import java.util.*;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> res = new ArrayList<>();
        Set<Character> punctuation = new HashSet<>(Arrays.asList(',', '.', '!', '?'));
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i >= 1) {
                if (c == '\0') {
                    if (!res.isEmpty() && !res.get(res.size() - 1).equals("")) {
                        res.add(Character.toString(c));
                    }
                } else {
                    if (punctuation.contains(c)) {
                        if (!res.isEmpty() && res.get(res.size() - 1).equals("")) {
                            res.remove(res.size() - 1);
                        }
                        res.add(Character.toString(c));
                        res.add("");
                    } else {
                        res.add(Character.toString(c));
                    }
                }
            } else {
                if (c == '\0') {
                    continue;
                }
                if (punctuation.contains(c)) {
                    continue;
                } else {
                    res.add(Character.toString(c));
                }
            }
        }
        System.out.println(String.join("", res));
    }
}

