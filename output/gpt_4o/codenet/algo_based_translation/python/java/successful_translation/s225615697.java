
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s225615697 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        List<Integer> result = calculateSequence(n, a);
        
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }
    }

    public static List<Integer> calculateSequence(int n, int[] a) {
        int m1 = 0;
        for (int i = 0; i < n; i++) {
            m1 += a[i] * ((i % 2 == 0) ? 1 : -1);
        }
        m1 /= 2;

        List<Integer> m = new ArrayList<>(n);
        m.add(m1);
        for (int i = 1; i < n; i++) {
            m.add(a[i - 1] - m.get(i - 1));
        }

        List<Integer> output = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            output.add(m.get(i) * 2);
        }

        return output;
    }
}

