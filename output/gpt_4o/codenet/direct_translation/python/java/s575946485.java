
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

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

        int minNum = 0;
        int minValue = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : dic.entrySet()) {
            if (entry.getValue() < minValue) {
                minValue = entry.getValue();
                minNum = entry.getKey();
            }
        }
        
        int aSum = 0;
        for (int num : a) {
            aSum += num;
        }

        dic.remove(minNum);

        int dicSum = 0;
        for (int value : dic.values()) {
            dicSum += value;
        }

        System.out.println(Math.abs(dicSum) + aSum);
    }
}

