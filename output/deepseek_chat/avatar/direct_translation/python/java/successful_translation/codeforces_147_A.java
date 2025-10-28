
import java.util.ArrayList;
import java.util.List;

public class codeforces_147_A {
    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).nextLine();
        List<Character> res = new ArrayList<>();
        char[] punctuation = {',', '.', '!', '?'};
        for (int i = 0; i < s.length(); i++) {
            if (i >= 1) {
                if (s.charAt(i) == ' ') {
                    if (res.get(res.size() - 1) != ' ') {
                        res.add(s.charAt(i));
                    } else {
                        continue;
                    }
                } else {
                    if (isPunctuation(s.charAt(i), punctuation)) {
                        if (res.get(res.size() - 1) == ' ') {
                            res.remove(res.size() - 1);
                        }
                        res.add(s.charAt(i));
                        res.add(' ');
                    } else {
                        res.add(s.charAt(i));
                    }
                }
            } else {
                if (s.charAt(i) == ' ') {
                    continue;
                }
                if (isPunctuation(s.charAt(i), punctuation)) {
                    continue;
                } else {
                    res.add(s.charAt(i));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : res) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }

    private static boolean isPunctuation(char c, char[] punctuation) {
        for (char p : punctuation) {
            if (c == p) {
                return true;
            }
        }
        return false;
    }
}

