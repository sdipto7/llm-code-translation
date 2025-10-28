
import java.util.*;
import java.util.stream.*;

public class s828550015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            p.add(scanner.nextInt());
        }
        p = p.stream().sorted(Collections.reverseOrder()).limit(x).collect(Collectors.toList());
        
        List<Integer> q = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            q.add(scanner.nextInt());
        }
        q = q.stream().sorted(Collections.reverseOrder()).limit(y).collect(Collectors.toList());
        
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            r.add(scanner.nextInt());
        }
        r = r.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        
        List<Integer> pq = new ArrayList<>();
        pq.addAll(p);
        pq.addAll(q);
        Collections.sort(pq);
        
        int loopCount = Math.min(Math.min(x + y, a + b), c);
        for (int i = 0; i < loopCount; i++) {
            if (pq.get(i) < r.get(i)) {
                pq.set(i, r.get(i));
            }
        }
        
        int sum = pq.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}

