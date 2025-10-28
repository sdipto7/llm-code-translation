
import java.util.Scanner;
import java.util.ArrayList;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] V = scanner.nextLine().split(" ");
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = Integer.parseInt(V[i]);
        }
        String[] C = scanner.nextLine().split(" ");
        int[] c = new int[N];
        for (int i = 0; i < N; i++) {
            c[i] = Integer.parseInt(C[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < N; i++) {
            if (v[i] - c[i] > 0) {
                list.add(v[i] - c[i]);
            }
        }
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println(sum);
    }
}

