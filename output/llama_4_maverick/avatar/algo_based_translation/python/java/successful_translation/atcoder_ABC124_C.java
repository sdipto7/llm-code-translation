
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] charArray = s.toCharArray();
        Map<Character, Integer> evenCounter = new HashMap<>();
        Map<Character, Integer> oddCounter = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                evenCounter.put(charArray[i], evenCounter.getOrDefault(charArray[i], 0) + 1);
            } else {
                oddCounter.put(charArray[i], oddCounter.getOrDefault(charArray[i], 0) + 1);
            }
        }
        int count1 = charArray.length - (evenCounter.getOrDefault('0', 0) + oddCounter.getOrDefault('1', 0));
        int count2 = charArray.length - (evenCounter.getOrDefault('1', 0) + oddCounter.getOrDefault('0', 0));
        System.out.println(Math.min(count1, count2));
    }
}

