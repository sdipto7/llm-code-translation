
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_147_A {
    public static String processString(String inputString) {
        String s = inputString;
        List<String> res = new ArrayList<>();
        List<String> punctuation = List.of(",", ".", "!", "?");

        for (int i = 0; i < s.length(); i++) {
            if (i >= 1) {
                if (s.charAt(i) == ' ') {
                    if (!res.get(res.size() - 1).equals("")) {
                        res.add(String.valueOf(s.charAt(i)));
                    } else {
                        continue;
                    }
                } else {
                    if (punctuation.contains(String.valueOf(s.charAt(i)))) {
                        if (res.get(res.size() - 1).equals("")) {
                            res.remove(res.size() - 1);
                        }
                        res.add(String.valueOf(s.charAt(i)));
                        res.add(" ");
                    } else {
                        res.add(String.valueOf(s.charAt(i)));
                    }
                }
            } else {
                if (s.charAt(i) == ' ') {
                    continue;
                }
                if (punctuation.contains(String.valueOf(s.charAt(i)))) {
                    continue;
                } else {
                    res.add(String.valueOf(s.charAt(i)));
                }
            }
        }

        return String.join("", res);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = processString(input);
        System.out.println(result);
        scanner.close();
    }
}

