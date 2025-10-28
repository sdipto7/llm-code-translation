
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class atcoder_ABC132_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();
        
        String result = checkString(S);
        System.out.println(result);
    }

    public static String checkString(String S) {
        Map<Character, Integer> c = new HashMap<>();
        
        for (char ch : S.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        
        Set<Character> Sa = new HashSet<>();
        for (char ch : S.toCharArray()) {
            Sa.add(ch);
        }

        if (Sa.size() != 2) {
            return "No";
        }

        for (char i : Sa) {
            if (c.get(i) != 2) {
                return "No";
            }
        }
        
        return "Yes";
    }
}

