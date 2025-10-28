
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s001486412 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        double harmonicMean = calculateHarmonicMean(n, a);
        System.out.println(harmonicMean);
    }

    public static double calculateHarmonicMean(int n, List<Integer> a) {
        double below = 0.0;

        for (int i = 0; i < n; i++) {
            below += 1.0 / a.get(i);
        }

        return 1.0 / below;
    }
}

