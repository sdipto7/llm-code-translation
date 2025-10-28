
import java.util.Arrays;
import java.util.Scanner;

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
        Arrays.sort(p, (o1, o2) -> o2 - o1);
        Integer[] pTop = Arrays.copyOfRange(p, 0, x);

        Integer[] q = new Integer[b];
        for (int i = 0; i < b; i++) {
            q[i] = scanner.nextInt();
        }
        Arrays.sort(q, (o1, o2) -> o2 - o1);
        Integer[] qTop = Arrays.copyOfRange(q, 0, y);

        Integer[] r = new Integer[c];
        for (int i = 0; i < c; i++) {
            r[i] = scanner.nextInt();
        }
        Arrays.sort(r, (o1, o2) -> o2 - o1);

        Integer[] pq = new Integer[x + y];
        System.arraycopy(pTop, 0, pq, 0, x);
        System.arraycopy(qTop, 0, pq, x, y);

        Arrays.sort(pq);

        int limit = Math.min(x + y, Math.min(a + b, c));
        for (int i = 0; i < limit; i++) {
            if (pq[i] < r[i]) {
                pq[i] = r[i];
            }
        }

        int sum = 0;
        for (int value : pq) {
            sum += value;
        }

        System.out.println(sum);

        scanner.close();
    }
}

