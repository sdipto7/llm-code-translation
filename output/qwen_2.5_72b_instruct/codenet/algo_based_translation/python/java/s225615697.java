import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s225615697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int m1 = (int) (sumAlternatingProducts(a) / 2);
        String result = Integer.toString(m1);
        List<Integer> m = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            m.add(null);
        }
        m.set(0, m1);
        for (int i = 1; i < n; i++) {
            m.set(i, a.get(i - 1) - m.get(i - 1));
        }
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            output.append(m.get(i) * 2).append(" ");
        }
        System.out.println(output.toString().trim());
    }

    private static int sumAlternatingProducts(List<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i) * Math.pow(-1, i);
        }
        return sum;
    }
}
