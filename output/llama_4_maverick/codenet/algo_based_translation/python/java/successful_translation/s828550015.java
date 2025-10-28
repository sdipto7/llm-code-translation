
import java.util.Arrays;
import java.util.Scanner;

public class s828550015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        int a = Integer.parseInt(inputs[2]);
        int b = Integer.parseInt(inputs[3]);
        int c = Integer.parseInt(inputs[4]);

        int[] firstList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] thirdList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(firstList);
        int[] p = new int[x];
        System.arraycopy(firstList, firstList.length - x, p, 0, x);

        Arrays.sort(secondList);
        int[] q = new int[y];
        System.arraycopy(secondList, secondList.length - y, q, 0, y);

        Arrays.sort(thirdList);
        int[] r = new int[Math.min(x + y, Math.min(a, Math.min(b, c)))];
        System.arraycopy(thirdList, thirdList.length - r.length, r, 0, r.length);

        int[] pq = new int[x + y];
        System.arraycopy(p, 0, pq, 0, x);
        System.arraycopy(q, 0, pq, x, y);
        Arrays.sort(pq);

        for (int i = 0; i < r.length; i++) {
            if (pq[i] < r[r.length - 1 - i]) {
                pq[i] = r[r.length - 1 - i];
            }
        }

        long sum = 0;
        for (int num : pq) {
            sum += num;
        }

        System.out.println(sum);
    }
}

