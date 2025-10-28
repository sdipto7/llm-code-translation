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
        double below = 0.0;
        for (int i = 0; i < n; i++) {
            below += 1.0 / a.get(i);
        }
        System.out.println(1.0 / below);
        scanner.close();
    }
}
