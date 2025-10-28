
import java.util.*;

public class s622795537 {

    public static List<String> processStrings(int n, List<String> inputs) {
        Map<String, Integer> arr = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = inputs.get(i);
            
            if (!arr.containsKey(s)) {
                arr.put(s, 1);
            } else {
                arr.put(s, arr.get(s) + 1);
            }
        }

        int maxCount = Collections.max(arr.values());

        List<String> dic = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : arr.entrySet()) {
            if (entry.getValue() == maxCount) {
                dic.add(entry.getKey());
            }
        }

        Collections.sort(dic);
        return dic;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> inputs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputs.add(scanner.nextLine());
        }

        List<String> results = processStrings(n, inputs);

        for (String result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}

