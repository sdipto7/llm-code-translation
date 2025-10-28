import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class s101447419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        int[] ve = new int[n / 2];
        int[] vo = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            ve[i] = v[2 * i];
            vo[i] = v[2 * i + 1];
        }
        Map<Integer, Integer> ce = getFrequencyMap(ve);
        Map<Integer, Integer> co = getFrequencyMap(vo);
        int ans = n;
        Map.Entry<Integer, Integer> mostCommonCe = getMostCommonEntry(ce);
        Map.Entry<Integer, Integer> mostCommonCo = getMostCommonEntry(co);
        if (!mostCommonCe.getKey().equals(mostCommonCo.getKey())) {
            ans = n - mostCommonCe.getValue() - mostCommonCo.getValue();
        } else if (ce.size() == 1 && co.size() == 1) {
            ans = n - mostCommonCe.getValue();
        } else if (ce.size() == 1) {
            ans = n - mostCommonCe.getValue() - getSecondMostCommonValue(co);
        } else if (co.size() == 1) {
            ans = n - getSecondMostCommonValue(ce) - mostCommonCo.getValue();
        } else {
            ans = Math.min(n - mostCommonCe.getValue() - getSecondMostCommonValue(co), n - getSecondMostCommonValue(ce) - mostCommonCo.getValue());
        }
        System.out.println(ans);
    }

    private static Map<Integer, Integer> getFrequencyMap(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }

    private static Map.Entry<Integer, Integer> getMostCommonEntry(Map<Integer, Integer> frequencyMap) {
        Map.Entry<Integer, Integer> mostCommonEntry = null;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (mostCommonEntry == null || entry.getValue() > mostCommonEntry.getValue()) {
                mostCommonEntry = entry;
            }
        }
        return mostCommonEntry;
    }

    private static int getSecondMostCommonValue(Map<Integer, Integer> frequencyMap) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int value : frequencyMap.values()) {
            if (value > firstMax) {
                secondMax = firstMax;
                firstMax = value;
            } else if (value > secondMax && value != firstMax) {
                secondMax = value;
            }
        }
        return secondMax;
    }
}
