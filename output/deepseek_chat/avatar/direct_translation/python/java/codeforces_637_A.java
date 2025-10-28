
import java.util.*;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String str : s) {
            w.put(str, w.getOrDefault(str, 0) + 1);
        }
        List<String> reversedS = new ArrayList<>(Arrays.asList(s));
        Collections.reverse(reversedS);
        int maxCount = Collections.max(w.values());
        String result = "";
        int maxIndex = -1;
        for (Map.Entry<String, Integer> entry : w.entrySet()) {
            if (entry.getValue() == maxCount) {
                int index = reversedS.indexOf(entry.getKey());
                if (index > maxIndex) {
                    result = entry.getKey();
                    maxIndex = index;
                }
            }
        }
        System.out.println(result);
    }
}

