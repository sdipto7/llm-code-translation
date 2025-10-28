
import java.util.*;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        
        String result = "Yes";
        Map<String, Integer> countMap = new HashMap<>();
        String previous = null;
        
        for (String current : list) {
            countMap.put(current, countMap.getOrDefault(current, 0) + 1);
            if (countMap.get(current) >= 2) {
                result = "No";
            }
            
            if (previous != null) {
                char lastChar = previous.charAt(previous.length() - 1);
                char firstChar = current.charAt(0);
                if (lastChar != firstChar) {
                    result = "No";
                }
            }
            
            previous = current;
        }
        
        System.out.println(result);
    }
}

