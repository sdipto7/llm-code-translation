
import java.util.*;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine());
        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            String[] parts = scanner.nextLine().split(" ");
            List<Integer> query = new ArrayList<>();
            for (String part : parts) {
                query.add(Integer.parseInt(part));
            }
            queries.add(query);
        }
        List<int[]> results = processQueries(queries);
        for (int[] res : results) {
            System.out.println(res[0] + " " + res[1]);
        }
    }

    public static List<int[]> processQueries(List<List<Integer>> queries) {
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        int sumP1 = 0, sumP2 = 0, sumB = 0;
        List<int[]> results = new ArrayList<>();

        for (List<Integer> query : queries) {
            if (query.get(0) == 2) {
                int median;
                if (p1.size() == p2.size()) {
                    median = -p2.peek();
                } else {
                    median = p1.peek();
                }
                int cost = (sumP1 - median * p1.size()) + (median * p2.size() - sumP2) + sumB;
                results.add(new int[]{median, cost});
            } else {
                int x = query.get(1);
                int b = query.get(2);
                sumB += b;

                if (p1.isEmpty() || x >= p1.peek()) {
                    p1.offer(x);
                    sumP1 += x;
                } else {
                    p2.offer(-x);
                    sumP2 += x;
                }

                if (p1.size() < p2.size()) {
                    int k = p2.poll();
                    p1.offer(-k);
                    sumP2 += k;
                    sumP1 -= k;
                }
                if (p1.size() - p2.size() > 1) {
                    int k = p1.poll();
                    p2.offer(-k);
                    sumP1 -= k;
                    sumP2 += k;
                }
            }
        }
        return results;
    }
}

