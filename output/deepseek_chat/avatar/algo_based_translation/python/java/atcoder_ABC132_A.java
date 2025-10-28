
import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        
        HashMap<Character, Integer> c = new HashMap<>();
        for (char ch : S.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        
        HashSet<Character> Sa = new HashSet<>();
        for (char ch : S.toCharArray()) {
            Sa.add(ch);
        }
        
        if (Sa.size() != 2) {
            System.out.println("No");
            return;
        }
        
        for (char i : Sa) {
            if (c.get(i) != 2) {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}

