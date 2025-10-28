
import java.util.*;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] s = input.toCharArray();
        boolean x = true;
        HashMap<Character, Integer> dt = new HashMap<>();
        for (char i : s) {
            dt.put(i, dt.getOrDefault(i, 0) + 1);
        }
        int cnt = 0;
        x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            int value = entry.getValue();
            if (value % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (value % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.length % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length % 2 != 0) {
            System.out.println("First");
        }
    }
}

