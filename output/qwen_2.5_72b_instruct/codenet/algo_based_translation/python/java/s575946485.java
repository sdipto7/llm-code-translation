import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class s575946485 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> dic = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            a.add(scanner.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            if (String.valueOf(a.get(i)).endsWith("0")) {
                dic.put(i, 0);
            } else {
                dic.put(i, Integer.parseInt(String.valueOf(a.get(i)).substring(String.valueOf(a.get(i)).length() - 1)) - 10);
            }
        }

        int minValue = Integer.MAX_VALUE;
        for (int value : dic.values()) {
            if (value < minValue) {
                minValue = value;
            }
        }

        List<Integer> minNumList = new ArrayList<>();
        for (int key : dic.keySet()) {
            if (dic.get(key) == minValue) {
                minNumList.add(key);
            }
        }

        int minNum = minNumList.get(0);
        int aSum = 0;
        for (int num : a) {
            aSum += num;
        }

        dic.remove(minNum);

        int result = Math.abs(dic.values().stream().mapToInt(Integer::intValue).sum()) + aSum;
        System.out.println(result);
    }
}
