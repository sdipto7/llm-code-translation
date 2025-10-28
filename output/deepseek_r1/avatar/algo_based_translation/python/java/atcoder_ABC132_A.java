
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char ch : S.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char ch : S.toCharArray()) {
            uniqueChars.add(ch);
        }
        
        if (uniqueChars.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }
        
        for (char ch : uniqueChars) {
            if (charCount.get(ch) != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        
        System.out.println("Yes");
    }
}

