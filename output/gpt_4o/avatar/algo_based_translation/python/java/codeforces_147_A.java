
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_147_A {

    public static void main(String[] args) {
        processString();
    }

    public static void processString() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> res = new ArrayList<>();
        List<String> punctuation = List.of(",", ".", "!", "?");

        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));

            if (i >= 1) {
                if (currentChar.equals(" ")) {
                    if (!res.isEmpty() && !res.get(res.size() - 1).equals(" ")) {
                        res.add(currentChar);
                    }
                } else {
                    if (punctuation.contains(currentChar)) {
                        if (!res.isEmpty() && res.get(res.size() - 1).equals(" ")) {
                            res.remove(res.size() - 1);
                        }
                        res.add(currentChar);
                        res.add(" ");
                    } else {
                        res.add(currentChar);
                    }
                }
            } else {
                if (!currentChar.equals(" ") && !punctuation.contains(currentChar)) {
                    res.add(currentChar);
                }
            }
        }

        System.out.println(String.join("", res));
        scanner.close();
    }
}

