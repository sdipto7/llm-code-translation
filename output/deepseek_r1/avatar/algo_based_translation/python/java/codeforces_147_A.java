
import java.util.*;

public class codeforces_147_A {
    public static String processString(String inputStr) {
        StringBuilder res = new StringBuilder();
        Set<Character> punctuation = new HashSet<>(Arrays.asList(',', '.', '!', '?'));
        
        for (int i = 0; i < inputStr.length(); i++) {
            char current = inputStr.charAt(i);
            
            if (i == 0) {
                if (current == ' ' || punctuation.contains(current)) {
                    continue;
                } else {
                    res.append(current);
                }
            } else {
                if (current == ' ') {
                    if (res.length() > 0 && res.charAt(res.length() - 1) != ' ') {
                        res.append(current);
                    }
                } else if (punctuation.contains(current)) {
                    if (res.length() > 0 && res.charAt(res.length() - 1) == ' ') {
                        res.deleteCharAt(res.length() - 1);
                    }
                    res.append(current);
                    res.append(' ');
                } else {
                    res.append(current);
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(processString(input));
        scanner.close();
    }
}

