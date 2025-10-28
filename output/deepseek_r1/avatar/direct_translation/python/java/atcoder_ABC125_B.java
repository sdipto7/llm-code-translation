
import java.util.*;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] V = new int[N];
        String[] vParts = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            V[i] = Integer.parseInt(vParts[i]);
        }
        int[] C = new int[N];
        String[] cParts = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            C[i] = Integer.parseInt(cParts[i]);
        }
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < N; i++) {
            int diff = V[i] - C[i];
            if (diff > 0) {
                list.add(diff);
            }
        }
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println(sum);
    }
}

