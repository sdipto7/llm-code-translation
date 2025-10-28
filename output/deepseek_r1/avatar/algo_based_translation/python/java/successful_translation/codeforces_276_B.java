
import java.util.HashMap;
import java.util.Scanner;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        boolean x = true;
        HashMap<Character, Integer> dt = new HashMap<>();
        
        for (char i : s) {
            dt.put(i, dt.getOrDefault(i, 0) + 1);
        }
        
        int cnt = 0;
        x = true;
        
        for (HashMap.Entry<Character, Integer> entry : dt.entrySet()) {
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
            if (s.length % 2 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
        
        scanner.close();
    }
}

