
import java.util.HashMap;
import java.util.Scanner;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        HashMap<Character, Integer> evenCount = new HashMap<>();
        HashMap<Character, Integer> oddCount = new HashMap<>();

        for (int i = 0; i < chars.length; i += 2) {
            char c = chars[i];
            evenCount.put(c, evenCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < chars.length; i += 2) {
            char c = chars[i];
            oddCount.put(c, oddCount.getOrDefault(c, 0) + 1);
        }

        int flips0 = chars.length - (evenCount.getOrDefault('0', 0) + oddCount.getOrDefault('1', 0));
        int flips1 = chars.length - (evenCount.getOrDefault('1', 0) + oddCount.getOrDefault('0', 0));
        System.out.println(Math.min(flips0, flips1));
    }
}

