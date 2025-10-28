
import java.util.*;

public class s828550015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < a; i++) p.add(sc.nextInt());
        p.sort(Collections.reverseOrder());
        p = p.subList(0, x);
        
        List<Integer> q = new ArrayList<>();
        for (int i = 0; i < b; i++) q.add(sc.nextInt());
        q.sort(Collections.reverseOrder());
        q = q.subList(0, y);
        
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < c; i++) r.add(sc.nextInt());
        r.sort(Collections.reverseOrder());
        
        List<Integer> pq = new ArrayList<>(p);
        pq.addAll(q);
        pq.sort(null);
        
        for (int i = 0; i < Math.min(x + y, Math.min(a + b, c)); i++) {
            if (pq.get(i) < r.get(i)) {
                pq.set(i, r.get(i));
            }
        }
        
        int sum = 0;
        for (int num : pq) sum += num;
        System.out.println(sum);
    }
}

