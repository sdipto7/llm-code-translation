
import java.util.*;

public class s043545989 {

    public static String checkCondition(int N, List<Integer> a) {
        Map<Integer, Integer> B = new HashMap<>();
        for (int num : a) {
            B.put(num, B.getOrDefault(num, 0) + 1);
        }
        List<Integer> k = new ArrayList<>(B.keySet());
        List<Integer> v = new ArrayList<>(B.values());

        if (B.size() == 3 && (k.get(0) ^ k.get(1) ^ k.get(2)) == 0 && v.get(0).equals(v.get(1)) && v.get(1).equals(v.get(2))) {
            return "Yes";
        } else if (B.size() == 2 && k.contains(0) && (v.get(0) == 2 * v.get(1) || v.get(1) == 2 * v.get(0))) {
            return "Yes";
        } else if (B.size() == 1 && k.contains(0)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            a.add(scanner.nextInt());
        }
        String result = checkCondition(N, a);
        System.out.println(result);
    }
}

