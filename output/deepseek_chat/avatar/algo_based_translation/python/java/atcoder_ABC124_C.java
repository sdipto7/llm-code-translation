import java.util.Scanner;
import java.util.HashMap;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        
        HashMap<Character, Integer> even = new HashMap<>();
        for (int i = 0; i < s.length; i += 2) {
            even.put(s[i], even.getOrDefault(s[i], 0) + 1);
        }
        
        HashMap<Character, Integer> odd = new HashMap<>();
        for (int i = 1; i < s.length; i += 2) {
            odd.put(s[i], odd.getOrDefault(s[i], 0) + 1);
        }
        
        int count1 = s.length - (even.getOrDefault('0', 0) + odd.getOrDefault('1', 0));
        int count2 = s.length - (even.getOrDefault('1', 0) + odd.getOrDefault('0', 0));
        
        System.out.println(Math.min(count1, count2));
    }
}
