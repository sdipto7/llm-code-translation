
import java.util.*;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character, Integer> dt = new HashMap<>();
        for (char c : s.toCharArray()) {
            dt.put(c, dt.getOrDefault(c, 0) + 1);
        }
        
        int cnt = 0;
        boolean x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            int value = entry.getValue();
            if (value % 2 != 0) {
                if (cnt < 1) {
                    cnt++;
                } else {
                    x = false;
                    break;
                }
            }
        }
        
        if (x) {
            System.out.println("First");
        } else {
            if (s.length() % 2 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }
}

