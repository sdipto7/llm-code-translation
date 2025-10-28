import java.util.HashMap;
import java.util.Scanner;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] s = input.toCharArray();
        boolean x = true;
        HashMap<Character, Integer> dt = new HashMap<>();
        for (char i : s) {
            if (dt.containsKey(i)) {
                dt.put(i, dt.get(i) + 1);
            } else {
                dt.put(i, 1);
            }
        }
        int cnt = 0;
        x = true;
        for (HashMap.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
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
