import java.util.*;
public class s828550015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Integer[] p = new Integer[x];
        Integer[] q = new Integer[y];
        Integer[] r = new Integer[a + b + c];
        for (int i = 0; i < x; i++) p[i] = sc.nextInt();
        for (int i = 0; i < y; i++) q[i] = sc.nextInt();
        for (int i = 0; i < a + b + c; i++) r[i] = sc.nextInt();
        Arrays.sort(p, Collections.reverseOrder());
        Arrays.sort(q, Collections.reverseOrder());
        Arrays.sort(r, Collections.reverseOrder());
        Integer[] pq = new Integer[x + y];
        System.arraycopy(p, 0, pq, 0, x);
        System.arraycopy(q, 0, pq, x, y);
        Arrays.sort(pq);
        for (int i = 0; i < Math.min(x + y, Math.min(a + b, c)); i++) {
            if (pq[i] < r[i]) pq[i] = r[i];
        }
        System.out.println(Arrays.stream(pq).mapToInt(Integer::intValue).sum());
    }
}
