
import java.util.*;
import java.util.stream.Collectors;

public class s828550015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();

        List<Integer> p = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((i, j) -> j - i)
                .limit(x)
                .collect(Collectors.toList());

        List<Integer> q = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((i, j) -> j - i)
                .limit(y)
                .collect(Collectors.toList());

        List<Integer> r = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((i, j) -> j - i)
                .collect(Collectors.toList());

        List<Integer> pq = new ArrayList<>();
        pq.addAll(p);
        pq.addAll(q);
        Collections.sort(pq);

        int iterations = Math.min(pq.size(), Math.min(a + b, c));
        for (int i = 0; i < iterations; i++) {
            if (r.get(i) > pq.get(i)) {
                pq.set(i, r.get(i));
            }
        }

        long sum = pq.stream().mapToLong(Long::valueOf).sum();
        System.out.println(sum);
    }
}

