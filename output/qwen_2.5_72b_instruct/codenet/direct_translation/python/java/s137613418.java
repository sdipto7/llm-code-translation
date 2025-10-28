import java.util.*;

public class s137613418 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(scanner.nextInt());
        }
        if (n == new HashSet<>(A).size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
