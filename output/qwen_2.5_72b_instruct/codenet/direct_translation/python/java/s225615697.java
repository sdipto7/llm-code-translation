import java.util.Scanner;

public class s225615697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m1 = (int) (java.util.stream.IntStream.range(0, n).map(i -> a[i] * ((-1) * i)).sum() / 2);
        String result = String.valueOf(m1);

        int[] m = new int[n];
        m[0] = m1;
        for (int i = 1; i < n; i++) {
            m[i] = a[i - 1] - m[i - 1];
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            output.append(m[i] * 2).append(" ");
        }
        System.out.println(output.toString().trim());
    }
}
