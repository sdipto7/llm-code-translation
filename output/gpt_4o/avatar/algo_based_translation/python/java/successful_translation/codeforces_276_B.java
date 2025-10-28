
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_276_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read input and convert to list of characters
        String input = scanner.nextLine();
        char[] s = input.toCharArray();

        // Initialize variables
        boolean x = true;
        Map<Character, Integer> dt = new HashMap<>();

        // Count occurrences of each character
        for (char i : s) {
            dt.put(i, dt.getOrDefault(i, 0) + 1);
        }

        // Check number of odd occurrences
        int cnt = 0;
        x = true;
        for (int value : dt.values()) {
            if (value % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (value % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }

        // Determine and print the winner
        if (x) {
            System.out.println("First");
        } else if (!x && s.length % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length % 2 != 0) {
            System.out.println("First");
        }

        scanner.close();
    }
}

