
import java.util.*;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> res = new ArrayList<>();
        String[] punctuation = {",", ".", "!", "?"};
        for (int i = 0; i < s.length(); i++) {
            String charStr = String.valueOf(s.charAt(i));
            if (i >= 1) {
                if (charStr.equals(" ")) {
                    if (!res.get(res.size() - 1).equals(" ")) {
                        res.add(charStr);
                    }
                } else if (Arrays.asList(punctuation).contains(charStr)) {
                    if (res.get(res.size() - 1).equals(" ")) {
                        res.remove(res.size() - 1);
                    }
                    res.add(charStr);
                    res.add(" ");
                } else {
                    res.add(charStr);
                }
            } else {
                if (charStr.equals(" ")) {
                    continue;
                } else if (Arrays.asList(punctuation).contains(charStr)) {
                    continue;
                } else {
                    res.add(charStr);
                }
            }
        }
        System.out.println(String.join("", res));
    }
}

