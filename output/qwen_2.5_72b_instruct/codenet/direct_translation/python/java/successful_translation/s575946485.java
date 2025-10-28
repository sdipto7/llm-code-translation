import java.util.*;

public class s575946485 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }

        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            if (String.valueOf(a[i]).endsWith("0")) {
                dic.put(i, 0);
            } else {
                dic.put(i, Integer.parseInt(String.valueOf(a[i]).substring(String.valueOf(a[i]).length() - 1)) - 10);
            }
        }

        int min_num = -1;
        int minValue = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : dic.entrySet()) {
            if (entry.getValue() < minValue) {
                minValue = entry.getValue();
                min_num = entry.getKey();
            }
        }

        int a_sum = Arrays.stream(a).sum();
        dic.remove(min_num);
        int dicSum = dic.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println(Math.abs(dicSum) + a_sum);
    }
}
