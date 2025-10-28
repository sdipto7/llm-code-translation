
import java.util.*;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] sArray = scanner.nextLine().trim().split("\\s+");
        
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : sArray) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        List<String> reversedSList = new ArrayList<>(Arrays.asList(sArray));
        Collections.reverse(reversedSList);
        
        int maxCount = Collections.max(frequencyMap.values());
        
        int c = -1;
        String a = "";
        for (String word : frequencyMap.keySet()) {
            if (frequencyMap.get(word) == maxCount) {
                int idx = reversedSList.indexOf(word);
                if (idx > c) {
                    c = idx;
                    a = word;
                }
            }
        }
        
        System.out.println(a);
    }
}

