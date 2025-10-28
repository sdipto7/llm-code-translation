import java.util.*;

public class s957164965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            p.add(scanner.nextInt());
        }
        Collections.sort(p);
        Map<Integer, List<Integer>> candidates = new HashMap<>();
        for (int i = -1; i <= 101; i++) {
            if (p.contains(i)) {
                continue;
            }
            if (!candidates.containsKey(Math.abs(X - i))) {
                candidates.put(Math.abs(X - i), new ArrayList<>());
            }
            candidates.get(Math.abs(X - i)).add(i);
        }
        int smallest = Collections.min(candidates.keySet());
        int minNum = Collections.min(candidates.get(smallest));
        System.out.println(minNum);
    }
}
