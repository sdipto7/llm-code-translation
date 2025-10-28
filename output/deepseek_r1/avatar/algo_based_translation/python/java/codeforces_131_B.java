
import java.util.*;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] numbers = scanner.nextLine().split(" ");
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        long pairCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            if (key == 0) {
                pairCount += (long) value * (value - 1);
            } else {
                if (frequencyMap.containsKey(-key)) {
                    pairCount += (long) value * frequencyMap.get(-key);
                }
            }
        }
        
        long totalPairs = pairCount / 2;
        System.out.println(totalPairs);
        scanner.close();
    }
}

