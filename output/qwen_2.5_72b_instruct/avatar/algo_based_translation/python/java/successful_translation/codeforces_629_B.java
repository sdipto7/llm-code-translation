
import java.util.Scanner;

public class codeforces_629_B {
    public static void main(String[] args) {
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        input.nextLine();
        for (int j = 0; j < i; j++) {
            String[] line = input.nextLine().split(" ");
            String x = line[0];
            int a = Integer.parseInt(line[1]);
            int b = Integer.parseInt(line[2]) + 1;
            if (x.equals("M")) {
                m[a] += 2;
                m[b] -= 2;
            } else {
                f[a] += 2;
                f[b] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int j = 0; j < N; j++) {
            a += m[j];
            b += f[j];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

