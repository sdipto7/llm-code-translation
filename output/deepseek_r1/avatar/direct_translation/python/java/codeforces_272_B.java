
import java.util.*;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        Map<Integer, Integer> countMap = new HashMap<>();
        for (String part : parts) {
            int num = Integer.parseInt(part);
            int y = f(num);
            countMap.put(y, countMap.getOrDefault(y, 0) + 1);
        }
        long sumSquares = 0;
        long sumCounts = 0;
        for (int count : countMap.values()) {
            sumSquares += (long) count * count;
            sumCounts += count;
        }
        long result = (sumSquares - sumCounts) /
