
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;

public class s575946485 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> dic = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            int lastDigit = a[i] % 10;
            dic.put(i, lastDigit == 0 ? 0 : lastDigit - 10);
        }
        int minVal = Collections.min(dic.values());
        int minNum = -1;
        for (int i = 0; i < 5; i++) {
            if (dic.get(i) == minVal) {
                minNum = i;
                break;
            }
        }
        dic.remove(minNum);
        int aSum = 0;
        for (int num : a) {
            aSum += num;
        }
        int sumRemaining = dic.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println(aSum + Math.abs(sumRemaining));
    }
}

