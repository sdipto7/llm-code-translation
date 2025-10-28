
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class s575946485 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }
        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            if (String.valueOf(a[i]).charAt(String.valueOf(a[i]).length() - 1) == '0') {
                dic.put(i, 0);
            } else {
                dic.put(i, Integer.parseInt(String.valueOf(a[i]).substring(String.valueOf(a[i]).length() - 1)) - 10);
            }
        }
        int minNum = dic.entrySet().stream().min((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())).get().getKey();
        int aSum = 0;
        for (int num : a) {
            aSum += num;
        }
        dic.remove(minNum);
        int sum = 0;
        for (int value : dic.values()) {
            sum += value;
        }
        System.out.println(Math.abs(sum) + aSum);
    }
}

