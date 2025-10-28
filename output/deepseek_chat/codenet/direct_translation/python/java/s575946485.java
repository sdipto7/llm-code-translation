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
            String lastDigit = String.valueOf(a[i]).substring(String.valueOf(a[i]).length() - 1);
            if (lastDigit.equals("0")) {
                dic.put(i, 0);
            } else {
                dic.put(i, Integer.parseInt(lastDigit) - 10);
            }
        }
        int min_num = dic.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
        int a_sum = Arrays.stream(a).sum();
        dic.remove(min_num);
        System.out.println(Math.abs(dic.values().stream().mapToInt(Integer::intValue).sum()) + a_sum);
    }
}
