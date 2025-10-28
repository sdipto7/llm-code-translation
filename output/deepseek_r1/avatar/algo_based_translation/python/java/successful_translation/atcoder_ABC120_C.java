
import java.util.*;

public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }
        if (uniqueChars.size() == 1) {
            System.out.println(0);
            System.exit(0);
        }
        
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        int minCount = Integer.MAX_VALUE;
        for (int count : countMap.values()) {
            if (count < minCount) {
                minCount = count;
            }
        }
        
        System.out.println(minCount * 2);
    }
}

