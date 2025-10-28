
import java.util.*;

public class s828550015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Integer[] p = new Integer[a];
        for (int i = 0; i < a; i++) {
            p[i] = scanner.nextInt();
        }
        Arrays.sort(p, Collections.reverseOrder());
        List<Integer> pList = Arrays.asList(p).subList(0, x);

        Integer[] q = new Integer[b];
        for (int i = 0; i < b; i++) {
            q[i] = scanner.nextInt();
        }
        Arrays.sort(q, Collections.reverseOrder());
        List<Integer> qList = Arrays.asList(q).subList(0, y);

        Integer[] r = new Integer[c];
        for (int i = 0; i < c; i++) {
            r[i] = scanner.nextInt();
        }
        Arrays.sort(r, Collections.reverseOrder());

        List<Integer> pq = new ArrayList<>();
        pq.addAll(pList);
        pq.addAll(qList);
        Collections.sort(pq);

        int minSize = Math.min(Math.min(x + y, a + b), c);
        for (int i = 0; i < minSize; i++) {
            if (pq.get(i) < r[i]) {
                pq.set(i, r[i]);
            }
        }

        int sum = pq.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}

