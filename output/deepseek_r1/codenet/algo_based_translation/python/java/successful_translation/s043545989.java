
import java.util.*;

public class s043545989 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        List<Integer> a = new ArrayList<>();
        for (String num : inputArray) {
            a.add(Integer.parseInt(num));
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : a) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mapSize = frequencyMap.size();
        if (mapSize == 3) {
            List<Integer> keys = new ArrayList<>(frequencyMap.keySet());
            int xorResult = keys.get(0) ^ keys.get(1) ^ keys.get(2);
            int firstCount = frequencyMap.get(keys.get(0));
            if (xorResult == 0 && firstCount == frequencyMap.get(keys.get(1)) && firstCount == frequencyMap.get(keys.get(2))) {
                System.out.println("Yes");
                return;
            }
        } else if (mapSize == 2) {
            if (frequencyMap.containsKey(0)) {
                int zeroCount = frequencyMap.get(0);
                int otherCount = 0;
                for (int key : frequencyMap.keySet()) {
                    if (key != 0) {
                        otherCount = frequencyMap.get(key);
                        break;
                    }
                }
                if (zeroCount == 2 * otherCount || otherCount == 2 * zeroCount) {
                    System.out.println("Yes");
                    return;
                }
            }
        } else if (mapSize == 1) {
            if (frequencyMap.containsKey(0)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}

