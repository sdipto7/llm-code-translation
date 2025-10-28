
import java.util.*;

public class s575946485 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }
        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            int lastDigit = a[i] % 10;
            dic.put(i, lastDigit == 0 ? 0 : lastDigit - 10);
        }
        int minVal = Integer.MAX_VALUE;
        for (int val : dic.values()) {
            if (val < minVal) {
                minVal = val;
            }
        }
        int min_num = -1;
        for (int i = 0; i < 5; i++) {
            if (dic.get(i) == minVal) {
                min_num = i;
                break;
            }
        }
        int a_sum = 0;
        for (int num : a) {
            a_sum += num;
        }
        dic.remove(min_num);
        int sumDic = 0;
        for (int val : dic.values()) {
            sumDic += val;
        }
        sumDic = Math.abs(sumDic);
        System.out.println(a_sum + sumDic);
    }
}

