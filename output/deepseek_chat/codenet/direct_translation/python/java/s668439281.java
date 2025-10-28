import java.util.*;

public class s668439281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        Map<String, Integer> map = new HashMap<>();
        for (String element : list) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        int maxCount = Collections.max(map.values());
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
