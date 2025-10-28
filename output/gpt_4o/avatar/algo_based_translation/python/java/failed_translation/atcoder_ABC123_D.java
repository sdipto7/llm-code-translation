
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC123_D {

    public static List<Integer> computeTopSums(int x, int y, int z, int k, List<Integer> a, List<Integer> b, List<Integer> c) {
        List<Integer> ab = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab.add(a.get(i) + b.get(j));
            }
        }
        Collections.sort(ab, Collections.reverseOrder());

        List<Integer> abc = new ArrayList<>();
        for (int i = 0; i < Math.min(k, x * y); i++) {
            for (int j = 0; j < z; j++) {
                abc.add(ab.get(i) + c.get(j));
            }
        }
        Collections.sort(abc, Collections.reverseOrder());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(abc.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            a.add(scanner.nextInt());
        }

        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < y; i++) {
            b.add(scanner.nextInt());
        }

        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < z; i++) {
            c.add(scanner.nextInt());
        }

        List<Integer> topSums = computeTopSums(x, y, z, k, a, b, c);
        for (int sum : topSums) {
            System.out.println(sum);
        }
        
        scanner.close();
    }
}

