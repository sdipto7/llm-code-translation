
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = processString(s);
        System.out.println(result);
    }
    
    public static String processString(String s) {
        List<Character> res = new ArrayList<>();
        List<Character> punctuation = Arrays.asList(',', '.', '!', '?');
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (i >= 1) {
                if (currentChar == ' ') {
                    if (res.get(res.size() - 1) != ' ') {
                        res.add(currentChar);
                    }
                } else if (punctuation.contains(currentChar)) {
                    if (res.size() > 0 && res.get(res.size() - 1) == ' ') {
                        res.remove(res.size() - 1);
                    }
                    res.add(currentChar);
                    res.add(' ');
                } else {
                    res.add(currentChar);
                }
            } else {
                if (currentChar == ' ') {
                    continue;
                }
                if (punctuation.contains(currentChar)) {
                    continue;
                } else {
                    res.add(currentChar);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : res) {
            sb.append(c);
        }
        return sb.toString();
    }
}

