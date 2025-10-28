
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class s575946485 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }
        
        HashMap<Integer, Integer> dic = new HashMap<>();
        
        for (int i = 0; i < 5; i++) {
            String numStr = String.valueOf(a[i]);
            char lastChar = numStr.charAt(numStr.length() - 1);
            if (lastChar == '0') {
                dic.put(i, 0);
            } else {
                int lastDigit = Character.getNumericValue(lastChar);
                dic.put(i, lastDigit - 10);
            }
        }
        
        int minValue = Integer.MAX_VALUE;
        for (int value : dic.values()) {
            if (value < minValue) {
                minValue = value;
            }
        }
        
        ArrayList<Integer> minKeys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : dic.entrySet()) {
            if (entry.getValue() == minValue) {
                minKeys.add(entry.getKey());
            }
        }
        
        int minNum = minKeys.get(0);
        
        int aSum = 0;
        for (int num : a) {
            aSum += num;
        }
        
        dic.remove(minNum);
        
        int dicSum = 0;
        for (int value : dic.values()) {
            dicSum += value;
        }
        
        int result = Math.abs(dicSum) + aSum;
        System.out.println(result);
    }
}

