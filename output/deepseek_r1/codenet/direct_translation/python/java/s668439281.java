
import java.util.*;

public class s668439281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int max = 0;
        for (int count : map.values()) {
            if (count > max) {
                max = count;
            }
        }
        List<String> maxKeys = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                maxKeys.add(entry.getKey());
            }
        }
        Collections.sort(maxKeys);
        for (String s : maxKeys) {
            System.out.println(s);
        }
    }
}

